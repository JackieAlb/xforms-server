package com.primeton.xforms.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

//@Order(1)
//@ControllerAdvice(basePackages ="com.primeton.xforms.api")
public class XformsResponseBodyAdvice implements ResponseBodyAdvice {

	private String[] includes = {};
	private String[] excludes = {};
	private boolean encode = true;

	@Override
	public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType,
			Class aClass, ServerHttpRequest serverHttpRequest,
			ServerHttpResponse serverHttpResponse) {
		//重新初始化为默认值
        includes = new String[]{};
        excludes = new String[]{};
        encode = true;

        //判断返回的对象是单个对象，还是list，活着是map
        if(o==null){
            return null;
        }
        if(methodParameter.getMethod().isAnnotationPresent(SerializedField.class)){
            //获取注解配置的包含和去除字段
            SerializedField serializedField = methodParameter.getMethodAnnotation(SerializedField.class);
            includes = serializedField.includes();
            excludes = serializedField.excludes();
            //是否加密
            encode = serializedField.encode();
        }

        Object retObj = null;
        if (o instanceof List){
            //List
            List list = (List)o;
            retObj = handleList(list);
        }else{
            //Single Object
            retObj = handleSingleObject(o);
        }
        return retObj;		
	}

	private Object handleSingleObject(Object o) {
		Map<String,Object> map = new HashMap<String, Object>();

        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field:fields){
            //如果未配置表示全部的都返回
            if(includes.length==0 && excludes.length==0){
                String newVal = getNewVal(o, field);
                map.put(field.getName(), newVal);
            }else if(includes.length>0){
                //有限考虑包含字段
                if(Helper.isStringInArray(field.getName(), includes)){
                    String newVal = getNewVal(o, field);
                    map.put(field.getName(), newVal);
                }
            }else{
                //去除字段
                if(excludes.length>0){
                    if(!Helper.isStringInArray(field.getName(), excludes)){
                        String newVal = getNewVal(o, field);
                        map.put(field.getName(), newVal);
                    }
                }
            }

        }
        return map;
	}

	private String getNewVal(Object o, Field field) {
		String newVal = "";
        try {
            field.setAccessible(true);
            Object val = field.get(o);

            if(val!=null){
                if(encode){
                    newVal = Helper.encode(val.toString());
                }else{
                    newVal = val.toString();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return newVal;
	}

	private Object handleList(List list) {
		List retList = new ArrayList();
        for (Object o:list){
            Map map = (Map) handleSingleObject(o);
            retList.add(map);
        }
        return retList;
	}

	@Override
	public boolean supports(MethodParameter arg0, Class arg1) {
		return true;
	}

}

package com.primeton.xforms.api;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class FormTemplateBuilder {

	public String postTempalteKind() {
		return "success";
	}
	
	@ApiOperation(value="测试接口",notes="测试接口的详细描述")
	@RequestMapping(value="/show",method =RequestMethod.POST)
	public String show(
			@ApiParam(required=true,name="name",value="姓名")
			@RequestParam(name="name",required=true) 
			String name
			) {
		return name+",success";
	}
	
}

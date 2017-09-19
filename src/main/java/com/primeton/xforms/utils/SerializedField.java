package com.primeton.xforms.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SerializedField {

	/**
	 * 需要包含的字段
	 * @return
	 */
	String[] includes() default{};
	/**
	 * 需要排除的字段
	 * @return
	 */
	String[] excludes() default{};
	/**
	 * 数据是否要加密，默认为true
	 * @return
	 */
	boolean encode() default true;
}

package com.primeton.xforms.model;

import java.util.Map;

public class Result<T> {
	private int code;
	private String message;
	private T value;
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Map<String, Object> getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(Map<String, Object> extraInfo) {
		this.extraInfo = extraInfo;
	}

	private Map<String, Object> extraInfo;

	public Result(int code, String message, T value) {
		this(code, message, value, null);
	}

	public Result(int code, String message) {
		this(code, message, null);
	}

	public Result(int code, String message, T value, Map<String, Object> extraInfo) {
		this.code = code;
		this.message = message;
		this.value = value;
		this.extraInfo = extraInfo;
	}
}

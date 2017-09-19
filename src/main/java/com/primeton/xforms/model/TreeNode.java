package com.primeton.xforms.model;

import java.util.List;
import java.util.Map;

public class TreeNode {
	
	private String title;
	private Map<String, String> extraInfo;
	private boolean extend;
	private List<TreeNode> children;
	public Map<String, String> getExtraInfo() {
		return extraInfo;
	}
	public void setExtraInfo(Map<String, String> extraInfo) {
		this.extraInfo = extraInfo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isExtend() {
		return extend;
	}
	public void setExtend(boolean extend) {
		this.extend = extend;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	

}

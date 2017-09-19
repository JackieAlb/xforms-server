package com.primeton.xforms.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.primeton.xforms.model.TreeNode;

/**
 * build static tree
 * @author Jackie
 *
 */
public class TreeUtil {
	
	public static TreeNode buildTree(List<MetaKindEntity> metaKindEntities) {
		
		TreeNode treeNode = new TreeNode();
		
		for (MetaKindEntity metaKindEntity : metaKindEntities) {
			if (metaKindEntity.getId().equals(Constant.UUID_PARENT)) {
				treeNode.setTitle(metaKindEntity.getName());
				Map<String, String> extraInfo = new HashMap<>();
				extraInfo.put("id", metaKindEntity.getId());
				treeNode.setExtraInfo(extraInfo );
				treeNode.setExtend(true);
				build(metaKindEntity,metaKindEntities,treeNode);
				
			}
		}
		return treeNode;
		
	}

	private static void build(MetaKindEntity metaKindEntity, List<MetaKindEntity> metaKindEntities, TreeNode treeNode) {
		List<MetaKindEntity> children = getChildren(metaKindEntity,metaKindEntities);
		List<TreeNode> childrenNode = new ArrayList<>();
		if (!children.isEmpty()) {
			for (MetaKindEntity child : children) {
				TreeNode childNode = new TreeNode();
				childNode.setTitle(child.getName());
				Map<String, String> extraInfo = new HashMap<>();
				extraInfo.put("id", child.getId());
				childNode.setExtraInfo(extraInfo);
				childNode.setExtend(true);
				childrenNode.add(childNode);
				build(child, children, childNode);
				
			}
			if(childrenNode.size()!=0) {
				treeNode.setChildren(childrenNode);
			}
		}else {
			treeNode.setExtend(false);
		}
	}

	private static List<MetaKindEntity> getChildren(MetaKindEntity metaKindEntity, List<MetaKindEntity> metaKindEntities) {
		List<MetaKindEntity> children = new ArrayList<>();
		String id = metaKindEntity.getId();
		for (MetaKindEntity child : metaKindEntities) {
			if (child.getParentId().equals(id)) {
				children.add(child);
			}
		}
		return children;
	}

}

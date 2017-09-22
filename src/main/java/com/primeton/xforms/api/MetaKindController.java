package com.primeton.xforms.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.primeton.xforms.mapper.MetaKindMapper;
import com.primeton.xforms.model.Result;
import com.primeton.xforms.model.TreeNode;
import com.primeton.xforms.utils.MetaKindEntity;
import com.primeton.xforms.utils.TreeUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * 业务要素分类的对外api，数据需要初始化
 * @author Jackie
 *
 */
@RestController
@RequestMapping("/api")
@Api(value = "meta kind api")
public class MetaKindController {

	@Autowired
	MetaKindMapper metaKindMapper;

	@ApiOperation(value = "Get meta kind Tree list")
	@ApiResponses(value = {})
	@RequestMapping(value = "/metakind/treedata", method = RequestMethod.GET)
	public TreeNode getMetaKindTreeNode() {
		List<MetaKindEntity> metaKindEntities = new ArrayList<>();
		metaKindEntities = metaKindMapper.getMetaKind();
		return TreeUtil.buildTree(metaKindEntities);
	}
	
	@ApiOperation(value = "Get meta kind list")
	@ApiResponses(value = {})
	@RequestMapping(value = "/metakind", method = RequestMethod.GET)
	public MetaKindEntity[]  getMetaKinds() {
		List<MetaKindEntity> metaKindEntities = new ArrayList<>();
		metaKindEntities = metaKindMapper.getMetaKind();
		MetaKindEntity[] result = new MetaKindEntity[metaKindEntities.size()];
		int i=0;
		for (MetaKindEntity metaKindEntity : metaKindEntities) {
			result[i++] = metaKindEntity;
		}
		return result;
//		Result r = new Result<>(1, "success", metaKindEntities);
//		return new ResponseEntity<>(r,HttpStatus.OK);
	}

	@ApiOperation(value = "Insert a meta kind entity to DB")
	@ApiResponses({ @ApiResponse(code = 200, message = "插入数据成功"), @ApiResponse(code = 400, message = "无效的参数对象") })
	@RequestMapping(value = "/metakind", method = RequestMethod.POST)
	public ResponseEntity<Result> insertMetaKind(
			@ApiParam(value = "元数据类别", required = true) @Valid @RequestBody MetaKindEntity metaKind) {
		//use uuid as a primary key 
		metaKind.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		
		int cnt = metaKindMapper.insert(metaKind);
		ResponseEntity<Result> response;
		if (cnt > 0)
			response = new ResponseEntity<Result>(new Result(cnt, "success"), HttpStatus.OK);
		else
			response = new ResponseEntity<Result>(new Result(cnt, "fail"), HttpStatus.OK);
		return response;

	}

	@ApiOperation(value = "Update a meta kind entity")
	@ApiResponses({ @ApiResponse(code = 200, message = "更新数据成功"), @ApiResponse(code = 400, message = "无效的参数对象") })
	@RequestMapping(value = "/metakind", method = RequestMethod.PUT)
	public ResponseEntity<Result> updateMetaKind(
			@ApiParam(value = "元数据类别", required = true) @Valid @RequestBody MetaKindEntity metaKind) {
		int cnt = metaKindMapper.update(metaKind);
		ResponseEntity<Result> response;
		if (cnt > 0)
			response = new ResponseEntity<Result>(new Result(cnt, "success"), HttpStatus.OK);
		else
			response = new ResponseEntity<Result>(new Result(cnt, "fail"), HttpStatus.OK);
		return response;

	}

	@ApiOperation(value = "Delete a meta kind entity")
	@ApiResponses({ @ApiResponse(code = 200, message = "删除数据成功"), @ApiResponse(code = 400, message = "无效的参数对象") })
	@RequestMapping(value = "/metakind/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Result> deleteMetaKind(
			@ApiParam(value = "元数据类别标识", required = true) @PathVariable("id") String id) {
		int cnt = metaKindMapper.delete(id);
		ResponseEntity<Result> response;
		if (cnt > 0)
			response = new ResponseEntity<Result>(new Result(cnt, "success"), HttpStatus.OK);
		else
			response = new ResponseEntity<Result>(new Result(cnt, "fail"), HttpStatus.OK);
		return response;

	}

}

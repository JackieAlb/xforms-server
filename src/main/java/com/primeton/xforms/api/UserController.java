package com.primeton.xforms.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.primeton.xforms.mapper.UserMapper;
import com.primeton.xforms.model.Result;
import com.primeton.xforms.model.UserEntity;
import com.primeton.xforms.utils.DesUtil;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserMapper userMapper;

	@ApiOperation(value = "user auth")
	@ApiResponses(value = {})
	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public ResponseEntity<Result> authUser(@ApiParam(value = " A user object be needs to auth ", required = true)@Valid @RequestBody UserEntity user) {
		String userId = user.getUserId();
		String password;
		try {
			password = DesUtil.encrypt(user.getPassword());
			int cnt = userMapper.authUser(userId, password);
			if (cnt>0) {
				return new ResponseEntity<Result>(new Result(1,"Login success!"),HttpStatus.OK);
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Result>(new Result(2,"Login fail!"),HttpStatus.OK);
	}

	@ApiOperation(value = "Insert a user")
	@ApiResponses(value = {})
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ResponseEntity<Result> insertUser(
			@ApiParam(value = "A user object be needs", required = true) @Valid @RequestBody UserEntity user) {
		try {
			user.setPassword(DesUtil.encrypt(user.getPassword()));
			userMapper.insert(user);
			return new ResponseEntity<Result>(new Result(1,"Insert User success!"),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Result>(new Result(2,"Insert User  fail!"),HttpStatus.OK);
	}
}

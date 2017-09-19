package com.primeton.xforms.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.primeton.xforms.model.UserEntity;

public interface UserMapper {
	@Select("select count(1) cnt from x_users where user_id=#{userId} and password=#{password}")
	@Results({ @Result(property = "count", column = "cnt") })
	public int authUser(@Param("userId") String userId, @Param("password") String password);

	@Insert("insert into x_users(user_id,user_name,password) values(#{userId},#{userName},#{password})")
	void insert(UserEntity user);

}

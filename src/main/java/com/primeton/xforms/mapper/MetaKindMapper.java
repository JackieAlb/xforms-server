package com.primeton.xforms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.primeton.xforms.utils.MetaKindEntity;

public interface MetaKindMapper {
	@Select("select * from x_meta_kind ")
	@Results({ @Result(property = "id", column = "meta_kind_id"), @Result(property = "name", column = "meta_kind_name"),
			@Result(property = "description", column = "meta_kind_desc"),
			@Result(property = "parentId", column = "meta_kind_parent_id") })
	public List<MetaKindEntity> getMetaKind();

	@Insert("INSERT INTO public.x_meta_kind(" + "	meta_kind_id, meta_kind_name, meta_kind_desc, meta_kind_parent_id)"
			+ "	VALUES (#{id}, #{name}, #{description}, #{parentId})")
	public int insert(MetaKindEntity metaKind);

	@Update("UPDATE public.x_meta_kind"
			+ "	SET meta_kind_name=#{name}, meta_kind_desc=#{description}, meta_kind_parent_id=#{parentId}"
			+ "	WHERE meta_kind_id=#{id}")
	public int update(MetaKindEntity metaKind);

	@Delete("delete from public.x_meta_kind where meta_kind_id=#{id}")
	public int delete(String id);

}

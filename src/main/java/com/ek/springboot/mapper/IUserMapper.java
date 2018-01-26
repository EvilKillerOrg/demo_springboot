package com.ek.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ek.springboot.pojo.User;

@Mapper
public interface IUserMapper {

	/* 查询所有用户 */
	public List<User> findAll();
}

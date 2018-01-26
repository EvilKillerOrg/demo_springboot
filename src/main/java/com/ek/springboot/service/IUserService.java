package com.ek.springboot.service;

import java.util.List;

import com.ek.springboot.pojo.User;

public interface IUserService {
	/* 查询所有用户 */
	public List<User> findAll();
}

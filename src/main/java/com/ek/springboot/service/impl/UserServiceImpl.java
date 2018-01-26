package com.ek.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ek.springboot.mapper.IUserMapper;
import com.ek.springboot.pojo.User;
import com.ek.springboot.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	// 注入Mapper接口代理对象
	@Autowired
	private IUserMapper userMapper;

	@Override
	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;
	}

}

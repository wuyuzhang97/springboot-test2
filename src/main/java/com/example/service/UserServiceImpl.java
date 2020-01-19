package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.dao.UserMapper;
import com.example.pojo.User;
@Service
@Transactional
public class UserServiceImpl  implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userMapper.getAll();
	}
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.delete(id);
	}
	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.getById(id);
	}
	@Override
	public int modifyById(User user) {
		// TODO Auto-generated method stub
		return userMapper.modifyById(user);
	}

}

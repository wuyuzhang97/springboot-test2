package com.example.service;

import java.util.List;

import com.example.pojo.User;

public interface UserService {
	void insert (User user);
	List<User> getAll();
	int delete(Integer id);
	User getById(Integer id);
	int modifyById(User user);
}

package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.User;

public interface UserMapper {
	void insert (User user);
	List<User> getAll();
	int delete(@Param("id") Integer id);
	User getById(@Param("id") Integer id);
	int modifyById(User user);
}

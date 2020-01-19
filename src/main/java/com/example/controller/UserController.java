package com.example.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.example.pojo.User;
import com.example.service.UserService;
import com.example.util.JackonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	//去添加页面的方法
	@RequestMapping("/toinsert")
	public String toinsert() {
		return "list";
	}
	//添加用户的方法
	@RequestMapping("/add")
	public String toadd(User user) {
		userService.insert(user);
		return "redirect:/user/list";
	}
	//查询的方法
	@RequestMapping("/list")
	public String list() {
		Page<Object> startPage = PageHelper.startPage(1,3);
		List<User> list = userService.getAll();
		//map.put("list", list);
		 ObjectMapper mapper = new ObjectMapper();
		 String json="";
	        try {
	            json = mapper.writeValueAsString(startPage);
	            //System.out.println("转换为JSON : " + json);
	        } catch (JsonProcessingException e) {
	            e.printStackTrace();
	        }
		return json;
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") Integer id) {
		int i = userService.delete(id);
		if(i==1) {
			return "redirect:/user/list";
		}else {
			return "list";
		}
	}
	@RequestMapping("/toupdate")
	public String toupdate(@RequestParam("id") Integer id,
							Model model) {
		User user = userService.getById(id);
		model.addAttribute("user", user);
		return "update";	
	}
	@RequestMapping("/update")
	public String update(User user) {
		int i = userService.modifyById(user);
		if(i==1) {
			return "redirect:/user/list";
		}else {
			return "update";
		}
	}
	@RequestMapping("/todate")
	public String todate(Model model) {
		model.addAttribute("keys", new Date());
		return "success";
	}
	
	@GetMapping("/getAll")
	public List<User> getAll() {
		List<User> all = userService.getAll();
		return all;
	}
	@RequestMapping("/date")
	public String getDate() {
		User user=new User();
		user.setDate(new Date());
		return JackonUtil.jacksontoString(user);
	}
	
}

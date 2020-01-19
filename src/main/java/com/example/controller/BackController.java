package com.example.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Source_goods;
import com.example.service.Source_goodsService;
import com.example.util.JackonUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@RestController
public class BackController {
	@Resource
	private  Source_goodsService source_goodsService;
	@ResponseBody
	@RequestMapping("/list")
	public String list(@RequestParam(value="pageIndex",defaultValue="1",required=false ) Integer pageIndex,
			@RequestParam(value="pageSize",defaultValue="5",required=false ) Integer pageSize) {
		
		Page<Object> pages = PageHelper.startPage(pageIndex, pageSize);
		List<Source_goods> selectAll = source_goodsService.selectAll();
		return JackonUtil.jacksontoString(selectAll);
	}
}


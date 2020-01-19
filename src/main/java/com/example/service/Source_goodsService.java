package com.example.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Source_goods;

public interface Source_goodsService {
	int insert(Source_goods record);

    List<Source_goods> selectAll();
    
    public  int delete(String ids);
    
    int modify(Source_goods source_goods);
    
    int updateStatus(String ids);
    
    
}

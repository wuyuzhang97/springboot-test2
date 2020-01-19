package com.example.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Source_goods;



public interface Source_goodsMapper {
  public  int insert(Source_goods record);
  public  List<Source_goods> selectAll();
  public  int delete(@Param("ids") String ids);
  public  int modify(Source_goods source_goods);
  public int updateStatus(@Param("ids")String ids);
}
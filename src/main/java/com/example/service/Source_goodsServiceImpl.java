package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.example.dao.Source_goodsMapper;
import com.example.pojo.Source_goods;
@Service
public class Source_goodsServiceImpl implements Source_goodsService {
	@Resource
	private Source_goodsMapper source_goodsMapper;
	@Override
	public int insert(Source_goods record) {
		// TODO Auto-generated method stub
		return source_goodsMapper.insert(record);
	}
	@Override
	public List<Source_goods> selectAll() {
		// TODO Auto-generated method stub
		return source_goodsMapper.selectAll();
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		return source_goodsMapper.delete(ids);
	}

	@Override
	public int modify(Source_goods source_goods) {
		// TODO Auto-generated method stub
		return source_goodsMapper.modify(source_goods);
	}

	@Override
	public int updateStatus(String ids) {
		// TODO Auto-generated method stub
		return source_goodsMapper.updateStatus(ids);
	}


}

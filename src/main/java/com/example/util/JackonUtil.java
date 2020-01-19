package com.example.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.ibatis.annotations.One;

import com.example.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JackonUtil {
	//将java对象转换为json字符串
	public static String jacksontoString(Object obj) {
		 ObjectMapper mapper = new ObjectMapper();
		 String json="";
		  try {
			json = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}
	//将json字符串转换为java对象
	public static Object jackontoObject(String json,Object obj){
		ObjectMapper mapper = new ObjectMapper();
		Object object = null;
		try {
			 object = mapper.readValue(json, obj.getClass());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	public static int method(int []arrays,int num) {
		int low=0;
		int height=arrays.length-1;
		while(low<height||low==height) {
			int midle=(height+low)/2;
			if(num<arrays[midle]) {
				height=midle-1;
			}
			if(num>arrays[midle]) {
				low=midle+1;
			}
			if(num==arrays[midle]) {
				return midle;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arrays= {1,2,3,4,5,6,7};
		System.out.println(method(arrays, 2));
	}
}


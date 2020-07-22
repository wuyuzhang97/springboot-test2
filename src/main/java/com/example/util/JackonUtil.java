package com.example.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

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
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 1.线程服务提供者（线程池大小与主机核心默认是一样的）
        ExecutorService executor = Executors.newWorkStealingPool();
        // 2.可回调的线程的列表
        Mythread server1 = new Mythread(2, 25000);
        Mythread server2 = new Mythread(25001, 50000);
        Mythread server3 = new Mythread(50001, 75000);
        Mythread server4 = new Mythread(75001, 100000);
        List<Callable<Integer>> list = Arrays.asList(server1, server2, server3, server4);
        
        // 3.批量执行所有的线程
        
        Integer collect = executor.invokeAll(list)
                .stream()
                .map(future -> {
                    Integer sum = 0;
                    try {
                        sum = future.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    return sum;
                }).collect(Collectors.summingInt(Integer::intValue));
        System.out.println("素数的数量 : " + collect);
		
		 
	
	}
	//判断一个属是否为质数
	public static boolean isNum(int num) {
		boolean flag=true;
		if(num<=1) {
			flag= false;
			return flag;
		}
		if(num==2) {
			return flag;
		}
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				flag= false;
				break;
			}
		}
		return flag;
	}
}


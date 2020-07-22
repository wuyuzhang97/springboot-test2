package com.example;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.pojo.User;
import com.example.service.UserService;
import com.example.util.JackonUtil;
import com.example.util.Mythread;

@SpringBootTest
class SpringbootTest2ApplicationTests {
  @Autowired
  private UserService userService;
	@Test
	void contextLoads() throws InstantiationException, IllegalAccessException {
		String jsonString= "{\"id\":\"1\",\"name\":\"张三\",\"password\":\"123\"}";
		User object = (User)JackonUtil.jackontoObject(jsonString, User.class.newInstance());
		System.out.println(object);
	}
	@Test
	void test01(){
		int []arrays= {9,4,7,2,30,1};
		for (int i = 0; i < arrays.length-1; i++) {
			for (int j = 0; j < arrays.length-1-i; j++) {
				if(arrays[j]>arrays[j+1]) {
					int temp=arrays[j];
					arrays[j]=arrays[j+1];
					arrays[j+1]=temp;
				}
			}
		}
		for (int i : arrays) {
			System.out.println(i);
		}
	}
	@Test
	public void test02() {
		
		
	}
	

}

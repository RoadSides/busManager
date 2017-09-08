package com.neusoft.busManager.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neusoft.busManager.admin.model.UserModel;
import com.neusoft.busManager.admin.service.IUserService;


public class TestUser {
	

	
	public static void main(String[] args) throws Exception {
		ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
		
		IUserService userService=ac.getBean("UserService", IUserService.class);
		
		
		
		UserModel user=new UserModel();
		
		user.setUserid("111");
		user.setPassword("123");
		user.setName("牛嘟嘟");
		userService.add(user);
	}
}

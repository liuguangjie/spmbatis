package com.ssm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.mapper.UserMapper;
import com.ssm.po.User;

public class testUserService {
	@Test
	public void test1() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper=ac.getBean(UserMapper.class);
		User user=userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
}

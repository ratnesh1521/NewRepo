package com.ratnesh.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.beans.User;

public class Test {
	public static void main(String[] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User)context.getBean("user");
		System.out.println(user.wish());
		context.start();
		context.stop();
		context.close();
	}
}

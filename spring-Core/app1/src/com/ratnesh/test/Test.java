package com.ratnesh.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.beans.WelcomeBean;

public class Test {

	public static void main(String[] args)throws Exception {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	WelcomeBean wb = (WelcomeBean)context.getBean("welcomeBean");
	wb.sayHello();

	}

}

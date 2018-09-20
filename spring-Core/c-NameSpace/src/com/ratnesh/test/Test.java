package com.ratnesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.beans.Employee;

public class Test {

	public static void main(String[] args) {
      
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee)context.getBean("empBean");
		emp.geEmployeetDetails();
	}

}

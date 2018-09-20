package com.ratnesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.beans.EmployeeBean;

public class Test {
	public static void main(String[] ars){
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeBean emp = (EmployeeBean)context.getBean("empBean");
	emp.getEmployeeDetails();
}
}
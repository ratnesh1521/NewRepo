package com.ratnesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.employeeServices.EmployeeService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
		EmployeeService empService = (EmployeeService)context.getBean("empBean");
		empService.getEmployeeDetails();
	}
}

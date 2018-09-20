package com.ratnesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.beans.Student;

public class Test {
	public void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student std = (Student)context.getBean("studentBean");
		std.getStudentDetails();
	}
}

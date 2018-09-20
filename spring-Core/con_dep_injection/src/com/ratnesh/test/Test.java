package com.ratnesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.beans.StudentBean;

public class Test {

	public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 StudentBean student = (StudentBean)context.getBean("stdBean");
	 student.getStudentDetails();
	 
	}

}

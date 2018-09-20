package com.ratnesh.test;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.ratnesh.beans.User;
import com.ratnesh.validator.Validation;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User)context.getBean("user");
		user.getUserDetails();
		
		HashMap<String,String> map = new HashMap<String,String>();
		MapBindingResult result = new MapBindingResult(map, "com.ratnesh.beans.User");
		
		Validation val = (Validation)context.getBean("validate");
		val.validate(user, result);
		
		List<ObjectError> list = result.getAllErrors();
		for(ObjectError err:list)
		{
			System.out.println(err.getDefaultMessage());
		}

	}

}

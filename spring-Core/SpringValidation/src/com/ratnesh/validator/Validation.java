package com.ratnesh.validator;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ratnesh.beans.User;

public class Validation implements Validator {
    Resource resource;
    
	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public boolean supports(Class type) {
		return User.class.equals(type);
	}

	@Override
	public void validate(Object user, Errors error) {
		
		User u = (User)user;
		Properties pro = null;;
		try {
			pro = PropertiesLoaderUtils.loadProperties(resource);
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		if(u.getUname()== null || u.getUname().equals(""))
		{
			error.rejectValue("uname", "username.err.required", pro.getProperty("username.err.required"));
			
		}
		if(u.getUpwd()== null || u.getUpwd().equals(""))
		{
			error.rejectValue("upwd", "upwd.err.required", pro.getProperty("upwd.err.required"));	
		}
		else
		{
			if(u.getUpwd().length()<=6 || u.getUpwd().length()>=10)
			{
				error.rejectValue("upwd", "upwd.err.invalid", pro.getProperty("upwd.err.invalid"));
			}
			
		}
		if(u.getAge()== null || u.getAge().equals(""))
		{
			error.rejectValue("uage", "uage.err.required", pro.getProperty("uage.err.required"));	
		}
		else
		{
			int age  = Integer.parseInt(u.getAge());
			if(age<18 || age>25)
			{
				error.rejectValue("uage", "uage.err.invalid", pro.getProperty("uage.err.invalid"));	
			}
		}
		if(u.getUemail()== null || u.getUemail().equals(""))
		{
			error.rejectValue("uemail", "uemail.err.required", pro.getProperty("uemail.err.required"));	
		}
		else
		{
			if(!u.getUemail().endsWith("@gmail.com"))
			{
				error.rejectValue("uemail", "uemail.err.invalid", pro.getProperty("uemail.err.invalid"));		
			}
		}
		if(u.getUmob()== null || u.getUmob().equals(""))
		{
			error.rejectValue("umob", "umob.err.required", pro.getProperty("umob.err.required"));	
		}
		else
		{
			if(!u.getUmob().startsWith("91"))
			{
				error.rejectValue("umob", "umob.err.invalid", pro.getProperty("umob.err.invalid"));		
			}
		}

	}

}

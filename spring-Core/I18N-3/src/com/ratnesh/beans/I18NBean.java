package com.ratnesh.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class I18NBean {
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource){
		this.messageSource = messageSource;
	}
	
	public void displayMessage(){
		System.out.println("Message :"+messageSource.getMessage("welcome",null, Locale.US));
	}
		
}

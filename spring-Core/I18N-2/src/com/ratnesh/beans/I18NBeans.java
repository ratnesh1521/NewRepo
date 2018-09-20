package com.ratnesh.beans;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class I18NBeans {
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource){
		this.messageSource = messageSource;
	}
	
	public void displayMessage(){
		System.out.println("Message :"+messageSource.getMessage("welcome", new Object[]{"en", "US"},Locale.US));
		System.out.println("Message :"+messageSource.getMessage("welcome", new Object[]{"it", "ITALY"},Locale.ITALY));
	}
}

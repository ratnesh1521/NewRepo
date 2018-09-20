package com.ratnesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.beans.I18NBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		I18NBean bean = (I18NBean)context.getBean("i18n");
		bean.displayMessage();

	}

}

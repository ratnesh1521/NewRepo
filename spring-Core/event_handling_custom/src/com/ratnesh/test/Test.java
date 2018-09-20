package com.ratnesh.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.beans.Account;

public class Test {

	public static void main(String[] args)throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Account  account = (Account)context.getBean("account");
		account.createAccount();
		account.searchAccount();
		account.updateAccount();
		account.deleteAccount();

	}

}

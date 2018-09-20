package com.ratnesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.beans.CurrentAccountImpl;
import com.ratnesh.beans.SavingsAccountImpl;
import com.ratnesh.factory.AccountFactory;

public class Test {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountFactory savingsAccountFactory = (AccountFactory)context.getBean("savingsAccountFactory");
		
		
		SavingsAccountImpl savings_Account = (SavingsAccountImpl)savingsAccountFactory.getAccount();
		savings_Account.create();
		savings_Account.search();
		savings_Account.update();
		savings_Account.delete();
		System.out.println();
		
		AccountFactory currentAccountFactory = (AccountFactory)context.getBean("applicationContext.xml");
		CurrentAccountImpl current_Account = (CurrentAccountImpl)currentAccountFactory.getAccount();
		current_Account.create();
		current_Account.search();
		current_Account.update();
		current_Account.delete();
		
	}
}

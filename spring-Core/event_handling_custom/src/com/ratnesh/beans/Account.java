package com.ratnesh.beans;

import com.ratnesh.events.AccountEventPublisher;

public class Account {
	private AccountEventPublisher publisher;
	
	public void setPublisher(AccountEventPublisher publisher){
		this.publisher = publisher;
	}
	public void createAccount(){
		System.out.println("Account Created");
		publisher.publish("account created");
	}
	public void searchAccount(){
		System.out.println("Account Identified");
		publisher.publish("Account Iden");
	}
	public void updateAccount(){
		System.out.println("Account Updated");
	}
	public void deleteAccount(){
		System.out.println("Account Deleted");
	}
}

package com.ratnesh.services;

import com.ratnesh.dto.Account;

public interface AccountService {
	public String createAccount(String accNo, String accName,String accType,int balance);
	public String searchAccount(String accNo);
	public Account getAccount(String accNo);
	public String updateAccount(String accNo,String accName,String accType,int balance);
	public String deleteAccount(String accNo);
	

}

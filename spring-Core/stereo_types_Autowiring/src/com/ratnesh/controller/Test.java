package com.ratnesh.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ratnesh.dto.Account;
import com.ratnesh.services.AccountService;

public class Test {


	public static void main(String[] args)throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accService = (AccountService)context.getBean("accService");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.println("Account Operation Menu");
			System.out.println("------------------------");
			System.out.println("1.Create Account");
			System.out.println("2.Search Account");
			System.out.println("3.Update Account");
			System.out.println("4.Delete Account");
			System.out.println("5.Exit");
			System.out.println("Your Option :");
			
			int option = Integer.parseInt(br.readLine());
			String status = "";
			String accNo = "", accName = "", accType = "";
			int balance = 0;
			
			switch(option){
			case 1:
			System.out.print("Account No:");	
			accNo = br.readLine();
			System.out.print("Account Name:");
			accName = br.readLine();
			System.out.print("Account Type:");
			accType = br.readLine();
			System.out.print("Balance :");
			balance = Integer.parseInt(br.readLine());
			
			status = accService.createAccount(accNo, accName, accType, balance);
			if(status.equals("success")){
				System.out.println("Account Created Successfully");
			}
			if(status.equals("existed")){
				System.out.println("Account existed already");
			}
			if(status.equals("failure")){
				System.out.println("Account creation failure");
			}
			break;
			
			case 2:
				System.out.print("Account No:");
				accNo = br.readLine();
				status = accService.searchAccount(accNo);
				System.out.println("Account status:"+status);
				break;
			case 3:
				System.out.println("Account No :");
				accNo = br.readLine();
				Account acc = accService.getAccount(accNo);
				if(acc == null){
					System.out.println("Status : Account not existed");
				}else{
					Account acc_new = new Account();
					acc_new.setAccNo(accNo);
					System.out.println("Account Name : old value: "+acc.getAccName()+" New value :");
					String accName_new = br.readLine();
					if(accName_new==null || accName_new.equals("")){
						acc_new.setAccName(acc.getAccName());
					}else{
						acc_new.setAccName(accName_new);
					}
					System.out.println("Account Type : Old value : "+acc.getAccType()+" New value:");
					String accType_new = br.readLine();
					if(accType_new==null || accType_new.equals("")){
						acc_new.setAccType(acc.getAccType());
					}else{
						acc_new.setAccType(accType_new);
					}
					System.out.println("Account balance : Old values : "+acc.getBalance()+" New value : ");
					String bal = br.readLine();
					if(bal == null || bal.equals("")){
						acc_new.setBalance(acc.getBalance());
					}else{
						int balance_new = Integer.parseInt(bal);
						acc_new.setBalance(balance_new);
					}
					status = accService.updateAccount(accNo, accName_new, accType, balance);
					if(status.equals("success")){
						System.out.println("Account updated successfully");
					}if(status.equals("failure")){
						System.out.println("Updation failure");
					}
				}
				break;
			case 4:
				System.out.println("Account No : ");
				accNo = br.readLine();
				status = accService.deleteAccount(accNo);
				if(status.equals("success")){
					System.out.println("Account deleted successfully");
				}if(status.equals("notexisted")){
					System.out.println("Account not existed");
				}if(status.equals("failure")){
					System.out.println("Account deletion failure");
				}
				
				break;
			case 5:
				System.out.println("***Thank you for using Account App***");
				System.exit(0);
				break;
			default:
				System.out.println("Choose from 1,2,3,4 and 5");
				break;
			}
			
		}
		
	}

}

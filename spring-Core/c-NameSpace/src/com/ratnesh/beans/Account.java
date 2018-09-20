package com.ratnesh.beans;

public class Account {
	private String accNo;
	private String accName;
	private int  accBal;
	public Account(String accNo, String accName, int accBal) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	public String toString(){
		return "[Account No:"+accNo+",Account Name:"+accName+",Account Balance:"+accBal+"]";
		
	}

}

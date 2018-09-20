package com.ratnesh.beans;

public class Employee {
	private String eid;
	private String ename;
	private String esal;
	private Account acc;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void getEmployeeDetails(){
		System.out.println("Employee Details");
		System.out.println("--------------------");
		System.out.println("Employee Id    :"+eid);
		System.out.println("Employee Name  :"+ename);
		System.out.println("Employee Salary:"+esal);
		System.out.println();
		System.out.println("Employee Salary Details");
		System.out.println("Account No.   :"+acc.getAccNo());
		System.out.println("Account Name  :"+acc.getAccName());
		System.out.println("Account Type  :"+acc.getAccType());
		
	}
}

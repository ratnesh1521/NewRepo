package com.ratnesh.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String eno;
	private String ename;
	private float esal;
	@Autowired(required=true)
	private Account acc;
	@Autowired(required=true)
	private Address addr;
	
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void getEmployeeDetails(){
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee Id     :"+eno);
		System.out.println("Employee Name   :"+ename);
		System.out.println("Employee Salary :"+esal);
		
		System.out.println();
		System.out.println("Employee Account Details");
		System.out.println("------------------------------");
		System.out.println("Account No. :"+acc.getAccNo());
		System.out.println("Account Name:"+acc.getAccName());
		System.out.println("Account Type:"+acc.getAccType());
		System.out.println("Account Balance:"+acc.getAccBal());
		
		
		System.out.println();
		System.out.println("Employee Address:");
		System.out.println("---------------------");
		System.out.println("House No.:"+addr.getHno());
		System.out.println("Street   :"+addr.getStreet());
		System.out.println("Town     :"+addr.getTown());
		System.out.println("District :"+addr.getDist());
		System.out.println("State    :"+addr.getState());
		
		
	}
}

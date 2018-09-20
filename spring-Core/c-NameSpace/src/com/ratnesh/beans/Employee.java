package com.ratnesh.beans;


public class Employee {
	private String eid;
	private String ename;
	private float esal;
	private Account acc;
	public Employee(String eid, String ename, float esal, Account acc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.acc = acc;
	}
	
	public void geEmployeetDetails(){
		System.out.println("Employee Details");
		System.out.println("--------------------");
		System.out.println("Employee Id    :"+eid);
		System.out.println("Employee Name  :"+ename);
		System.out.println("Employee Salary:"+esal);
		System.out.println();
		System.out.println("Account deatils");
		System.out.println("-----------------------");
		System.out.println(acc.toString());
	}
}

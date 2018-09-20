package com.ratnesh.beans;

public class EmployeeBean {
	private String eid;
	private String ename;
	private String esal;
	private String eaddr;
	
	public String geteid() {
		return eid;
	}
	public void seteid(String eid) {
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
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	public void getEmployeeDetails(){
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee Id     :"+eid);
		System.out.println("Employee Name   :"+ename);
		System.out.println("Employee Salary :"+esal);
		System.out.println("Employee Address:"+eaddr);
	}
}

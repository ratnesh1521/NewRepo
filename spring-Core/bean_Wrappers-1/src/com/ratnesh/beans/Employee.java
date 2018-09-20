package com.ratnesh.beans;

public class Employee {
	private int eno;
	private String ename;
	private String eaddr;
	private float esal;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	
	public void getEmpDetails(){
		System.out.println("Employee Details");
		System.out.println("------------------");
		System.out.println("Employee No     :"+eno);
		System.out.println("Employee Name   :"+ename);
		System.out.println("Employee Address:"+eaddr);
		System.out.println("Employee Salary :"+esal);
	}
}

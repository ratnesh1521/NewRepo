package com.ratnesh.beans;

public class Employee {

	private int eid;
	private String ename;
	private float esal;
	private EmployeeAddress eaddr;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public EmployeeAddress getEaddr() {
		return eaddr;
	}
	public void setEaddr(EmployeeAddress eaddr) {
		this.eaddr = eaddr;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("Employee Deatils");
		System.out.println("---------------------");
		System.out.println("Employee ID     : "+eid);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Employee salary : "+esal);
		System.out.println("Employee Address");
		System.out.println("--------------------");
		System.out.println("Employee District  : "+eaddr.getDist());
		System.out.println("Employee state     : "+eaddr.getState());
		System.out.println("Employee Country   : "+eaddr.getCountry());
		System.out.println("Employee Continent : "+eaddr.getContinent());
		System.out.println("Employee Planet    : "+eaddr.getPlanet());
		System.out.println("Employee Galaxy    : "+eaddr.getGalaxy());
	}
	
}

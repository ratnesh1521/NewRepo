package com.ratnesh.beans;

public class Student {
	private int sid;
	private String sname;
	private String saddr;
	private float sage;
	private StudentCourse scourse;
	
	
	public float getSage() {
		return sage;
	}
	public void setSage(float sage) {
		this.sage = sage;
	}
	public StudentCourse getScourse() {
		return scourse;
	}
	public void setScourse(StudentCourse scourse) {
		this.scourse = scourse;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	
	public void getStudentDetails(){
		System.out.println("Student Details");
		System.out.println("-----------------");
		System.out.println("Student ID     :"+sid);
		System.out.println("Student Name   :"+sname);
		System.out.println("Student Address:"+saddr);
		System.out.println("Student age    :"+sage);
		System.out.println();
		System.out.println("Student Course Details");
		System.out.println("--------------------");
		System.out.println("course Id  :"+scourse.getCid());
		System.out.println("course Name:"+scourse.getCname());
		System.out.println("course cost:"+scourse.getCost());
	}
	
}
package com.ratnesh.beans;

public class StudentBean {
	private String sid;
	private String sname;
	private String saddr;
	
	public StudentBean(String sid, String sname, String saddr) {
		this.sid=sid;
		this.sname=sname;
		this.saddr=saddr;
	}
	public void getStudentDetails(){
		System.out.println("Student Details");
		System.out.println("=======================");
		System.out.println("SID\tNAME\tADDRESS");
		System.out.print(sid+"\t");
		System.out.print(sname+"\t");
		System.out.println(saddr);
	}
	
}

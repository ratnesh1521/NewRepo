package com.ratnesh.beans;

public class User {

	private String uname;
	private String upwd;
	private String age;
	private String uemail;
	private String umob;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmob() {
		return umob;
	}
	public void setUmob(String umob) {
		this.umob = umob;
	}
	
	public void getUserDetails()
	{
		System.out.println("User Details");
		System.out.println("--------------");
		System.out.println("Username     : "+uname);
		System.out.println("Password     : "+upwd);
		System.out.println("User Age     : "+age);
		System.out.println("User Email   : "+uemail);
		System.out.println("User Mobile  : "+umob);
		
		
	}
	
}

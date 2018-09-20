package com.ratnesh.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserService {

	Connection con;
	Statement st;
	ResultSet rs;
	String status = "";
	public UserService() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "data");
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String checkLogin(String uname, String upwd){
		try {
			rs = st.executeQuery("select * from reg_users where uname='"+uname+"'and upwd='"+upwd+"'");
			boolean b = rs.next();
			if(b==true){
				status = "success";
			}else{
				status = "failure";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}

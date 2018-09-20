package com.ratnesh.employeeServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class EmployeeService {
	private String driver_class;
	private String driver_url;
	private String db_user_name;
	private String db_pwd;
	
	Connection con;
	Statement st;
	
	public String getDriver_class() {
		return driver_class;
	}
	public void setDriver_class(String driver_class) {
		this.driver_class = driver_class;
	}
	public String getDriver_url() {
		return driver_url;
	}
	public void setDriver_url(String driver_url) {
		this.driver_url = driver_url;
	}
	public String getDb_user_name() {
		return db_user_name;
	}
	public void setDb_user_name(String db_user_name) {
		this.db_user_name = db_user_name;
	}
	public String getDb_pwd() {
		return db_pwd;
	}
	public void setDb_pwd(String db_pwd) {
		this.db_pwd = db_pwd;
	}
	
	public void getEmployeeDetails(){
		
		try {
			con = DriverManager.getConnection(driver_url,db_user_name,db_pwd);
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp1");
			ResultSetMetaData rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			System.out.println("Emplopyee Details");
			System.out.println("----------------------");
			for(int i =1;i<=cols;i++)
			{
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println();
			System.out.println("-----------------------------");
			while(rs.next()){
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getFloat(3)+"\t");
				System.out.println(rs.getString(4)+"\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

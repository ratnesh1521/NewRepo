package com.ratnesh.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ratnesh.dtos.StudentTo;
import com.ratnesh.factories.ConnectionFactory;

public class StudentDaoImpl implements StudentDao {

	String status = "";
	@Override
	public String insert(StudentTo sto) {
		try {
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from student where sid=?");
			pst.setString(1, sto.getSid());
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true){
				status = "existed";
			}else{
				pst = con.prepareStatement("insert into student values(?,?,?)");
				pst.setString(1, sto.getSid());
				pst.setString(2, sto.getSname());
				pst.setString(3, sto.getSaddr());
				pst.executeUpdate();
				
				status = "success";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}
	
	@Override
	public StudentTo search(String sid) {
		
		Connection con = null;
		StudentTo sto = null;
		try {
			con = ConnectionFactory.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from student where sid=?");
			pst.setString(1, sid);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true){
				sto =new StudentTo();
				sto.setSid(rs.getString("SID"));
				sto.setSname(rs.getString("SNAME"));
				sto.setSaddr(rs.getString("SADDR"));
			}else{
				sto = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sto;
		
	}

	@Override
	public StudentTo getStudent(String sid) {
		Connection con;
		StudentTo sto = null;
		try {
			con = ConnectionFactory.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from student where sid=?");
			pst.setString(1, sid);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true){
				sto = new StudentTo();
				sto.setSid(rs.getString(sid));
				sto.setSname(rs.getString("sname"));
				sto.setSaddr(rs.getString("saddr"));
			}else{
				sto = null;
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sto;
	}

	@Override
	public String update(StudentTo sid) {
		Connection con;
		StudentTo sto = new StudentTo();
		try {
			con = ConnectionFactory.getConnection();
			PreparedStatement pst = con.prepareStatement("update student set SNAME=?, SADDR=? where sid=?");
			pst.setString(1, sto.getSname());
			pst.setString(2, sto.getSaddr());
			pst.setString(3, sto.getSid());
			pst.executeUpdate();
			status = "success";
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		Connection con;
		try {
			con = ConnectionFactory.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from student where sid=?");
			pst.setString(1, sid);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true){
				pst = con.prepareStatement("delete from student where sid=?");
				pst.executeUpdate();
				status = "success";
			}else{
				status = "notexisted";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

}

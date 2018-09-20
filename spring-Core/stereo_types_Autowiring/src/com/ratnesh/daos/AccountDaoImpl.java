package com.ratnesh.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ratnesh.dto.Account;

import oracle.jdbc.pool.OracleDataSource;


@Component("accDao")
public class AccountDaoImpl implements AccountDao {
	String status = "";
	@Autowired(required=true)
	private OracleDataSource ds;
	@Override
	public String create(String accNo, String accName, String accType, int balance) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true){
				status = "existed";
			}else{
				con = ds.getConnection();
				pst = con.prepareStatement("insert into account values(?,?,?,?)");
				pst.setString(1, accNo);
				pst.setString(2, accName);
				pst.setString(3, accType);
				pst.setInt(4, balance);
				pst.executeUpdate();
				
				status= "success";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}
		
	@Override
	public String search(String accNo) {
		 try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true){
				status = "[Account No:"+rs.getString("ACCNo")+",Account Name:"+rs.getString("ACCNAME")+",Account Type:"+rs.getString("ACCTYPE")+",Balance :"+rs.getInt("BALANCE")+"]";
			}else{
				status = "Account not existed";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return status;
	}

	@Override
	public Account getAccount(String accNo) {
		Account acc = null;
		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo=?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true){
				acc = new Account();
				acc.setAccNo(rs.getString("ACCNO"));
				acc.setAccName(rs.getString("ACCNAME"));
				acc.setAccType(rs.getString("ACCTYPE"));
				acc.setBalance(rs.getInt("BALANCE"));
			}else{
				acc = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return acc;
	}

	@Override
	public String update(String accNo, String accName, String accType, int balance) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement("update account set ACCNAME=?, ACCTYPE=?, BALANCE=? where ACCNO=?");
			pst.setString(1, accName);
			pst.setString(2, accType);
			pst.setInt(3, balance);
			pst.setString(4, accNo);
			pst.executeUpdate();
			status ="success";
			
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public String delete(String accNo) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from account where accNo = ?");
			pst.setString(1, accNo);
			ResultSet rs = pst.executeQuery();
			boolean b = rs.next();
			if(b==true){
				pst = con.prepareStatement("delete from account where accNo = ?");
				pst.setString(1, accNo);
				pst.executeUpdate();
				status = "success";
			}else{
				status = "notexisted";
			}
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}
		return null;
	}

}

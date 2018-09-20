package com.ratnesh.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.util.SystemPropertyUtils;

import com.ratnesh.beans.Employee;

public class Test {

	public static void main(String[] args) {
		BeanWrapper bw = new BeanWrapperImpl(Employee.class);
		bw.setPropertyValue("eno", 111);
		bw.setPropertyValue("ename", "AAA");
		bw.setPropertyValue("eaddr", "hyd");
		bw.setPropertyValue("esal",40000.0f);
		
		Employee emp = (Employee) bw.getWrappedInstance();
		System.out.println(emp);
		emp.getEmpDetails();
		System.out.println();
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("eno", "222");
		map.put("ename", "BBB");
		map.put("eaddr", "pune");
		map.put("esal", "30000");
		
		bw.setPropertyValues(map);
		System.out.println(emp);
		System.out.println();
		
		
		System.out.println("Employee Details");
		System.out.println("--------------------");
		System.out.println("Employee No     :"+bw.getPropertyValue("eno"));
		System.out.println("Employee Name   :"+bw.getPropertyValue("ename"));
		System.out.println("Employee Address:"+bw.getPropertyValue("eaddr"));
		System.out.println("Employee Salary :"+bw.getPropertyValue("esal"));
		
	}
	

}

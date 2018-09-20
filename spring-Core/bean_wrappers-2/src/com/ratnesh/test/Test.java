package com.ratnesh.test;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import com.ratnesh.beans.Employee;

public class Test {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		BeanWrapper bw = new BeanWrapperImpl(emp1);
		bw.setPropertyValue("eno", 111);
		bw.setPropertyValue("ename", "AAA");
		bw.setPropertyValue("eaddr", "hyd");
		bw.setPropertyValue("esal", 50000.0f);
		System.out.println(emp1);
		emp1.getEmpDetails();
		System.out.println();
		
		Employee emp2 = new Employee();
		BeanUtils.copyProperties(emp1, emp2);
		System.out.println(emp2);
		emp2.getEmpDetails();
		
		

	}

}
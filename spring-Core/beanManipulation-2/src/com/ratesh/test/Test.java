package com.ratesh.test;

import java.beans.BeanInfo;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

import org.springframework.beans.BeanInfoFactory;
import org.springframework.beans.ExtendedBeanInfoFactory;

import com.ratesh.beans.Employee;

public class Test {

	public static void main(String[] args)throws Exception {
		BeanInfoFactory factory = new ExtendedBeanInfoFactory();
		BeanInfo bean_Info = factory.getBeanInfo(Employee.class);
		PropertyDescriptor[] prop_Desc = bean_Info.getPropertyDescriptors();
		for(PropertyDescriptor p:prop_Desc){
			System.out.println(p);
			System.out.println();
		}
		MethodDescriptor[] md = bean_Info.getMethodDescriptors();
		for(MethodDescriptor m:md){
			System.out.println(m.getName());
		}
	}

}

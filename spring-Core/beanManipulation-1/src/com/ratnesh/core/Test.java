package com.ratnesh.core;

import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

public class Test {

	public static void main(String[] args)throws Exception {
		BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
		PropertyDescriptor[] prop_Desc = beanInfo.getPropertyDescriptors();
		for(PropertyDescriptor p:prop_Desc){
			System.out.println(p.getName());
		}
		System.out.println();
		MethodDescriptor[] meth_Desc = beanInfo.getMethodDescriptors();
		for(MethodDescriptor m:meth_Desc){
			System.out.println(m.getName());
		}
	}

}

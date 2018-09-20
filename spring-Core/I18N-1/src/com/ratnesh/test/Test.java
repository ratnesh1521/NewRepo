package com.ratnesh.test;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
	public static void main(String[] args){
		Locale l1 = new Locale("en","US");
		DateFormat date_Format = DateFormat.getDateInstance(2,l1);
		System.out.println(date_Format.format(new Date()));
		
		Locale l2 = new Locale("it", "IT");
		NumberFormat num_Format = NumberFormat.getInstance(l2);
		System.out.println(num_Format.format(123456789.258649));
		
		Locale l3 = new Locale("hi","IN");
		ResourceBundle rb = ResourceBundle.getBundle("abc", l3);
		System.out.println(rb.getString("welcome"));
		
	}
}

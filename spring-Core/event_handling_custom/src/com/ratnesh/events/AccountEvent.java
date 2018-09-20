package com.ratnesh.events;

import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class AccountEvent extends ApplicationEvent {

	static FileOutputStream fos;
	static{
		try {
			fos = new FileOutputStream("E:/log/log.txt", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private String message;
	public AccountEvent(Object obj, String message) {
		super(obj);
		this.message = message;
	}
	public void generateLog(){
		try {
			message = new Date()+":"+message;
			message= message+"\n";
			byte[] b = message.getBytes();
			fos.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

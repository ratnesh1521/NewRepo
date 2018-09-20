package com.ratnesh.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class AccountEventPublisher implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher; 
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;

	}
	public void publish(String message){
		AccountEvent ae = new AccountEvent(this, message);
		publisher.publishEvent(ae);
	}

}

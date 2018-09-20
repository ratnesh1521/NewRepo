package com.ratnesh.events;

import org.springframework.context.ApplicationListener;

public class AccountEventHandler implements ApplicationListener<AccountEvent> {

	@Override
	public void onApplicationEvent(AccountEvent e) {
		e.generateLog();

	}

}

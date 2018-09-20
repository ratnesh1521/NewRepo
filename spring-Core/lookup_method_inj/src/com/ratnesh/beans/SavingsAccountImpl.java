package com.ratnesh.beans;

public class SavingsAccountImpl implements Account {

	
	@Override
	public void create() {
		System.out.println("Savings Account is created..");

	}

	@Override
	public void search() {
		System.out.println("Savings Account is identified..");

	}

	@Override
	public void update() {
		System.out.println("Savings Account is updated...");

	}

	@Override
	public void delete() {
		System.out.println("Savings Account is deleted");

	}

}

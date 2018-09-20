package com.ratnesh.beans;

public class CurrentAccountImpl implements Account {

	

	@Override
	public void create() {
		System.out.println("Current Account is created");

	}

	@Override
	public void search() {
		System.out.println("Current Account is identified");

	}

	@Override
	public void update() {
		System.out.println("Current Account is updated");

	}

	@Override
	public void delete() {
		System.out.println("Current Acccount is deleted");

	}

}

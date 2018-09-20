package com.ratnesh.beans;

public class City_state {

	public String city;
	public String state;
	
	
	public City_state(String city, String state) {
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		
		return city+" = "+state;
	}
}

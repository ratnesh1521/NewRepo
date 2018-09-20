package com.ratnesh.beans;

public class Town_State {
	public String town;
	public String state;
	
	public Town_State(String town, String state) {
		this.town = town;
		this.state = state;
	}
	@Override
	public String toString(){
		return town+" = "+state;
	}
}


package com.ratnesh.beans;

import java.util.ArrayList;
public class City_state_Collection {

	ArrayList<City_state> city_state = null;
	public ArrayList<City_state> getCity_state()
	{
	    city_state = new ArrayList<City_state>();
	    city_state.add(new City_state("hyd","Tel"));
	    city_state.add(new City_state("sec","Tel"));
	    city_state.add(new City_state("mub","mah"));
	    city_state.add(new City_state("pune","mah"));
	    
	    return city_state;
	    
	}
}

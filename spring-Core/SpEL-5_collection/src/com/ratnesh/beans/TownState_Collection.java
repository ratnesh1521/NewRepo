package com.ratnesh.beans;

import java.util.ArrayList;

public class TownState_Collection {

		ArrayList<Town_State> town_state = null;
		public ArrayList<Town_State> getTown_State(){
			
			town_state = new ArrayList<Town_State>();
			town_state.add(new Town_State("pune","maharastra"));
			town_state.add(new Town_State("hajipur","bihar"));
			town_state.add(new Town_State("patna","bihar"));
			town_state.add(new Town_State("hyderabad","telangana"));
			
			return town_state;
			
		}
		
}

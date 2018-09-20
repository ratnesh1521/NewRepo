package com.ratnesh.propertyeditor;

import java.beans.PropertyEditorSupport;

import com.ratnesh.beans.EmployeeAddress;

public class EmployeeAddressEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String[] str = text.split("-");
		EmployeeAddress eaddr = new EmployeeAddress();
		eaddr.setDist(str[0]);
		eaddr.setState(str[1]);
		eaddr.setCountry(str[2]);
		eaddr.setContinent(str[3]);
		eaddr.setPlanet(str[4]);
		eaddr.setGalaxy(str[5]);
		setValue(eaddr);
	}
}

package com.ratnesh.property_editors;

import java.beans.PropertyEditorSupport;


import com.ratnesh.beans.StudentCourse;

class StudentAddrEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
	 String[] str = text.split(",");
	 StudentCourse scr = new StudentCourse();
	 scr.setCid(str[0]);
	 scr.setCname(str[1]);
	 scr.setCost(str[2]);
	 setValue(scr);
	 
	 
	}
}

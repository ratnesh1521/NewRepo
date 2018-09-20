package snippet;

public class EAE {
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

}


<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">
        
        <bean id="emp" class="com.ratnesh.beans.Employee">
          <property name="eid" value="111" />
          <property name="ename" value="Ratnesh"/>
          <property name="esal" value="50000"/>
          <property name="eaddr" value="vaishali-bihar-india-asia-earth-milkyway"/>
        
        </bean>
        <bean id="cutomEditor" class="org.springframework.beans.factory.config.CustomEditorConfigurer">
           <property name="customEditors">
             <map>
               <entry key="com.ratnesh.beans.EmployeeAddress" value="com.ratnesh.propertyeditor.EmployeeAddressEditor"/>
             </map>
           </property>
             
        </bean>
        </beans>

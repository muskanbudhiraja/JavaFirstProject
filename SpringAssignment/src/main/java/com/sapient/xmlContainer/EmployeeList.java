package com.sapient.xmlContainer;

import java.util.Map;

public class EmployeeList {

	private Map<Integer,Employee> maps;

	public Map<Integer, Employee> getMap() {
		return maps;
	}

	public void setMap(Map<Integer, Employee> maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "EmployeeList [maps=" + maps + "]";
	}
	
	
	
}

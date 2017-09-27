package com.capgemini.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	
	@Autowired
	private Address address;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

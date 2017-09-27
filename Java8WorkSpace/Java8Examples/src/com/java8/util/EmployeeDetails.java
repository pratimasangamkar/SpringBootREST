package com.java8.util;

public class EmployeeDetails {
	
	private int empId;
	private String name;
	private String clients;
	private String domain;
	
	public EmployeeDetails(int empId, String name, String clients, String domain) {
		super();
		this.empId = empId;
		this.name = name;
		this.clients = clients;
		this.domain = domain;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClients() {
		return clients;
	}
	public void setClients(String clients) {
		this.clients = clients;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", name=" + name + ", clients=" + clients + ", domain=" + domain
				+ "]";
	}

}

package com.sprinapp1.model;

public class Employee {

	private String fullname;
	private Department department;
	
	
	/*public Employee() {
		super();
	}*/

	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}

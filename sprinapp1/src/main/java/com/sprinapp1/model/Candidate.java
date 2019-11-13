package com.sprinapp1.model;

public class Candidate {
	
	private String name;
	private String address;
	private int age;
	
	public void myInit(){
		System.out.println("Init called..");
	}
	public void myDestroy(){
		System.out.println("Destroyed");
	}
	
	//Setter & getter
	//constructor
	//toString
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Candidate(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		
		
		
		
	}
	public Candidate() {
		super();
		System.out.println("bean created..");
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", address=" + address + ", age=" + age + "]";
}
	
	

}

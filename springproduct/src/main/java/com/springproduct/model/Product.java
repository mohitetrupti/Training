package com.springproduct.model;

public class Product {

	private String name;
	private int unitprice;
	private Category category;
	
	public Product() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getUnitprice() {
		return unitprice;
	}
	
	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}

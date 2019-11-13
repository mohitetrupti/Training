package com.springproduct.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springproduct.model.Product;

public class TestProduct {

	private static ApplicationContext ctx;
	public static void main(String[] args) {
		
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		Product p = (Product) ctx.getBean("product");
		System.out.println(p.getName()+"\t"+p.getUnitprice()+"\t"+p.getCategory().getName());
		((AbstractApplicationContext) ctx).close();
	}
}

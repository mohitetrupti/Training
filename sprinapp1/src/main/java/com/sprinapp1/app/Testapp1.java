package com.sprinapp1.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sprinapp1.model.Candidate;
import com.sprinapp1.model.Employee;
import com.sprinapp1.model.TextEditor;
import com.sprinapp1.service.MathService;

public class Testapp1 {
  private static ApplicationContext ctx;
  

	
  public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("-----");
		/*Candidate c = (Candidate)ctx.getBean("c1");
		System.out.println(c);
		c.setAddress("SriLanka");
		System.out.println(c);
		Candidate cc = (Candidate)ctx.getBean("c1");
		System.out.println(cc);*/
		//((AbstractApplicationContext) ctx).close();
		
		
		/*MathService ms = (MathService) ctx.getBean("dao");
		System.out.println(ms.add(11, 12));
		System.out.println(ms.power(2, 4));*/
		/*((AbstractApplicationContext) ctx).close();*/

		/*TextEditor t = (TextEditor) ctx.getBean("te");
		t.Write();
		((AbstractApplicationContext) ctx).close();*/
		
		Employee e = (Employee) ctx.getBean("emp");
		System.out.println(e.getFullname()+"\t"+e.getDepartment().getName());
		
		
		((AbstractApplicationContext) ctx).close();
  }

}

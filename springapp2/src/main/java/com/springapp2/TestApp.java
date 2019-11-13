package com.springapp2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springapp2.controller.FlightController;
import com.springapp2.controller.StudentController;
import com.springapp2.model.Flight;
import com.springapp2.model.Student;

public class TestApp {
	
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {
		
		applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		/*StudentController studentController = (StudentController)applicationContext.getBean("studentController");
		//System.out.println(studentController.createStudent());
		System.out.println(studentController.getStudent());
		List<Student> list = studentController.getAll();
		for (Student student : list) {
			
			System.out.println(student);
		}*/
		FlightController flightController = (FlightController)applicationContext.getBean("flightController");
		
		/*List<Flight> list = flightController.getAll();
		for(Flight flight: list)
			System.out.println(flight);*/
		
		List<Flight> list = flightController.getFlight();
		for(Flight flight: list)
			System.out.println(flight);
	}
}

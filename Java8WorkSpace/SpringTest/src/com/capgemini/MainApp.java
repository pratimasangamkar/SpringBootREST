package com.capgemini;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = applicationContext.getBean("employee", Employee.class);
		System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName());
		System.out.println(emp.getAddress().getCity());

	}

}

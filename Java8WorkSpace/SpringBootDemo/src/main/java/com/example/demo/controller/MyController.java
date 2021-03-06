package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;



@RestController
public class MyController {
	
	private List<Employee> list= new ArrayList<>();
	
	public MyController() {
		// TODO Auto-generated constructor stub
		Employee emp1 = new Employee(68117, "Pratima");
		Employee emp2 = new Employee(68084, "Priyanka");
		list.add(emp1);
		list.add(emp2);
	}
	
	@RequestMapping("/demo")
	public String getHello(){
		return "Hello from Spring Boot";
	}

	@RequestMapping("/list")
	public List<Employee> getListEmployee(){
		return list;
	}
}

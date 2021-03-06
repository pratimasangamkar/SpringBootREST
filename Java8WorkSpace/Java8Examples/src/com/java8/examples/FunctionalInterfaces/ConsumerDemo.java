package com.java8.examples.FunctionalInterfaces;

import java.util.function.Consumer;

import com.java8.util.Employee;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Employee> consumer = (employee) -> {
			System.out.println(employee.toString());
		};
		
		Employee emp = new Employee(68117, "Pratima");
		
		consumer.accept(emp);
	}

}

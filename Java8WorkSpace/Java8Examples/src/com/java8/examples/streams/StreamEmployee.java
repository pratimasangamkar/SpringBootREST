package com.java8.examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.util.EmployeeDetails;

public class StreamEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp1 = new EmployeeDetails(1, "Pratima", "Barclays", "Java");
		EmployeeDetails emp2 = new EmployeeDetails(1, "Priyanka", "Discover", "Java");
		EmployeeDetails emp3 = new EmployeeDetails(1, "Kapil", "Barclays", "Java");
		EmployeeDetails emp4 = new EmployeeDetails(1, "Priya", "HSBC", "Java");
		EmployeeDetails emp5 = new EmployeeDetails(1, "Guru", "Discover", "AngularJS");
		
		List<EmployeeDetails> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		List<EmployeeDetails> empList = list.stream().filter(x -> (x.getDomain().equals("Java") && x.getClients().equals("Barclays"))).collect(Collectors.toList());
		
		System.out.println(empList);
		

	}

}

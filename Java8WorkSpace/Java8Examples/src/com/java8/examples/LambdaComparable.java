package com.java8.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.util.Employee;

public class LambdaComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Employee> comp = (x,y) -> {
			return x.getEmpId() - y.getEmpId();
		};
		
		
		
		Employee e1 = new Employee(21, "Pratima");
		Employee e2 = new Employee(20, "Priyanka");
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		
		System.out.println("Before sorting: "+list.toString());
		
		Collections.sort(list, comp);
		System.out.println("After Sorting: "+list.toString());

	}

}

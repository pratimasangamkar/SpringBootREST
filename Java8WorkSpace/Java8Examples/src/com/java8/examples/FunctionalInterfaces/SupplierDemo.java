package com.java8.examples.FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> supplier = () -> { 
			return "Supplier of Type String Demo";
		};
		
		System.out.println(supplier.get());

	}

}

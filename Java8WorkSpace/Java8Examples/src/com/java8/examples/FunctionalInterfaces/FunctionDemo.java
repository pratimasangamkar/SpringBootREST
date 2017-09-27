package com.java8.examples.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> function = (word) -> {
			return word.length();
		};
		
		System.out.println(function.apply("Pratima"));

	}

}

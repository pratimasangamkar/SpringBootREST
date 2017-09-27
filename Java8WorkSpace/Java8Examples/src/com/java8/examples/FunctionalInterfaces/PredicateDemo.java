package com.java8.examples.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> predicate = (x) -> { 
		if(x > 0)
			return true;
		else
			return false;
		};
		
		System.out.println(predicate.test(15));
		System.out.println(predicate.test(-15));

	}

}

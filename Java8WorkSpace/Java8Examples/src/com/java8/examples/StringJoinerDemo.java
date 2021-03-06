package com.java8.examples;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringJoiner stringJoiner = new StringJoiner("|");
		stringJoiner.add("Java");
		stringJoiner.add("DotNet");
		stringJoiner.add("Spring");
		stringJoiner.add("Hibernate");
		
		System.out.println(stringJoiner);
		
		
		StringJoiner stringJoinerSuffixes = new StringJoiner("|","[","]");
		stringJoinerSuffixes.add("Java");
		stringJoinerSuffixes.add("DotNet");
		stringJoinerSuffixes.add("Spring");
		stringJoinerSuffixes.add("Hibernate");
		
		System.out.println(stringJoinerSuffixes);
	
	}

}

package com.java8.examples.time;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.now();
		System.out.println("Date: "+localDate);
		
		System.out.println("Month: "+localDate.getMonth());
		System.out.println("Day: "+localDate.getDayOfMonth());
		System.out.println("Year: "+localDate.getYear());

	}

}

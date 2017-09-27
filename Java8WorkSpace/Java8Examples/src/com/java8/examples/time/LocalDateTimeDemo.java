package com.java8.examples.time;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println("Month: "+localDateTime.getMonth());
		System.out.println("Day: "+localDateTime.getDayOfMonth());
		System.out.println("Year: "+localDateTime.getYear());
		System.out.println("Hours: "+localDateTime.getHour());
		System.out.println("Minutes: "+localDateTime.getMinute());
		System.out.println("Seconds: "+localDateTime.getSecond());
		System.out.println("Nano Seconds: "+localDateTime.getNano());

	}

}

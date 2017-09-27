package com.java8.examples.time;

import java.time.LocalTime;

public class LocalTimeDemo {
	
	public static void main(String args[]){
		LocalTime localTime = LocalTime.now();
		System.out.println("Time: "+localTime);
		
		System.out.println("Hours: "+localTime.getHour());
		System.out.println("Minutes: "+localTime.getMinute());
		System.out.println("Seconds: "+localTime.getSecond());
	}

}

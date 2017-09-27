package com.java8.examples.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId);
		
		ZoneId zone = ZoneId.of("America/Los_Angeles");
		System.out.println(zone);
		
		ZonedDateTime dt = ZonedDateTime.now(zone);
		System.out.println(dt);

	}

}

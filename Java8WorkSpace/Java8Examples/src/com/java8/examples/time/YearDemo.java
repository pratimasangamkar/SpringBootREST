package com.java8.examples.time;

import java.time.Year;

public class YearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2017;
		Year y = Year.of(year);
		if(y.isLeap()){
			System.out.println("Leap Year");
		}else{
			System.out.println("Not a Leap year");
		}

	}

}

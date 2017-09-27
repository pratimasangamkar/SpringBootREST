package com.java8.examples.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate local = LocalDate.now();
		LocalDate birthday = LocalDate.of(1990, 5, 24);
		Period period =  Period.between(birthday, local);
		System.out.println("Diff of years: "+period.getYears());
		System.out.println("Diff of Months: "+period.getMonths());
		System.out.println("Diff of Days: "+period.getDays());
	}

}
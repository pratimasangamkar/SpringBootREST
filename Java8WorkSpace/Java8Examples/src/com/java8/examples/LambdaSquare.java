package com.java8.examples;

interface Math{
	public int square(int x);
}

public class LambdaSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math m = a -> a*a;
		System.out.println(m.square(10));

	}

}

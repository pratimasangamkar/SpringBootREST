package com.java8.examples;

interface Maths{
	int operation(int a,int b);
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m1 = new Maths() {
			
			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		System.out.println("Add: "+m1.operation(5, 4));
		
		Maths m2 = (int x, int y) -> {  return x*y;};
		System.out.println("Multiplication: "+m2.operation(2, 4));
		
		Maths m3 = (p,q) -> p/q;
		System.out.println("Division: "+m3.operation(10, 5));
		
	}

}

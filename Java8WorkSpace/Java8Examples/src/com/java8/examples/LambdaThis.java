package com.java8.examples;

interface Test{
	void show();
}

public class LambdaThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("Annonymous Class"+this);
				
			}
		};
		t.show();
		
		Test t1 = () -> System.out.println("Lambda Feature: ");
		
	}

}

package com.java8.examples;

interface Left{
	int a = 10;
	default void m1(){
		System.out.println("In left Interface");
	}
	
	static void testStatic(){
		System.out.println("Static from Left Interface");
	}
}

interface Right{
	int a = 20;
	default void m1(){
		System.out.println("In right Interface");
	}
	
	static void testStatic(){
		System.out.println("Static from Right Interface");
	}
}

class TestInt implements Left,Right{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
		Right.super.m1();
		System.out.println("Overriding m1: "+Left.a);
		Left.testStatic();
		new TestInt().testStatic();
	}
	
	static void testStatic(){
		System.out.println("From TestInt Class");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInt test = new TestInt();
		test.m1();

	}

}

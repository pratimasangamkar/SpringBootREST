package com.java8.examples;

public class LambdaRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> System.out.println("Runnable Interface");
		r.run();

		Runnable r1 = () -> System.out.println("Runnable Interface: "+Thread.currentThread().getName());
		
		Thread t = new Thread(r1,"MyThread");
		t.start();

	}

}

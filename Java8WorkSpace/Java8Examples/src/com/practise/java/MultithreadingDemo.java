package com.practise.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MultithreadingDemo 
{
	static  List<Integer> positiveNumbers = new ArrayList<>();
	static List<Integer> negativeNumbers = new ArrayList<>();
	static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MultithreadingDemo m = new MultithreadingDemo();
		
		m.list.add(-1);
		m.list.add(11);
		m.list.add(0);
		m.list.add(34);
		m.list.add(-67);
		m.list.add(-90);
		
		Runnable r1 = () ->{
			System.out.println("In run r1");
			positiveNumbers = list.stream().filter(x-> x>=0).collect(Collectors.toList());
		};

		Runnable r2 = () ->{
			System.out.println("In run r2");
			negativeNumbers = list.stream().filter(x-> x<0).collect(Collectors.toList());
		};
		Thread t = new Thread(r1);
		Thread t1 = new Thread(r2);
		t.start();
		t1.start();
		while(t.isAlive() || t1.isAlive()){
			
		}
	
		if(!t.isAlive() && !t1.isAlive()){
			System.out.println(positiveNumbers);
			System.out.println(negativeNumbers);
			list.removeAll(list);
			list.addAll(positiveNumbers);
			list.addAll(negativeNumbers);
			System.out.println(list);
		}

	}


	

}

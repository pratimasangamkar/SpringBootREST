package com.practise.java;

import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = {"pratima","ABCD","XYZ","pratima","pratima","ABCD"};
		int count = 0;
		
		Map<String,Integer> map = new TreeMap<>();
		
		for(int i = 0; i < s.length; i++){
			count = 0;
			if(!map.containsKey(s[i])){
				map.put(s[i], ++count);
			}else{
				int temp = map.get(s[i]);
				map.replace(s[i], ++temp);
			}
		}

		System.out.println(map);
	}

}

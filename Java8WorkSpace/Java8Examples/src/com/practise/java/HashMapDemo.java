package com.practise.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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
		
		
		/*List<String> keys = new ArrayList<>(map.keySet());
		List<Integer> values = new ArrayList<>(map.values());*/
		
		Map<String,Integer> sortedMap = new TreeMap<>(new ValueComparator(map));
		sortedMap.putAll(map);

		System.out.println(sortedMap);
		Map<String,Integer> sortedMap1 = new TreeMap<>(Collections.reverseOrder());
		sortedMap1.putAll(sortedMap);

		System.out.println(sortedMap1);
		
		Set set = sortedMap1.entrySet();
	    Iterator i = set.iterator();
	    // Display elements
	    while(i.hasNext()) {
	      Map.Entry me = (Map.Entry)i.next();
	      System.out.print(me.getKey() + ": ");
	      System.out.println(me.getValue());
	    }
	
	}

}

class ValueComparator implements Comparator{
	Map<String,Integer> map;
	public ValueComparator(Map<String,Integer> map) {
		// TODO Auto-generated constructor stub
		this.map = map;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return map.get(o1)-map.get(o2);
	}
	
}

package com.java.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = { "Java", "Python", "Javascript", "Java", "Python" };

		// 1
		for (int i = 0; i < names.length; i++) { // o (nxn)

			for (int j = i + 1; j < names.length; j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate Name is : " + names[i]);

				}
				
			}
		}
		
		// 2. Using HashSet
		
		Set<String> store = new HashSet<String>();
		
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate Name in HashSet : " +name);
				
			}
		}
		
		// 3. Using HashMap
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for (String name : names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
		for (Entry<String,Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Name using HashMap " + entry.getKey());
			}
		}
		
		// Post Increment
		int i = 4;
		int a = i++;
		System.out.println(a + ":" + i);
		
		// Pre Increment
		int j = 4;
		int b = ++j;
		System.out.println(b + ":" + j);
		

	}

}

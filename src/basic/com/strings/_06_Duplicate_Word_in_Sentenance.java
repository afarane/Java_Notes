package com.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _06_Duplicate_Word_in_Sentenance {

	public static void main(String[] args) {

		String names[] = { "India", "US", "UK", "India", "Japan" };

		// Method 1 : Using For Loop | O(n^2)
		for (int i = 0; i < names.length; i++) { // o (nxn)

			for (int j = i + 1; j < names.length; j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("Method 1 Using For Loop : Duplicate Word in Array is : " + names[i]);

				}
				
			}
		}
		
		// Method 2 : Using HashSet
		
		Set<String> store = new HashSet<String>();
		
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Method 2 Using HashSet : Duplicate Word in Array is : " +name);
				
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
				System.out.println("Method 3 Using HashMap : Duplicate Word in Array is : " + entry.getKey());
			}
		}
		
	

	}

}

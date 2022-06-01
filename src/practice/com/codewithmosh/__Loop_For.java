package com.codewithmosh;

public class __Loop_For {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		String[] fruits = {"Apple", "Mango","Orange"};
		
		// For each Loop
		// 1. Forward loop only.
		for(String fruit : fruits) {
			System.out.println(fruit);
			
		}
	}

}

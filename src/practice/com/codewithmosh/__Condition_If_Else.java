package com.codewithmosh;

public class __Condition_If_Else {
	
	public static void main(String[] args) {
		
		// If condition
		int x = 30;
		int y = 20;		
		
		if (x>y) {
			System.out.println("X i Greater than Y");
		} else if (x<y) {
			System.out.println("X i Less than Y");
		} else {
			System.out.println("X i Equal to Y");
		}
		
		int income = 120_000;
		String className = income > 100_000 ? "First" : "Economy";
		
	}

}

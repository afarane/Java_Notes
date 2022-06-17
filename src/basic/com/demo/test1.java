package com.demo;

import java.util.Scanner;

public class test1 {

	// I am Abhijeet FARANE
	// I ma teejihbA ENARAF

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);

		String s = "I am Abhijeet FARANE";
		String[] newString = s.split(" ");
		String res = "";
		
		for (String s1 : newString) {
			
			for (int i = s1.length() ; i >0 ; i--) {
				res += s1.charAt(i-1);
			}
			System.out.print(" ");
		}
	
		

		System.out.println(res);

	}

}

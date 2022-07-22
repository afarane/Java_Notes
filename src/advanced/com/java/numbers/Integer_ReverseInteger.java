package com.java.numbers;

import java.util.Scanner;

public class Integer_ReverseInteger {

	public static void main(String[] args) {

		
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		
		int num = 12345;
		
		// Using StringBuffer
		//System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		
		int rev = 0;

		while (num > 0) {
			rev = rev*10 + num % 10;
			num = num /10;
		}

		System.out.println(rev);
		
		
		
		

	}

}

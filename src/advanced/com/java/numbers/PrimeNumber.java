package com.java.numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		//int num = 31;
		boolean isPrime = true;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i= 2; i <num; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}

		

	
		
		if(isPrime) {
			System.out.println(num + " is a Prime number !");
		}else {
			System.out.println(num + " is Not a Prime number !");
		}
		
		


	}

}

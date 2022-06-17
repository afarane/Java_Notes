package com.test;

import java.util.Arrays;

public class SmallestLargestNumber {

	public static void main(String[] args) {
		

		int numbers[] = {-10,2,44,-55};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		
		for(int i = 1; i<numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}else if (numbers[i] < largest) {
				smallest = numbers[i];
			}
		}
		
		System.out.println("Array is : " + Arrays.toString(numbers));
		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number is : " + smallest);

	}

}

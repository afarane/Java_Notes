package com.numbers;

import java.util.Arrays;

public class SmallestLargestNumber {

	public static void main(String[] args) {
		

		int numbers[] = {-10,2,44,-55};
		
		int largestNumber = numbers[0];
		int smallestNumber = numbers[0];
		
		for (int i=1; i<numbers.length;i++) {
			if (numbers[i] > largestNumber) {
				largestNumber = numbers[i];
			}else if (numbers[i] < smallestNumber) {
				smallestNumber = numbers[i];
			}
		}
		
		System.out.println("Array is : " + Arrays.toString(numbers));
		System.out.println("Largest Number is : " + largestNumber);
		System.out.println("Smallest Number is : " + smallestNumber);

	}

}

package com.numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		int myInt = 121; // Reverse this int
		int revInt = 0;

		int originalInt = myInt;
		
		while (myInt != 0) {
			revInt = revInt * 10 + myInt % 10;
			myInt = myInt / 10;
		}

		System.out.println(revInt);

		// Check of originalInt is Palindrome number or Not
		if (originalInt == revInt)
			System.out.printf("[log] %d This is a Palindrome number", originalInt);
		else
			System.out.printf("[log] %s This is Not a Palindrome number", originalInt);

	}

}


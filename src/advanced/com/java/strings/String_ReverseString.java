package com.java.strings;

public class String_ReverseString {

	public static void main(String[] args) {

		// Q : Reverse Following String
		String myString = "Hello Abhijeet";

		// Method 1 : Using For Loop
		String revString = "";
		int lenString = myString.length();

		for (int i = lenString - 1; i >= 0; i--) {
			revString += myString.charAt(i);
		}

		System.out.println("Method 1 : " + revString);

		System.out.println("----------------------------------");

		// Method 2 : Using StringBuilder

		StringBuilder sb = new StringBuilder(myString);
		System.out.println("Method 2 : " + sb.reverse());
	}

}




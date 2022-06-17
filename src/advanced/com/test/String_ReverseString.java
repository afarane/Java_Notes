package com.test;

public class String_ReverseString {

	public static void main(String[] args) {
		String s = "I am Abhijeet";

		// 1. String is immutable object.

		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
		
		//2.  Using String Buffer Class it is mutable.
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}

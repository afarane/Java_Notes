package com.java.strings;

public class String_RemoveSpecialChars {

	public static void main(String[] args) {
		
		
		String s = "@#$$%%abhijeet farane&&%%$$";
		
		s = s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);

	}

}

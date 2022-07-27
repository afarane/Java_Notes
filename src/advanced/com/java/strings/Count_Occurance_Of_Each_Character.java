package com.java.strings;

public class Count_Occurance_Of_Each_Character {

	public static void main(String[] args) {
		String name = "Abhijeet";

		for (int i = 0; i < name.length(); i++) {
			int count = 0;
			char c = name.charAt(i);

			for (int j = 0; j < name.length(); j++) {

				if (c == name.charAt(j)) {
					count++;
				}
			}
			System.out.println("Char  " + c + " : No of Occurance : " + count);
		}

	}

}

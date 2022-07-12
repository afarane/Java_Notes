package com.basic;

public class _0401_StringBuilder {

	public static void main(String[] args) {
	
		
		StringBuilder sb = new StringBuilder("Hello");

		
		System.out.println(sb.charAt(0));
		
		sb.setCharAt(0, 'B');
		
		sb.insert(0, 'S');
		
		sb.delete(0, 1);
		
		System.out.println(sb);
		
		//ok
		

	}

}

package com.codewithmosh;
import java.text.NumberFormat;

public class NumberFormatDemo {

	public static void main(String[] args) {
	
		String result =  NumberFormat.getCurrencyInstance().format(1005);
		System.out.println(result);
		
		
	}

}

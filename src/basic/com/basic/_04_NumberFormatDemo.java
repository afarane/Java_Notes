package com.basic;
import java.text.NumberFormat;

public class _04_NumberFormatDemo {

	public static void main(String[] args) {
	
		String result =  NumberFormat.getCurrencyInstance().format(1005.897);
		System.out.println(result);
		
		String result_percent = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(result_percent);
		
		
	}

}
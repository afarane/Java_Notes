package java.part1;

import java.util.Scanner;

public class _5_ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name: ");
		String name = scanner.nextLine().trim();
		System.out.println("You are " + name);
		

	}

}

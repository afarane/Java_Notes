package day1;

import java.util.Scanner;

public class _6_Loop_While {

	public static void main(String[] args) {
		int x = 1;

		while (x <= 5) {
			System.out.println(x);
			x++;

		}

		Scanner sc = new Scanner(System.in);

		String input = "";

		while (!input.equals("quit")) {
			System.out.println("Inpit: ");
			input = sc.next().toLowerCase();

		}

	}

}

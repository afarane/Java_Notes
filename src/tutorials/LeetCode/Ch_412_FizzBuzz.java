package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Ch_412_FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(5);

	}

	public static List<String> fizzBuzz(int n) {
		List<String> output = new ArrayList<String>();
		for (int i = 1, Fizz = 0, Buzz=0; i <= n; i++) {
			Fizz++;
			Buzz++;

			if (Fizz == 3 && Buzz == 5) {
				Fizz = 0;
				Buzz = 0;
				output.add("FizzBuzz");
			} else if (Fizz == 3) {
				Fizz = 0;
				output.add("Fizz");

			} else if ( Buzz == 5) {
				Buzz = 0;
				output.add("Buzz");

			}else {
				output.add(Integer.toString(i));
			}

		}
		return output;

	}
}

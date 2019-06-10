package interview;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int myInt = 153;
		int temNum = myInt;

		int s, sum = 0;

		while (myInt > 0) {

			s = myInt % 10;

			sum = sum + s * s * s;

			myInt = myInt / 10;

		}

		if (temNum == sum)
			System.out.println(temNum + " is an ArmStrong Number");
		else
			System.out.println(temNum + " is NOT an ArmStrong Number");

	}
	
	

}

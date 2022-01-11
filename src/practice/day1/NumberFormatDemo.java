package day1;
import java.text.*;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
	
		String result =  NumberFormat.getInstance(Locale.getDefault(Locale.Category.FORMAT), null, NumberFormat.CURRENCYSTYLE).format(1005);
		System.out.println(result);
		
		
	}

}

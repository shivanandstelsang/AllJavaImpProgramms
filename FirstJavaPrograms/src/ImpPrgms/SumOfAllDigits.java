package ImpPrgms;
import java.util.Scanner;

public class SumOfAllDigits {

	public static void main(String[] args) {
		long n = 0, sumofalldigits = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextLong();
		for (sumofalldigits = 0; n != 0; n = n / 10) {
			sumofalldigits = sumofalldigits + n % 10;
		}
		System.out.println(sumofalldigits);
	}

}

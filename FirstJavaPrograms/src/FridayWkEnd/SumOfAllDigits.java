package FridayWkEnd;

public class SumOfAllDigits {

	public static void main(String[] args) {
		long n = 987456321, sumofdigits = 0;
		for (sumofdigits = 0; n != 0; n = n / 10) {
			sumofdigits = sumofdigits + n % 10;
		}
		System.out.println(sumofdigits);

	}

}

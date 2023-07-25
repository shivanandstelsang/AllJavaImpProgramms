package FridayWkEnd;

public class SumofAllDigit {

	public static void main(String[] args) {
		long n = 1234, sumofdigits = 0;
//long num=563256351;
		for (sumofdigits = 0; n != 0; n = n / 10) {
			sumofdigits = sumofdigits + n % 10;
		}
		System.out.println(sumofdigits);
	}

}

package MainPGM;

public class PalindromeNumber {

	public static void main(String[] args) {
		int r = 0, num = 9876, temp = 0;
		int sum = 0;
		temp = sum;
		while (num > 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;

		}
		if (sum == temp) {

			System.out.println("palindrome");
		} else {
			System.out.println("not an paindrome");
		}
	}

}

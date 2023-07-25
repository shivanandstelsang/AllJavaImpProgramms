package ImpPrgms;

public class ReverseANumber {

	public static void main(String[] args) {
		int reverse = 0, num = 987654;
		int remainder = 0;
		while (num > 0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		System.out.println(reverse);
	}

}

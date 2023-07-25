package FridayWkEnd;

public class FindSquareRoot {

	public static int squareroot(int num) {
		int t;
		int sqrtroot = num / 2;
		do {
			t = sqrtroot;
			sqrtroot = (t+(num/t))/ 2;
		} while ((t - sqrtroot) != 0);
		return sqrtroot;
	}

	public static void main(String[] args) {
		System.out.println(squareroot(2048));
	}

}

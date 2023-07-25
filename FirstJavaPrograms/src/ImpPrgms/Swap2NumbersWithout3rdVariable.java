package ImpPrgms;
import java.util.Scanner;

public class Swap2NumbersWithout3rdVariable {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("before swapping : " + x + " " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("before swapping : " + x + " " + y);

	}

}

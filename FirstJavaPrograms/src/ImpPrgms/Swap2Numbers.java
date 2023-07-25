package ImpPrgms;
import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		int t, x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("before swapping the numbers : " + x + " " + y);
		t = x;
		x = y;
		y = t;
		System.out.println("after swapping the numb2ers : " + x + " " + y);

	}

}

package MainPGM;

import java.util.Scanner;

public class Isprimenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num % 1 == 0) {
			System.out.println("It is prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}

}

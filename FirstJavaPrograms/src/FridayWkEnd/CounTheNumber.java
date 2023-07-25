package FridayWkEnd;

import java.util.Scanner;

public class CounTheNumber {

	public static void main(String[] args) {
		int num=0, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num = sc.nextInt();
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		
	}

}

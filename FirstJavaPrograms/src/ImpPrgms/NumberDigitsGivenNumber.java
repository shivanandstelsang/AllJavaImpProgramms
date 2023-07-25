package ImpPrgms;
import java.util.Scanner;

public class NumberDigitsGivenNumber {

	public static void main(String[] args) {
		int count =0, num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		num = sc.nextInt();
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count);
		
	}

}

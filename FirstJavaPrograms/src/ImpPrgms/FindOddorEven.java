package ImpPrgms;
import java.util.Scanner;

public class FindOddorEven {

	public static void main(String[] args) {
int num=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
num = sc.nextInt();
if(num % 2==0)
{
	System.out.println("even number");
}else {
	System.out.println("odd number");
}

	}

}

package FridayWkEnd;

public class FindNumberOfDigits {

	public static void main(String[] args) 
	{
		int count=0, rev=0;
		int num=25;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		

System.out.println(count);
	}

}

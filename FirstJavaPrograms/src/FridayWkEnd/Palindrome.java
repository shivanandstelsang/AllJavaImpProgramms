package FridayWkEnd;

public class Palindrome {

	public static void main(String[] args) {
int r=0, sum=0, temp=0, num=89745632;
temp=num;
while(num>0)
{
	r = num % 10;
	sum=sum*10+r;
	num=num/10;
}
if(temp==sum)
{
	System.out.println("palindrome number");
}else
{
	System.out.println("not a palindrome number");
}
	}

}

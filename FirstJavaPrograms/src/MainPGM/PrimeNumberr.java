package MainPGM;

public class PrimeNumberr {
	public static boolean isprimenumber(int num)
	{
		for(int i=2; i<num; i++)
		{
			if(num % i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void getprimenumber(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(isprimenumber(i))
			{
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(isprimenumber(10));
		getprimenumber(20);

	}

}

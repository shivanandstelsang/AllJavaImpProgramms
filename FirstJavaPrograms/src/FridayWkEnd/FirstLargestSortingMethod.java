package FridayWkEnd;

import java.util.Arrays;

public class FirstLargestSortingMethod
{
	

	public static void main(String[] args) 
	{
		int arr[] = {55,66,32,52,45,66,7,84};
		int f_larg = findf_larg(arr);
		System.out.println(f_larg);
		


	}

	private static int findf_larg(int[] arr)
	{
		int n= arr.length;
		Arrays.sort(arr);
		int k=5;
		

		return arr[n-k];
	}

}

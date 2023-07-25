package FridayWkEnd;

import java.util.Arrays;

public class HighestArray {

	public static void main(String[] args)
	{
		int arr[] = {9,8,3,2,1,0,5,6,4,8,7};
		int firsthighest = findfirsthighest(arr);
		System.out.println(" " + firsthighest);
		


	}

	private static int findfirsthighest(int[] arr)
	{
		int n =arr.length;
		Arrays.sort(arr);
		int k=1;
		return arr[n-k];
	}

}

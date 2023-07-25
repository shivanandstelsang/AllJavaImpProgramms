package FridayWkEnd;

import java.util.Arrays;

public class ThirdHighestArray {

	public static void main(String[] args) {
		int arr[] = {60,75,62,100,85,79,55,36};
		int T_Larg = findT_larg(arr);
		System.out.println(T_Larg);
		
}

	private static int findT_larg(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		int k=3;
		return arr[n-k];
	}
}
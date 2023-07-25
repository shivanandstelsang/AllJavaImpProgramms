package FridayWkEnd;

public class SecondLargestArray {

	public static void main(String[] args) {
		int arr[] = { 85, 99, 66, 77, 89, 25, 01, 23, 54 };
		int f_larg = arr[0];
		int s_larg = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > f_larg) {
				f_larg = s_larg;
				f_larg = arr[i];
			} else if (arr[i] > s_larg && arr[i] != f_larg) {
				s_larg = arr[i];
			}
		}
		System.out.println(s_larg);
	}

}

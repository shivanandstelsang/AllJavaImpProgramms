package ImpPrgms;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int arr[] = { 8, 0, 6, 7, 9, 1, 2, 3, 5, 4, 12, 5 };
		int f_largest = arr[0];
		int s_largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > f_largest) {
				s_largest = f_largest;
				f_largest = arr[i];
			} else if (arr[i] > s_largest && arr[i] != f_largest) {
				s_largest = arr[i];
			}
		}
		System.out.println(s_largest);
	}

}
	
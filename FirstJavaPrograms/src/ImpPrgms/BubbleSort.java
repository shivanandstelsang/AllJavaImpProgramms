package ImpPrgms;

public class BubbleSort {
	public static void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void printarray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
			System.out.println();

		}

	}

	public static void main(String[] args) {
		int arr[] = { 9, 6, 0, 1, 8, 7, 3, 2, 4, 5, 10 };
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
		bs.printarray(arr);

	}

}

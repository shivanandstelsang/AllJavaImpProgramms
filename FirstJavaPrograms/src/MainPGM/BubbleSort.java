package MainPGM;

public class BubbleSort {
	public void bubblesort(int[] arr)
	{
		int n =arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	}
	public void sort(int[] arr)
	{
		int n =arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		int arr[] = {10,5,89,62,1,7,0,5,3,2};
		b.bubblesort(arr);
		b.sort(arr);

	}

}

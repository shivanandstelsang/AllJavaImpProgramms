package FridayWkEnd;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int arr[] = {10,25,30,45,50,65,70};
		int f_larg = arr[0];
        int s_larg = arr[0];
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>f_larg)
        	{
        		s_larg=f_larg;
        		f_larg=arr[i];
        	}  else if(arr[i]>s_larg && arr[i]!=f_larg) {
        		s_larg=arr[i];
        	}
        }
        System.out.println(s_larg);
	}

}

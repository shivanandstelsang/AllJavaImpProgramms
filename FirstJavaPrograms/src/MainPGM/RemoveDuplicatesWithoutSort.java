package MainPGM;

import java.util.HashSet;

public class RemoveDuplicatesWithoutSort {
	public static void removeduplicate(int a[])
	{
	HashSet set = new HashSet();
	for(int i=0;i<a.length;i++)
	{
		set.add(a[i]);
	}
	System.out.println(set);
			}

	public static void main(String[] args) {
		int a[] = {10,29,6,3,4,5,64,4,5,6,7,8};
		removeduplicate(a);
	}

}

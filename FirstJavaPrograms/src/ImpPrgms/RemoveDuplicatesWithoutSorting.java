package ImpPrgms;

import java.util.HashSet;

public class RemoveDuplicatesWithoutSorting {
	public static void removeduplicates(int a[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	}

	public static void main(String[] args) {
		int a[] = {3,9,0,7,1,8,2,6,4,5};
		removeduplicates(a);
	}

}

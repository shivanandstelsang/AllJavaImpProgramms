package FridayWkEnd;

public class RemoveDuplicatePrintOutPut {

	public static void main(String[] args) {
		String str = "Remember";
		String res = "";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (res.indexOf(ch) < 0) {
				res = res + ch;
				//count++;

			}
		}
		System.out.println("After removing the duplicates : " + res);
		System.out.println("The length of the given string is : " + res.length());
	}

}

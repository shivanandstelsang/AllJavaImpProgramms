package FridayWkEnd;

public class RemoveDuplicatesCountChars {

	public static void main(String[] args) {
		String str = "aabcbcdeed";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (res.indexOf(ch) < 0) {
				res = res + ch;
			}
		}
		System.out.println("After removing the strings : " + res);
		System.out.println("length of the string after removing duplicate chars : " + res.length());

	}

}

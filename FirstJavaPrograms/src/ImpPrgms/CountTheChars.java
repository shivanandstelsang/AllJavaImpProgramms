package ImpPrgms;

public class CountTheChars {

	public static void main(String[] args) {
		String str = "the software testing includes manual and automation testing";
		String res = "";
		int count = 0;
		str = str.replaceAll("\\s", "");
		for (int i = 0; i < str.length(); i++) {
			res = res + str.charAt(i);
			count++;

		}
		System.out.println(count);
	}

}

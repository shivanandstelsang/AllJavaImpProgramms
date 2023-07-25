package ImpPrgms;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "RIVER";
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);

		}
		System.out.println(res);
	}

}

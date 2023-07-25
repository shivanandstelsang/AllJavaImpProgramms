package ScreenShots;

public class FindthesumofnumbersfromtheString {

	public static void main(String[] args) {
		String str = "virat scored 100 runs in 15 overs";
		String num = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num = num + str.charAt(i);
			} else {
				if (!num.equals("")) {
					sum = sum + Integer.parseInt(num);
					num = "";
				}
			}
		}
		System.out.println(sum);

	}

}




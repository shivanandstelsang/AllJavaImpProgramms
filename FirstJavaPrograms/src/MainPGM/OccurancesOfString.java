package MainPGM;

public class OccurancesOfString {

	public static void main(String[] args) {
		String str = "AMERICAUSA";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (res.indexOf(ch) < 0) {
				res = res + ch;
			}
		}
		for (int i = 0; i < res.length(); i++) {
			char ch = res.charAt(i);
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch + " " + "Occurances" + " " + count + " " + "times");
		}
	}

}

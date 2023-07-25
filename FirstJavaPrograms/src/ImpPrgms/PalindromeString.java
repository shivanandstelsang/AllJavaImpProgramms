package ImpPrgms;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "TATAT";
		String res = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
			if(str.equals(res)) {
				System.out.println("String is a palindrome");
		} else {
			System.out.println("String is not a palindrome");
		}
	}

}

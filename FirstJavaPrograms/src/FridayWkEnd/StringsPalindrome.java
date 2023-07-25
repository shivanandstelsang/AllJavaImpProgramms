package FridayWkEnd;

public class StringsPalindrome {

	public static void main(String[] args) {
		String str = "BubbleGum";
		String res = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			
				res=res+str.charAt(i);
			
		}
		
		if(res.equals(str))
				{
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

	}



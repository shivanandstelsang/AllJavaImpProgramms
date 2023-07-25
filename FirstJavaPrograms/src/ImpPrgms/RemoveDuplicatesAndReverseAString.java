package ImpPrgms;

public class RemoveDuplicatesAndReverseAString {

	public static void main(String[] args) {
		String str = "SSOFTWARE";
		String res = "";
		int count=0;
		for(int i=0;i<str.length();i++)
		//for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			if(res.lastIndexOf(ch)<0)
			{
				res=res+ch;
				count++;
			}
			
		}
		System.out.println("After removing duplicates : " +  res);
		System.out.println(res.length());
	}

}

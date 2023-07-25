package ImpPrgms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
String str = "the software testing includes manual and automation testing";
str = str.replaceAll("\\s", "");
System.out.println(str);

	}

}

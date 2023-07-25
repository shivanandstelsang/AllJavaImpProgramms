package ImpPrgms;

public class Swap2StringsWithout3rdVariable {

	public static void main(String[] args) {
		String a = "The";
		String b = "Moon";
		System.out.println("Before Swap : " + a + " " + b);
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After Swap : " + a + " " + b);
	}

}

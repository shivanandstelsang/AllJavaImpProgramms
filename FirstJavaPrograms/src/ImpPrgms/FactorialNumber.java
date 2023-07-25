package ImpPrgms;

public class FactorialNumber {

	public static void main(String[] args) {
		int i, fact = 1;
		int num = 10;
		for (i = 2; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}

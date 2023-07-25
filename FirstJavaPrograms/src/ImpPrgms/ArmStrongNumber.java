package ImpPrgms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int cube = 0, temp, r;
		int num = 100;
		temp = num;
		while (num > 0) {
			r = num % 10;
			cube = r * r * r + cube;
			num = num / 10;
		}
		if (temp == cube) {
			System.out.println("it is armstrong number");
		} else {
			System.out.println("not an armstrong number");
		}
	}

}

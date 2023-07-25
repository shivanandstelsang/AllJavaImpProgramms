package MainPGM;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int r = 0, cube = 0, temp = 0;
		int num = 122;
		temp = num;
		while (num > 0) {
			r = num % 10;
			cube = cube * cube * cube + r;
			num = num / 10;
		}
		if (cube == temp) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not an armstrong number");
		}
	}

}

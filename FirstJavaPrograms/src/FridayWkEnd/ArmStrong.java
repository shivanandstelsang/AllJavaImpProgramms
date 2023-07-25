package FridayWkEnd;

public class ArmStrong {

	public static void main(String[] args) {
		int r, cube = 0, temp;
		int num = 371;
		temp = num;
		while (num > 0) {
			r = num % 10;
			cube = r * r * r + cube;
			num = num / 10;
		}
		if (temp == cube) {
			System.out.println("The given number is : " + "armstrong number");
		} else {
			System.out.println("The given number is : " + "not an armstrong number");
		}
	}

}

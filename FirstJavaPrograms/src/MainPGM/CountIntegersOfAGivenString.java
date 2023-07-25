package MainPGM;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountIntegersOfAGivenString {

	public static void main(String[] args) {
		String str = "New Fz Bike Gives 50 km milage for an 1 litre of petrol";
		int sum = 0;
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			int number = Integer.parseInt(matcher.group());
			sum = sum + number;
		}
		System.out.println(sum);
	}

}

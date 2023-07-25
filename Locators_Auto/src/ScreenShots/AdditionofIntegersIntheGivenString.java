package ScreenShots;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdditionofIntegersIntheGivenString {

	public static void main(String[] args) {
		  String input = "virat scored 100 runs in 15 overs";
	        int sum = 0;

	        // Regular expression pattern to match integers
	        String regex = "\\d+";

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);

	        while (matcher.find()) {
	            int number = Integer.parseInt(matcher.group());
	            sum = sum + number;
	        }

	        System.out.println("Sum of integers: " + sum);
	}

}

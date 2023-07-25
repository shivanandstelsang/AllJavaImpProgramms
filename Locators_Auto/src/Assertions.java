import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Assertions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String actual = "Google";
		String expected ="Google";
		String message = "Test case is passed";
		//Assert.assertEquals(actual, expected);
		Assert.assertEquals(actual, expected, message);
		System.out.println("Assert.assertEquals(" + actual + ", " + expected + ", " + message + ");");
		boolean actual1 = true;
		boolean expected1 = false;
		
		Assert.assertEquals(actual1, expected1);

		
		
	}

}

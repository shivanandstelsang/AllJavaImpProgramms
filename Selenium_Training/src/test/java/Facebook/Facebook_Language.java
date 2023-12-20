package Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_Language {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Page_Title = driver.getTitle();
		String Page_Url = driver.getCurrentUrl();
		/*
		 * System.out.println(Page_Title); System.out.println(Page_Url);
		 */
		
		if(Page_Title.equals("Facebook – log in or sign up") && Page_Url.equalsIgnoreCase("https://www.facebook.com/"))
		{
			System.out.println("English language is displayed");
		}else {
			System.out.println("English language is not displayed");

		}
		
		driver.findElement(By.xpath("//*[contains(text(),'ಕನ್ನಡ')]")).click();
		String ಕನ್ನಡ_title = driver.getTitle();
		String ಕನ್ನಡ_Url = driver.getCurrentUrl();
		if(ಕನ್ನಡ_title.equals("Facebook - ಲಾಗ್ ಇನ್ ಅಥವಾ ಸೈನ್ ಅಪ್") && ಕನ್ನಡ_Url.equalsIgnoreCase("https://kn-in.facebook.com/"))
		{
			System.out.println("ಕನ್ನಡ language is displayed");
		} else
		{
			System.out.println("ಕನ್ನಡ language is not displayed");
		}
		
		
		driver.findElement(By.xpath("//*[text()='हिन्दी']")).click();
		String Hindi_title = driver.getTitle();
		String Hindi_url = driver.getCurrentUrl();
		if(Hindi_title.equals("Facebook - लॉग इन या साइन अप करें") && Hindi_url.equalsIgnoreCase("https://hi-in.facebook.com/"))
		{
			System.out.println("Hindi language is displayed");
		} else {
			System.out.println("Hindi language is not displayed");
		}
		
		driver.findElement(By.xpath("//*[text()='اردو']")).click();
		String Urdu_title = driver.getTitle();
		String Urdu_Url = driver.getCurrentUrl();
		if(Urdu_title.equals("‫Facebook - لاگ ان کریں یا سائن اپ کریں‬") && Urdu_Url.equalsIgnoreCase("https://ur-pk.facebook.com/"))
		{
			System.out.println("Urdu language is displayed");
		} else {
			System.out.println("Urdu lanaguage is not displayed");
		}
		
		driver.findElement(By.xpath("//*[text()='தமிழ்']")).click();
		String Tamil_title = driver.getTitle();
		String Tamil_Url = driver.getCurrentUrl();
		if(Tamil_title.equals("Facebook - உள்நுழையவும் அல்லது பதிவுசெய்யவும்") && Tamil_Url.equalsIgnoreCase("https://ta-in.facebook.com/"))
		{
			System.out.println("Tamil language is displayed");
		} else
		{
			System.out.println("Tamil language is not dispalyed");
		}
	}
}
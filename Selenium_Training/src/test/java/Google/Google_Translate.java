package Google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.VerifyException;

public class Google_Translate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("app"));
		driver.findElement(By.xpath("//span[text()='Translate']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@aria-label='Source text' and //*[@class='er8xn']]")))
				.sendKeys("Selenium training class");
		// driver.findElement(By.xpath("//*[@class='rm1UF UnxENd']")).sendKeys("Selenium
		// training class");
		String Target_lang = driver.findElement(By.xpath("//*[@class='ryNqvb']")).getText();
		// String Source_lang = driver.findElement(By.xpath("//div[@class='lRu31' and
		// //*[@class='HwtZe']]")).getText();
		if (Target_lang.equals("Selenium training class")) {
			System.out.println("language translation is correct");
		} else {
			System.out.println("language translation is not correct");
		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@aria-label='Source text' and //*[@class='er8xn']]")).clear();
		driver.findElement(By.xpath("//*[@aria-label='Source text' and //*[@class='er8xn']]"))
				.sendKeys("It is a winter season");
		String Eng_Lang = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='ryNqvb']")))
				.getText();

		if (Eng_Lang.equals("It is a winter season")) {
			System.out.println("language translation is correct");
		} else {
			System.out.println("language translation is not correct");
		}
		
		//Dropdown selection
		//driver.findElement(By.xpath("//div[@class='aCQag']//button[@aria-label='More source languages']//div[@class='VfPpkd-Bz112c-RLmnJb']")).click();
	//	WebElement Afrikaans_lang = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'Llmcnf')])[2]")));
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Inject jQuery
     //	js.executeScript("arguments[0].click()", Afrikaans_lang);
		//Thread.sleep(5000);
		
	///WebElement afrikaans = driver.findElement(By.xpath("//*[@aria-label='Source text' and //*[@class='er8xn']]"));
	//afrikaans.clear();
	//afrikaans.sendKeys("How are you?");
	
	WebElement Second_dp = driver.findElement(By.xpath("(//*[@class='VfPpkd-Bz112c-Jh9lGc' and //*[@jsname='s3Eaab']])[4]"));
	js.executeScript("arguments[0].click()", Second_dp);
	driver.findElement(By.xpath("(//div[text()='Dutch' ])[2]")).click();
	String detected_eng = driver.findElement(By.xpath("//*[@aria-label='Source text']")).getText();
	String dutch = driver.findElement(By.xpath("(//*[@class='ryNqvb'])[1]")).getText();
	if(dutch.equalsIgnoreCase("Hoe is het met je?"))
	{
		System.out.println("translation is correct");
	} else
	{
		System.out.println("translation is not correct");
	}
	
	
	//public static  VerifyException(WebDriver driver, )
	
	}
}

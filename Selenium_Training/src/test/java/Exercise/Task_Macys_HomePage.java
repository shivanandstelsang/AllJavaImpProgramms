package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Macys_HomePage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.macys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("closeButton")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//span[normalize-space()='Home'])[1]")).click();
		
		  WebElement searchSubmit
		  =driver.findElement(By.xpath("(//*[contains(text(),'Home')])[4]"));
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		  wait.until(ExpectedConditions.elementToBeClickable(searchSubmit)).click();
		 
		//driver.findElement(By.xpath("(//*[contains(text(),'Home')])[4]")).click();
	}

}

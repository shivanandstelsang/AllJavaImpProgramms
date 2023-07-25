import java.time.Duration;
import org.openqa.selenium.support.ui.Select;  

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class OpenChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver.exe");  
		   WebDriver driver= new ChromeDriver();  
		   driver.get("https://www.orangehrm.com/");
		  // String url =driver.getCurrentUrl();
		   //System.out.println(url);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		   Thread.sleep(3000);
		   //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(((//*[contains(@class,'btn btn-ohrm btn-contact-sales')])[2]")));
           driver.findElement(By.xpath("(//*[contains(@class,'btn btn-ohrm btn-contact-sales')])[2]")).click();
           driver.findElement(By.xpath("//*[contains(@placeholder,'Your Full Name*')]")).sendKeys("ram@yopmail.com");
           Thread.sleep(5000);
           //driver.findElement(By.xpath("//select[@id='Form_getForm_Country']")).click();
           Select dropdown = new Select(driver.findElement(By.id("Form_getForm_Country")));  
           dropdown.selectByVisibleText("India"); 
	}

}

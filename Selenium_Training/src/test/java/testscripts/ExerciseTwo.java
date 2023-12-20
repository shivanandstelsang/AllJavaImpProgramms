package testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import commonclasses.BrowserActions;
import commonclasses.MessageVerifications;
import commonclasses.DriversInitialization;

public class ExerciseTwo {

	public static void main(String[] args) throws InterruptedException {
		DriversInitialization dobj = new DriversInitialization();
		WebDriver driver = dobj.initializeChromeDriver();
		
		BrowserActions browser = new BrowserActions();
		browser.openURL(driver, "https://www.facebook.com/");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
		driver.findElement(By.name("login")).click();
		
		MessageVerifications msgv = new MessageVerifications();
		msgv.verifyTextMessage(driver, By.xpath("//div[@class='_9ay7']"), "The password that you've entered is incorrect. ");
		
		
		
		
	}

}

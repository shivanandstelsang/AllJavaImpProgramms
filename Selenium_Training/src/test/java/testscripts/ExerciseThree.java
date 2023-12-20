package testscripts;
import org.openqa.selenium.By;
import commonclasses.MessageVerifications;

import org.openqa.selenium.WebDriver;

import commonclasses.DriversInitialization;
import commonclasses.BrowserActions;
import commonclasses.ElementVerification;
public class ExerciseThree {

	public static void main(String[] args) throws InterruptedException {
		DriversInitialization di3 = new DriversInitialization();
		WebDriver driver = di3.initializeChromeDriver();
		
		BrowserActions ba = new BrowserActions();
		ba.openURL(driver, "https://www.facebook.com/");
		
		ElementVerification ev = new ElementVerification();
		ev.verifyLogo(driver, By.xpath("//*[@class='fb_logo _8ilh img']"), "Facebook");
		
		MessageVerifications mv = new MessageVerifications();
		mv.verifyTextMessage(driver, By.xpath("//*[@class='_8eso']"), "Facebook helps you connect and share with the people in your life.");
		
		////a[text()='Forgotten password?']
		mv.verifyTextMessage(driver, By.xpath("//a[text()='Forgotten password?']"), "Forgotten password");
		
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//div[@class='_6lux' and //input[@class='inputtext _55r1 _6luy']])[1]")).sendKeys("test@gmail.com");
		//driver.findElement(By.xpath("(//div[@class='_6lux' and //input[@class='inputtext _55r1 _6luy']])[2]")).sendKeys("test@gmail.com");
		//driver.findElement(By.xpath("(//div[@class='_6ltg' and //button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']])[1]")).click();
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@gmail.com");
		driver.findElement(By.name("login")).click();
		
		mv.verifyTextMessage(driver, By.xpath("//div[@class='_9ay7']"), "The password that you've entered is incorrect");			
		
		
	}

}

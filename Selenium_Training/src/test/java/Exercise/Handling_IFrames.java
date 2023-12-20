package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_IFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//JavascriptExecutor js = new JavascriptExecutor();
		driver.findElement(By.xpath("//*[text()='Frames']")).click();
		driver.findElement(By.xpath("//*[text()='iFrame']")).click();
		Thread.sleep(5000);
	
		WebElement element = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
		driver.switchTo().frame(element);	
		driver.findElement(By.xpath("(//*[text()='Your content goes here.'])")).clear();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//*[text()='Format'])")).click();
	}

}
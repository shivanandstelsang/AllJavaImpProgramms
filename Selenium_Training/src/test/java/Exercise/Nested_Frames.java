package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[text()='Nested Frames']")).click();	
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement ele = driver.findElement(By.xpath("//*[@name='frame-left']"));
		driver.switchTo().frame(ele);
        //WebElement elementInsideFrame = driver.findElement(By.tagName("body"));
      //  System.out.println("Text inside frame-left: " + elementInsideFrame.getText());

	}

}

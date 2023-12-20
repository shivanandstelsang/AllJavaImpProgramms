package Exercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Task_Javascript_Examples {

	private static final int ElE = 0;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.dev.pass2park.it/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * Object ELE = js.executeScript("window.scrollBy(0, 500)"); for(int
		 * i=0;i<ElE;i++) { System.out.println(ElE); }
		 */
		//js.executeScript("window.scrollBy(0, 1000)");
		//js.executeScript("document.getElementById('//*[text()='A/B Testing']').click()");
		
		//WebElement clk = driver.findElement(By.xpath("//*[text()='A/B Testing']"));
		//js.executeScript("arguments[0].click()", clk );
		//js.executeScript("document.getElementById('email').value='admin@pass2parkit.com'");
		
		WebElement fcm_ct = driver.findElement(By.xpath("(//*[@class='form-control'])[1]"));
		String ans = "admin@pass2parkit.com";
		js.executeScript("arguments[0].value= arguments[1]", fcm_ct, ans);
		
	}

}

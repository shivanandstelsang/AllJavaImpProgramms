package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_KeyBoard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.dev.pass2park.it/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		WebElement mail = driver.findElement(By.id("email"));
		act.sendKeys(mail, "admin@pass2parkit.com").perform();
		WebElement pass_word = driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
		act.sendKeys(pass_word, "1122336677").perform();
		act.sendKeys(Keys.CONTROL);
		act.sendKeys(Keys.ENTER);
		
	}

}

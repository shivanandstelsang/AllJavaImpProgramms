package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

public class P2P_LoginFlow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.dev.pass2park.it/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("admin@pass2parkit.com");
		driver.findElement(By.xpath("//*[starts-with(@placeholder,'Account Password')]")).sendKeys("1122336677");
		driver.findElement(By.xpath("(//*[contains(text(),'Sign-In')])[3]")).click();
		
		//Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		FluentWait wait = new FluentWait(driver);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Customer Service']")));
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.ignoring(Exception.class);
		WebElement element = driver.findElement(By.xpath("//*[text()='Customer Service']"));

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

}

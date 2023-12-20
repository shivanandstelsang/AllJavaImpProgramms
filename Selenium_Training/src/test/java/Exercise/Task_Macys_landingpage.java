package Exercise;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Macys_landingpage {
	@Test
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.macys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Alert alert = driver.switchTo().alert();

		WebElement Popup = driver.findElement(By.xpath("//*[@id='headline']"));
		// System.out.println(avg.getText());
		if (Popup.isDisplayed()) {
			System.out.println("Now Shipping to India Pop up is displayed");
		} else {
			System.out.println("Pop up is not displayed");
		}

		WebElement Actual_flag = driver.findElement(By.xpath("//*[@id='flag']"));
		System.out.println(Actual_flag.getText());
		String Expected = "Country flag is displayed on popup";
		if (Actual_flag.isDisplayed()) {
			System.out.println("Country flag is displayed on popup");
		} else {
			System.out.println("Country flag is not displayed on popup");
		}

		// assert.assertEquals(Actual_flag, Expected);
		driver.findElement(By.id("closeButton")).click();
		Thread.sleep(2000);

		// System.out.println(driver.findElement(By.id("logo")).getText());
		WebElement Macys_logo = driver.findElement(By.xpath("//*[@id='logo']"));
		// System.out.println(Macys_logo.getText());
		if (Macys_logo.isDisplayed()) {
			System.out.println("Macy's Logo is displayed");
		} else {
			System.out.println("Macy's Logo is not displayed");
		}
		Thread.sleep(5000);
		WebElement Search_bar = driver.findElement(By.xpath("//*[@id='globalSearchInputField']"));
		if (Search_bar.isDisplayed()) {
			System.out.println("Search bar is displayed on the Landing Page");
		} else {
			System.out.println("Search bar is not displayed on the Landing Page");
		}

		/*
		 * Actions act = new Actions(driver); WebElement Search_overlay =
		 * driver.findElement(By.xpath("//input[@name='keyword']")); Thread.sleep(5000);
		 * act.keyDown(Keys.ENTER); act.keyUp(Keys.CONTROL); //Search_overlay.click();
		 */
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id='searchSubmit']")).click();

		// ...//*[@id="globalSearchInputField"]

		 WebElement searchSubmit =driver.findElement(By.xpath("//*[@id='globalSearchInputField']")); 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 wait.until(ExpectedConditions.elementToBeClickable(searchSubmit)).click();
		
	}

}

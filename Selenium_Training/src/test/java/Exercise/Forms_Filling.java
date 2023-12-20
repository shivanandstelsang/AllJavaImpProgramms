package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Forms_Filling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//a[text()='Complete Web Form'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Shiva");
		driver.findElement(By.id("last-name")).sendKeys("Telsang");
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("Quality_Analyst");
		driver.findElement(By.id("radio-button-2")).click();
		driver.findElement(By.xpath("//*[@id='checkbox-1']")).click();
		//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		//Thread.sleep(5000);
		WebElement dpwn = driver.findElement(By.id("select-menu"));
		dpwn.click();
		Select s = new Select(dpwn);
		s.selectByIndex(2);
		driver.findElement(By.id("datepicker")).sendKeys("11/29/2023");
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		//System.out.println(driver.findElement(By.xpath("//*[text()='Thanks for submitting your form']")).getText());
		WebElement element = driver.findElement(By.xpath("//*[text()='Thanks for submitting your form']"));
		if(element.isDisplayed())
		{
			System.out.println(element.getText());
			//System.out.println("message is displayed");
		}else
		{
			System.out.println("message is not displayed");
		}
		
		driver.quit();


	}

}

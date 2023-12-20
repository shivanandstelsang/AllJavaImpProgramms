package Exercise;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Exercise_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[contains(text(),'Autocomplete')])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Banaglore");
		driver.findElement(By.xpath("//*[@id='street_number']")).sendKeys("VijayaNagar");
		driver.findElement(By.xpath("//*[@id='route']")).sendKeys("UB_City");
		driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("BTM_Layout");
		driver.findElement(By.xpath("//*[@id='administrative_area_level_1']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//*[@id='postal_code']")).sendKeys("591248");
		driver.findElement(By.xpath("//*[@id='country']")).sendKeys("India");
		
		

	}

}

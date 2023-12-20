package Make_My_Trip_TC3;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Make_My_Trip_NormalFlows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("notification-frame-~2514310ca"));
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.switchTo().defaultContent();
		
		//Step-1, Click on the one way radio button
		driver.findElement(By.xpath("//li[contains(@class,'selected')]//span[@class='tabsCircle appendRight5']")).click();
		System.out.println("Step-1 : " + " Selected \"One Way\" radio button ");

		// Step-2, Select From city as BLR
		driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']//*[@for='fromCity']")).click();
		Thread.sleep(1000);
       // driver.findElement(By.xpath("//*[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("BLR");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")));
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("BLR");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//div[@class='makeFlex hrtlCenter']")).click();
		System.out.println("Step-2 : " + " Select From city as BLR ");
		
		
		// Step-3, Select To city as HBX
		driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']//label[@for='toCity']")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")));
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")).sendKeys("HBX");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(@id,'react-autowhatever-1-section-0-item-0')]//div[contains(@class,'makeFlex hrtlCenter')]")).click();
		System.out.println("Step-3 : " + " Select to city as HBX ");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox dates inactiveWidget ')]//label[contains(@for,'departure')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'dateInnerCell')]//*[contains(text(),'23')])[1]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox flightTravllers inactiveWidget ')]")).click();
		driver.findElement(By.xpath("//li[contains(@data-cy,'adults-3')]")).click();
		driver.findElement(By.xpath("//li[contains(@data-cy,'children-5')]")).click();
		driver.findElement(By.xpath("//li[contains(@data-cy,'infants-2')]")).click();
		driver.findElement(By.xpath("//li[contains(@data-cy,'travelClass-1')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@data-cy,'travellerApplyBtn')]")).click();
		
		
	}

}

package Myntra_TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;

public class Tc1_LandingPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Step-2,  Navigate to KIDS-->Watches
		Actions act = new Actions(driver);
		WebElement Kids = driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[3]"));
		act.moveToElement(Kids).build().perform();
		//driver.findElement(By.xpath("(//a[text()='Watches'])[1]")).click();

		WebElement Watches =driver.findElement(By.xpath("(//a[text()='Watches'])[2]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(Watches)).click();

		//Step-3, boys
		driver.findElement(By.xpath("//*[text()='Boys']")).click();

		//Step-4, Select "Better Discount" from Sort By dropdown list
		Actions action = new Actions(driver);
		WebElement Select_dropdown = driver.findElement(By.xpath("(//*[text()='Recommended'])[1]"));
		action.moveToElement(Select_dropdown).build().perform();
		driver.findElement(By.xpath("//*[text()='Better Discount']")).click();

		//Step-5,  Select Age as "10Y-12Y"
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Age']")).click();
		driver.findElement(By.xpath("(//*[@class='common-checkboxIndicator'])[27]")).click();

		//Step-6,  Click on any product
		driver.findElement(By.xpath("(//*[text()='Marvel'])[2]")).click();

		//Step-7, Switch to new window and capture product name & price
		Set<String> Window_Handle = driver.getWindowHandles();
		Iterator<String> ITR = Window_Handle.iterator();
		String Parent_Window = ITR.next();
		String Child_Window = ITR.next();
		driver.switchTo().window(Child_Window);

		Thread.sleep(3000);
		String Product_name = driver.findElement(By.xpath("(//*[text()='Marvel'])[2]")).getText();

		WebElement Product_price =driver.findElement(By.xpath("//span[@class='pdp-price']"));
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.elementToBeClickable(Product_price));
		Product_price.getText();

		//String Product_price = driver.findElement(By.xpath("//span[@class='pdp-price']//*[text()='₹479']")).getText();
		System.out.println("Product_name is : " + Product_name);
		System.out.println("Product_price is : " + Product_price);

		//Step-8,  Click on "Add to Bag" button and verify ADDED TO BAG message

		WebElement AddToBag =driver.findElement(By.xpath("//*[text()='ADD TO BAG']"));
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait2.until(ExpectedConditions.elementToBeClickable(AddToBag)).click();

		//WebElement AddToBag = driver.findElement(By.xpath("//*[text()='ADD TO BAG']"));
		//AddToBag.click();

		/*
		 * if(AddToBag.isDisplayed()) {
		 * System.out.println("Product is successfully added to bag"); } else {
		 * System.out.println("Product is not added to bag"); }
		 */

		//Step-9, Click on GO TO BAG button
		driver.findElement(By.xpath("//*[text()='Bag']")).click();

		//Step-10,  Verify Product name, Price & Quantity
		String P_name = driver.findElement(By.xpath("(//*[text()='Marvel'])[1]")).getText();
		System.out.println("P_name is : " + P_name);
		String P_price = driver.findElement(By.xpath("//*[@class='itemComponents-base-price itemComponents-base-bold ']")).getText();
		System.out.println("P_price is : " + P_price);
		String P_quantity = driver.findElement(By.xpath("//*[@class='itemComponents-base-quantity']")).getText();
		System.out.println(P_quantity);
		
		//Step-11, Retrieve PRICE DETAILS and validate the calculations (Total MRP + Fee) - Discount = TOTAL
		//String Price_details = driver.findElement(By.xpath("//*[@class='priceBlock-base-container']")).getText();
		//System.out.println(Price_details);
		
		String Total_MRP = driver.findElement(By.xpath("(//div[@class='priceDetail-base-row '])[1]")).getText();
		System.out.println("Total_MRP is : " + Total_MRP);
		
		//Step-12,  Capture page screenshot
		File TS = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(TS, new File("E:\\TakeScreenshots.png"));
		
		

	}
}

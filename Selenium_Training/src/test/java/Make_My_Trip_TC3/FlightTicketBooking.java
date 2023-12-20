package Make_My_Trip_TC3;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class FlightTicketBooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Frame = driver.findElement(By.xpath("//*[@name='notification-frame-~197139405']"));
		driver.switchTo().frame(Frame);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@class,'wewidgeticon we_close')]")).click();

		// Step-2, Logo is present
		boolean logo = driver.findElement(By.xpath("//*[contains(@class,'mmtLogo makeFlex')]")).isDisplayed();
		if (logo) {
			System.out.println("Step-1: " + " Logo is present ");
		} else {
			System.out.println("Logo is not present");
		}

		// Step-3, Select "One Way" radio button
		driver.findElement(By.xpath("(//*[contains(@class,'tabsCircle appendRight5')])[1]")).click();
		System.out.println("Step-3 : " + " Selected \"One Way\" radio button ");

		// Step-4, Select From city as SFO
		driver.findElement(By.xpath("(//*[contains(@class,'flt_fsw_inputBox searchCity inactiveWidget ')])[1]"))
				.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]")))
				.sendKeys("SFO");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		System.out.println("Step-4 : " + " Selected From city as SFO ");

		// Step-5, Select To city as DEL
		driver.findElement(By.xpath("//*[@class='flt_fsw_inputBox searchToCity inactiveWidget ']")).click();
		Thread.sleep(2000);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='To']"))).sendKeys("DEL");
		// wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='react-autosuggest__input
		// react-autosuggest__input--open']"))).sendKeys("DEL");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")).click();
		System.out.println("Step-5 : " + " Selected To city as DEL ");

		// Step-6, Select Departure date as 31-Dec-2023
		driver.findElement(By.xpath("(//*[@class='dateInnerCell'])[31]")).click();
		System.out.println("Step-6 : " + " Selected Departure date as 31-Dec-2023 ");

		// Step-7, Click on Search
		driver.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		System.out.println("Step-7 : " + " Clicked on the search");

		// Step-8, Select Filters --> 1 Stop
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='bgProperties  overlayCrossIcon icon20']")).click();
		WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait11.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"(//div[@class='makeFlex spaceBetween appendBottom12']//span[@class='commonCheckbox sizeSm primaryCheckbox'])[3]")))
				.click();
		// driver.findElement(By.xpath("(//div[@class='makeFlex spaceBetween
		// appendBottom12']//span[@class='commonCheckbox sizeSm
		// primaryCheckbox'])[2]")).click();
		System.out.println("Step-8 : " + " Selected filter as 1 Stop");

		// Step-9, Select "Emirates" under Alliances & Airlines
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 1500)");
		driver.findElement(By.xpath("(//*[@class='linkText pointer'])[2]")).click();
		WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait111.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"(//div[@class='makeFlex spaceBetween appendBottom12']//span[@class='commonCheckbox sizeSm primaryCheckbox'])[23]")))
				.click();
		System.out.println("Step-9 : " + " Selected \"Emirates\" under Alliances & Airlines");

		// Step-10, Click on "VIEW PRICES" for First Flight
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='ViewFareBtn  text-uppercase  clusterBtn']//span[text()='View Prices']")).click();
		System.out.println("Step-10 : " + " Click on \"VIEW PRICES\" for First Flight");

		// Step-11, Select BOOK NOW button
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		System.out.println("Selected BOOK NOW button");

		// Step-12, Verify Source & Destination cities and Departure Date
		Set<String> Window_Handle = driver.getWindowHandles();
		Iterator<String> ITR = Window_Handle.iterator();
		String Parent_Window = ITR.next();
		String Child_Window = ITR.next();
		driver.switchTo().window(Child_Window);
		Thread.sleep(5000);
		// WebElement Source_Dest =
		// driver.findElement(By.xpath("//*[@class='blackFont']//*[text()='San Francisco
		// → New Delhi']"));
		WebElement Source_Dest = driver.findElement(By.xpath("//b[contains(text(),'San Francisco → New Delhi')]"));
		String name = Source_Dest.getText();
		if (Source_Dest.isDisplayed()) {
			System.out.println("Step-12 : " + name);
		} else {
			System.out.println("Step-12 : " + " name : " + " not displayed");

		}

		// Departure date
		WebElement Departure_date = driver
				.findElement(By.xpath("//*[@class='appendTop10 makeFlex gap-x-10']//span[@class='scheduleDay']"));
		String date = Departure_date.getText();
		if (Departure_date.isDisplayed()) {
			System.out.println("Departure date is displayed : " + date);
		} else {
			System.out.println("Departure date is not displayed");
		}

		// Step-13, Verify Base Fare, Taxes & Total Amount
		WebElement Base_fare = driver.findElement(By.xpath("(//div[@class='fareTypeWrap']//div[@class='fareRow'])[1]"));
		WebElement Taxes_fee = driver.findElement(By.xpath("(//div[@class='fareTypeWrap']//div[@class='fareRow'])[2]"));
		String b_fare = Base_fare.getText();
		String t_fee = Taxes_fee.getText();
		if (Base_fare.isDisplayed()) {
			System.out.println("Base_fare is : " + b_fare + " is displayed");
		} else {
			System.out.println("Base_fare is not displayed");
		}

		if (Taxes_fee.isDisplayed()) {
			System.out.println("taxes_fee is : " + b_fare + " is displayed");
		} else {
			System.out.println("taxes_fee is not displayed");
		}

		WebElement Total_amount = driver.findElement(By.xpath("//div[@class='fareFooter']//p[@class='fareRow']"));
		String amount = Total_amount.getText();
		if (Total_amount.isDisplayed()) {
			System.out.println(" Total amount is :" + amount + " is displayed");
		} else {
			System.out.println("Total amount is not displayed");
		}
		
		//Step-14, Select "No, I’ll book without insurance." radio button
		Thread.sleep(4000);
		JavascriptExecutor js1 = ((JavascriptExecutor)driver);
		js1.executeScript("window.scrollTo(0, 1500)");
		WebDriverWait Radio_button = new WebDriverWait(driver, Duration.ofSeconds(60));
		Radio_button.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[@class='radioboxContainer ']//span[@class='customRadioBtn sizeSm primary '])[2]"))).click();
		System.out.println("Step-14 : " + " Selected 'No, I’ll book without insurance.' radio button");
		
		//Step-15,  Click on "ADD NEW ADULT" link
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='otherList']//button[@class='addTravellerBtn']")).click();
        System.out.println("Clicked on 'ADD NEW ADULT' link");
        
        //Step-16,  Fill all mandatory fields with test data
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys("RajaNivas");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("vinay");
       Thread.sleep(5000);
        WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(50));
        wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@tabindex='0']"))).click();
       // wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown__control css-yk16xz-control']//div[@class='dropdown__value-container dropdown__value-container--has-value css-1hwfws3']//*[text()='India(91)']"))).sendKeys("India(91)");
      // driver.findElement(By.xpath("//div[@class='dropdown__control css-yk16xz-control']//div[@class='dropdown__value-container dropdown__value-container--has-value css-1hwfws3']")).sendKeys("India(91)");
	
	driver.findElement(By.xpath("//div[text()='Nationality']")).click();
	driver.findElement(By.xpath("//div[text()='India']")).click();
	driver.findElement(By.xpath("(//div[@class='dropdown__value-container css-1hwfws3']//div[text()='Date'])[1]")).click();
	driver.findElement(By.xpath("//div[@id='react-select-4-option-30']")).click();
	driver.findElement(By.xpath("(//div[text()='Month'])[1]")).click();
	driver.findElement(By.xpath("//div[@id='react-select-5-option-11']")).click();
	driver.findElement(By.xpath("(//div[text()='Year'])[1]")).click();
	driver.findElement(By.xpath("//div[@id='react-select-6-option-22']")).click();
	
	driver.findElement(By.xpath("(//input[@class='tvlrInput '])[3]")).sendKeys("123654");
	driver.findElement(By.xpath("//div[@class='dropdown__value-container css-1hwfws3']//div[text()='Passport Issuing Country']")).click();
	driver.findElement(By.xpath("//div[@id='react-select-7-option-0']")).click();
	
	driver.findElement(By.xpath("//div[@class='dropdown__value-container css-1hwfws3']//div[text()='Date']")).click();
	driver.findElement(By.xpath("//div[@id='react-select-8-option-29']")).click();
	//Thread.sleep(4000);
	//driver.findElement(By.xpath("(//div[@class='dropdown__control css-yk16xz-control']//div[text()='Month'])[2]")).click();
	//driver.findElement(By.xpath("//div[@id='react-select-9-option-0']")).click();
	
	driver.findElement(By.xpath("//label[text()='Passport Expiry']/following-sibling::div//div[text()='Month']")).click();
	driver.findElement(By.xpath("//label[text()='Passport Expiry']/following-sibling::div//div[text()='Jan']")).click();
	driver.findElement(By.xpath("//label[text()='Passport Expiry']/following-sibling::div//div[text()='Year']")).click();
	driver.findElement(By.xpath("//label[text()='Passport Expiry']/following-sibling::div//div[text()='2030']")).click();
	
	driver.findElement(By.xpath("//label[text()='Mobile No']/following-sibling::input[@class='tvlrInput ']")).sendKeys("7776665555");
	driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@class='tvlrInput ']")).sendKeys("test1@gmail.com");
	System.out.println("Step-16 : " + " Filled all mandatory fields with test data");
	
	//Step-17, Check "Confirm and save billing details to your profile"
	//WebDriverWait check_box = new WebDriverWait(driver, Duration.ofSeconds(30));
	JavascriptExecutor cb = ((JavascriptExecutor)driver);
	WebElement Check_box = driver.findElement(By.xpath("//span[@class='checkboxWpr']//b"));
	cb.executeScript("arguments[0].click();", Check_box);
	System.out.println("Step-17 : " + " Checked, Confirm and save billing details to your profile");
	Thread.sleep(5000);
	
	//Step-18, Click on CONTINUE button
	
	/*
	 * JavascriptExecutor cb1 = ((JavascriptExecutor)driver); WebElement
	 * Continue_button =
	 * driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
	 * cb1.executeScript("arguments[0].click();", Continue_button);
	 * Thread.sleep(5000);
	 */

	//JavascriptExecutor cbn = ((JavascriptExecutor)driver);
	//WebElement c_button = driver.findElement(By.xpath("//button[text()='Continue']"));
	//cbn.executeScript("arguments[0].click();", c_button );
	//System.out.println("Step 18: Clicked on Continue button");
	
	
	
	
	
	
	}
}

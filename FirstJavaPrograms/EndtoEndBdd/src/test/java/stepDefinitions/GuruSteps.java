package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruSteps {
	WebDriver driver;
	@Given("Open the Firefox and launch the application")
	public void open_the_firefox_and_launch_the_application() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/v4/");
	}

	@When("Enter the Username and Password")
	public void enter_the_username_and_password() {
		driver.findElement(By.xpath("//*[contains(@name,'uid')]")).sendKeys("username12");
		driver.findElement(By.xpath("//*[contains(@name,'password')]")).sendKeys("password12");
	   
	}

	@Then("Reset the credential")
	public void reset_the_credential() {
		driver.findElement(By.xpath("//*[contains(@name,'btnLogin')]")).click();
	  
	}

}

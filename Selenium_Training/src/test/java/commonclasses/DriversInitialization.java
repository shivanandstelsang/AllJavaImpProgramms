package commonclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriversInitialization {
	public WebDriver initializeChromeDriver()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");		
		WebDriver driver = new ChromeDriver(chromeOptions);
		return driver;
		
	}
	public WebDriver initializeFireFoxDriver() {		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions firefoxOptions  = new FirefoxOptions();
		firefoxOptions .addArguments("--remote-allow-origins=*");		
		WebDriver driver = new FirefoxDriver(firefoxOptions );
		
		return driver;
	}

}

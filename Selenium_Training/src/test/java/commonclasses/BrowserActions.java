package commonclasses;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
	public void openURL(WebDriver driver, String URL)
	{
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("Successfully navigated to : " + URL);
		}
	
	public void verifyPageTitle(WebDriver driver, String ExpectedTitle)
	{
		String ActualTitle = driver.getTitle();
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title is verified: expected : " + ActualTitle);
		} else
		{
			System.out.println("Title verification is failed : " + ActualTitle);
		}
	}
	public void verifyCurrentURL(WebDriver driver, String ExpectedURL)
	{
		String ActualURL = driver.getCurrentUrl();
		System.out.println("ActualURL : " + ActualURL);
		System.out.println("ExpectedURL : " + ExpectedURL);
		
		if(ActualURL.equals(ExpectedURL)) {
			System.out.println("URL is verified: Expected : " +  ActualURL);
		} else
		{
			System.out.println("URL verification is failed : " + ActualURL);
		}
	}
	public void closeBrowser(WebDriver driver)
	{
		driver.quit();
		System.out.println("current window is closed");
	}

}

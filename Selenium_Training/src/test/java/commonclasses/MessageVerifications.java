package commonclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MessageVerifications {
	public void verifyTextMessage(WebDriver driver, By Locator, String Expectedmessage)
	{
		String ActualMessage = driver.findElement(Locator).getText();
		if(Expectedmessage.contains(Expectedmessage))
		{
			System.out.println("message is verified : " + Expectedmessage);
		} else {
			System.out.println("message verification is failed : " + Expectedmessage);
		}
	}

}

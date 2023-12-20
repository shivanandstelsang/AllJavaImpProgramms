package commonclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementVerification {
public void verifyLogo(WebDriver driver, By Logolocator, String AppName) {
	boolean logo = driver.findElement(Logolocator).isDisplayed();
	if(logo)
	{
		System.out.println("logo is displayed : " + logo);
	} else
	{
		System.out.println("logo is not displayed : " + logo);
	}
}
}

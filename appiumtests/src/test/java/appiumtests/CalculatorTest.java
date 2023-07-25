package appiumtests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorTest {

	static AppiumDriver driver;
	public static void main(String[] args) throws Exception {
		try {
			openCalculator();
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
public static <MobileElement> void openCalculator() throws Exception {
	
DesiredCapabilities cap= new DesiredCapabilities();
cap.setCapability("deviceName", "Redmi Note 8 Pro");
cap.setCapability("udid", "gytshuauqknb7t6d");
cap.setCapability("platformName", "Android");
cap.setCapability("platformVersion", "11");
cap.setCapability("appPackage", "com.google.android.calculator");
cap.setCapability("appActivity", "com.android.calculator2.Calculator");

URL url = new URL("http://0.0.0.0:4723/wd/hub");
driver = new AppiumDriver(url, cap);
System.out.println("Appium started");

}
	}



package testscripts;
import org.openqa.selenium.WebDriver;
import commonclasses.BrowserActions;
import commonclasses.DriversInitialization;
public class ExerciseOne {

	public static void main(String[] args) {
		DriversInitialization obj = new DriversInitialization();
		WebDriver driver = obj.initializeChromeDriver();
		
		BrowserActions action = new BrowserActions();
		action.openURL(driver, "https://the-internet.herokuapp.com");
		
		action.verifyPageTitle(driver, "The Internet");
		action.verifyCurrentURL(driver, "https://the-internet.herokuapp.com/");
		
	}

}

package testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import commonclasses.BrowserActions;
import commonclasses.MessageVerifications;
import commonclasses.DriversInitialization;
public class ExerciseFour {

	public static void main(String[] args) throws InterruptedException {
		DriversInitialization drv = new DriversInitialization();
		WebDriver driver = drv.initializeChromeDriver();

		BrowserActions bwa = new BrowserActions();
		bwa.openURL(driver, "https://www.techlistic.com/p/selenium-practice-form.html");

		MessageVerifications msg = new MessageVerifications();
		msg.verifyTextMessage(driver, By.xpath("//*[text()='Demo Automation Practice Form']"), "Demo Automation Practice Form");
		msg.verifyTextMessage(driver, By.xpath("//*[text()='AUTOMATION PRACTICE FORM']"), "AUTOMATION PRACTICE FORM");

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mitchel");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Starc");

		//Gender selection
		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		gender.click();
		boolean isSelected = gender.isDisplayed();
		if(isSelected)
		{
			System.out.println("Male gender is selected : " + isSelected);
		} else
		{
			System.out.println("male gender is not selected : " + isSelected);
		}

		//Years of Experience
		WebElement Exp = driver.findElement(By.xpath("(//input[@name='exp'])[3]"));
		Exp.click();
		boolean Exp_selection = Exp.isSelected();
		if(Exp_selection)
		{
			System.out.println("Years of Experience is selected : " + Exp_selection);
		} else {
			System.out.println("Years of Experience is not selected : " + Exp_selection);
		}
		
		//Display Date 
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("20-12-2023");
		boolean date_picker = date.isDisplayed();
		if(date_picker)
		{
			System.out.println(date_picker + " : Date is displayed");
		} else {
			System.out.println(date_picker + " : Date is not displayed");
		}
		
		//Profession
		WebElement Profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
		Profession.click();
		boolean prof_select = Profession.isSelected();
		if(prof_select)
		{
			System.out.println(prof_select + " : Profession is selected");
		} else {
			System.out.println(prof_select + " : Profession is not selected");
		}
		
		
		
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='continents']"));
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		
		//Selenium-commands
		WebElement Selenium_commd = driver.findElement(By.xpath("//*[text()='WebElement Commands']"));
		Selenium_commd.click();
		boolean Sel_cmd = Selenium_commd.isEnabled();
		if(Sel_cmd)
		{
			System.out.println(Sel_cmd + " : Selenium command is enabled");
		} else {
			System.out.println(Sel_cmd + " : Selenium command is not enabled");
		}
		
		WebElement button = driver.findElement(By.xpath("//*[@class='button' and //*[@id='submit']]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		js.executeScript("arguments[0].click()", button);
		boolean btn = button.isSelected();
		if(btn)
		{
			System.out.println(btn + " : button is selected");
		} else {
			System.out.println(btn + " : button is not selected");
		}
		


	}

}

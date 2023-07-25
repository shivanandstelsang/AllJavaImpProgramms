import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver.exe");  
		   WebDriver driver= new ChromeDriver();  
		   driver.get("https://www.makemytrip.com/railways/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  /* driver.findElement(By.xpath("//*[contains(@class,'makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut')]")).click();
		   driver.findElement(By.xpath("//*[@id='username']")).sendKeys("ram@yopmail.com");
		   driver.findElement(By.xpath("//*[@class='capText font16']")).click();
		   driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
		   driver.findElement(By.xpath("//*[text()='Login']")).click(); */
		   driver.findElement(By.xpath("//*[contains(@class,'makeFlex hrtlCenter column active')]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//span[normalize-space()='From']")).click();
		   
		   
		  List<WebElement> allOptions = driver.findElements(By.xpath("//*[@id='react-autowhatever-1']"));
		  String option = "Bengaluru";
		  for(WebElement el:allOptions) {
			  if(el.getText().contains(option)) {
				  el.click();
			  }
		  /* for (WebElement element : elements) {
		       String text = element.getText();
		       if (text.equalsIgnoreCase("Bengaluru, India")) {
		    	   System.out.println(element);
		    	   System.out.println(text);
		           element.click();
		       }
		   }
*/
		   //Select s1 = new Select(driver.findElement(By.xpath("//*[@id='react-autowhatever-1']")));
		   //s1.selectByVisibleText("Bengaluru, India");
		   
		   
		   
	}

}
}


package ScreenShots;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class takecreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Cdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver,30);
        Thread.sleep(5000);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       // try {
            FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Administrator\\Screenshots\\homepage0.png"));
        //} catch (IOException e) {
        //    System.out.println(e.getMessage());
        //}

        driver.close();
    }
}

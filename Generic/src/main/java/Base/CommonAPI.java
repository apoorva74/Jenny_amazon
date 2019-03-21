package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;
    String url = null;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/jenniferstephen/Documents/JavaPrograms/SeleniumProject1/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterClass
    public void cleanUp() {
        driver.close();
    }



}

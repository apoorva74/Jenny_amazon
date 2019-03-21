import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getTitle extends CommonAPI {

    public static void gettitlehome(){

        WebElement gettitle=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        gettitle = driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.primary-logo > a > img"));
        gettitle.click();

    }


}

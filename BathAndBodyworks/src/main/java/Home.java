import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home extends CommonAPI {

    public static void MethodtogobackHome(){

        WebElement gotoHome = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        gotoHome = driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.primary-logo > a > img"));
        gotoHome.click();
        driver.navigate().refresh();

    }

}

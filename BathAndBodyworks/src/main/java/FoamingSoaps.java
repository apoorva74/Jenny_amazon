import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoamingSoaps extends CommonAPI {

    public static void clickfoamingsoap() {
        WebElement foamingsoap=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        foamingsoap=driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(4) > li:nth-child(2) > a"));
        foamingsoap.click();

    }
}

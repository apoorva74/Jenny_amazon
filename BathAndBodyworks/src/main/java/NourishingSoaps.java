import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NourishingSoaps extends CommonAPI {
    public static void clicknourishingsoap() {
        WebElement nourishingsoap = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        nourishingsoap = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(4) > li:nth-child(4) > a"));
        nourishingsoap.click();
        driver.navigate().refresh();

    }
}

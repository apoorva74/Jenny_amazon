import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tulip extends CommonAPI {
    public static void clicktulip() {
        WebElement tulip = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        tulip = driver.findElement(By.cssSelector("#\\30 ea9d39d5fb6ada4351384ca10 > div.product-outline-block > a > div.product-cont > div.product-name"));
        tulip.click();
        driver.navigate().refresh();
        driver.navigate().back();

    }
}

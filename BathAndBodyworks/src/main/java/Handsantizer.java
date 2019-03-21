import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handsantizer extends CommonAPI {
    public static void clickhandsantizer() {
        WebElement sanitizer = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        sanitizer = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(6) > li:nth-child(1) > a"));
        sanitizer.click();
    }
}

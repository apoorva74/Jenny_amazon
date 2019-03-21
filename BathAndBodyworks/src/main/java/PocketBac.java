import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PocketBac extends CommonAPI {

    public static void clickpocketbac() {
        WebElement pocketBac = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        pocketBac = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(6) > li:nth-child(3) > a"));
        pocketBac.click();
    }
}

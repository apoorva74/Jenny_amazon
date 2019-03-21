import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SoapHolders extends CommonAPI {

    public static void clicksoapholder() {
        WebElement soapholder = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        soapholder = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(4) > li:nth-child(5) > a"));
        soapholder.click();
        driver.navigate().refresh();

    }
}

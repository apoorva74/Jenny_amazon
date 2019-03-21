import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExfoliatingSoap extends CommonAPI {

    public static void clickexfoliatingsoap() {
        WebElement exfoliatingsoap = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        exfoliatingsoap = driver.findElement(By.cssSelector("#secondary > div.active-sub-category > ul:nth-child(4) > li:nth-child(3) > a"));
        exfoliatingsoap.click();
    }
}

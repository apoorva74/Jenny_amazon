import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DogBarksproduct extends CommonAPI {

    public static void clickproductdog() {
        WebElement dogBarks = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        dogBarks = driver.findElement(By.cssSelector("#b43ebd2a7a9be55d555cc526c2 > div.product-outline-block > a > div.product-cont > div.product-name"));
        dogBarks.click();
        driver.navigate().back();
    }
}

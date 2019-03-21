import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickShop extends CommonAPI {

    public static void clickonshop(){
        WebElement clicksoap=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        clicksoap = driver.findElement(By.cssSelector("#hand-soaps-dropdown > a"));
        clicksoap.click();
    }
}

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shop extends CommonAPI {

    public static void shopto(){
        driver.navigate().back();
        WebElement gotoShop = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        gotoShop = driver.findElement(By.cssSelector("body"));
        gotoShop.click();


    }


}

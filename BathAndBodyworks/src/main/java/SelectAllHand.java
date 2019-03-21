import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAllHand extends CommonAPI {

    public static void clickhandsoaps(){
        WebElement allhandsoaps=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        allhandsoaps=driver.findElement(By.cssSelector("#secondary > div.filter-overflow > div.filter-content > div.active-sub-category > ul:nth-child(4) > li:nth-child(1) > a"));
        allhandsoaps.click();
    }
}

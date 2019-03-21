import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandleHolder extends CommonAPI {

    public static void clickcandleholder(){
        WebElement candle=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        candle=driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.productType.open > h3"));
        candle.click();
    }
}

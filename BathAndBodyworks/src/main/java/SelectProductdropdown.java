import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectProductdropdown extends CommonAPI {

    public static void handsoapproductdropdown(){
        WebElement handproduct=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        handproduct=driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.productType > h3 > i"));
        handproduct.click();
    }
}

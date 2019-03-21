import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FragranceCategory extends CommonAPI {

    public static void clickfragrancecategory() {
        WebElement category=null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        category=driver.findElement(By.cssSelector("#primary > div.search-result-options.top > div.filter-overflow > div.filters.refinements > div.refinement.fragranceCategory > h3 > i"));
        category.click();

    }
}

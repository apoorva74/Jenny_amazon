
import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Xls_Reader;

public class SearchByExcelData extends CommonAPI {
    static String amazonUrl = "https://www.amazon.com";

    public static void createAccount() {
//Reading data from Excel sheet
        Xls_Reader reader = new Xls_Reader("../SeleniumFramework---Group7/Amazon/src/main/TestData/testdata.xlsx");
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        driver.get(amazonUrl);
        for (int i = 2; i < 5; i++) {
            String searchField = reader.getCellData("Sheet1", "SearchData", i);
            System.out.println(searchField);
            WebElement searchBox = null;
            searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(searchField);
            searchBox.sendKeys(Keys.ENTER);
            CommonAPI.sleep();
        }
    }
}

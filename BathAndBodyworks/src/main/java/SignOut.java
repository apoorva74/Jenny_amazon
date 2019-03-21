import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignOut extends CommonAPI {

    public static void gosignout() {
        WebElement checkout = null;
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        checkout = driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > a > svg"));
        checkout.click();
        WebElement clicksignout=null;
        clicksignout=driver.findElement(By.cssSelector("#wrapper > header > div.top-banner.stickyOn > div.wrap > div.icon-items > ul > li > div > div > a.header-logout"));
        clicksignout.click();
        driver.navigate().refresh();
        String title = driver.getTitle();
        System.out.println(driver.getTitle());

    }
}

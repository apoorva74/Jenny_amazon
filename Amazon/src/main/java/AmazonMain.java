import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class AmazonMain extends CommonAPI {

    String url = "https://www.amazon.com";


    public void openBrowser() {
        driver.get(url);
    }

    public void Sigin() {
        driver.get(url);
        driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-1")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("lovely_jenny87@yahoo.com");
        driver.findElement(By.id("ap_password")).sendKeys("asdfghjkl1234567");
        driver.findElement(By.id("signInSubmit")).click();
    }

    public void Recommendationsforyou(){
        driver.get(url);
        Sigin();
        driver.findElement(By.cssSelector("body")).click();
        driver.navigate().refresh();
    }


    public void BrowserTitle() {
        driver.get(url);
        driver.getTitle();
        System.out.println(driver.getTitle());
    }

    public void Searchbar() {
        driver.get(url);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone xs");
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);

    }

    public void SearchItemsrefresh() {
        driver.get(url);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone xs");
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        driver.navigate().refresh();

    }

    public void Categories() {
        driver.get(url);
        List<WebElement> categories = driver.findElements(By.cssSelector("#searchDropdownBox"));
        for (WebElement search : categories) {
            System.out.println(search.getText());
        }
    }

    public void SearchDifferentitems() {
        driver.get(url);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone xs");
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(" Michael Kors Women's Jet Set Tote");
        driver.navigate().refresh();

    }

    public void SearchItem() {
        driver.get(url);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(" Michael Kors Women's Jet Set Tote");
        driver.navigate().back();
        driver.navigate().forward();
    }

    public void gobackandforthSearch() {
        driver.get(url);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Samsung mobiles");
        driver.navigate().back();
        driver.navigate().forward();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();

    }

    public void DisplayBag() {
        driver.get(url);
        WebElement bag = null;
        bag = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        bag.sendKeys("Michael kors handbags");
        bag = driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input"));
        bag.click();
        driver.findElement(By.cssSelector("#search > div.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(4) > div.s-result-list.sg-row > div:nth-child(4) > div > div > div > div:nth-child(2) > div:nth-child(1) > div > div > span > a > div > img")).click();
        driver.navigate().refresh();

    }

    public void selectgrid() {
        driver.get(url);
        driver.findElement(By.cssSelector("#nav-hamburger-menu > i")).click();
    }

    public void selectgridSelectPrime() {
        driver.get(url);
        driver.findElement(By.cssSelector("#nav-hamburger-menu > i")).click();
        WebDriverWait wait = new WebDriverWait(driver, 1, 5000);
        driver.findElement(By.cssSelector("Body")).click();

    }

    public void Deliverto() {
        driver.get(url);
        driver.findElement(By.cssSelector(".nav-a.nav-a-2.a-popover-trigger.a-declarative")).click();
    }

    public void ClicktryPrime() {
        driver.get(url);
        driver.findElement(By.cssSelector("#nav-link-prime")).click();

    }

    public void showAlexaSkills() {
        driver.get(url);
        WebElement alexa = null;
        alexa = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        alexa.sendKeys("Alexa Skills");
        alexa.click();
    }

    public void categoryDropdown() {
        driver.get(url);
        driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).click();

    }

        public void categoryGames() {
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=mobile-apps']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Apps and Games", Keys.ENTER);

       }

        public void categoryAlexa() {
        categoryDropdown();
        WebElement alexa=null;
        alexa=driver.findElement(By.cssSelector("#searchDropdownBox"));
        alexa.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        alexa.sendKeys("Alexa", Keys.ENTER);
        }

        public void categoryAppliances() {
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=appliances']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Appliances", Keys.ENTER);
       }

        public void categoryArtCrafts() {
        categoryDropdown();
        WebElement crafts=null;
        crafts=driver.findElement(By.xpath("//option[@value='search-alias=arts-crafts']"));
        crafts.click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        crafts.sendKeys("Arts and Crafts", Keys.ENTER);
    }

        public void CD() {
        categoryDropdown();
        WebElement entertainment = null;
        entertainment = driver.findElement(By.xpath("//option[@value='search-alias=popular']"));
        entertainment.click();
        entertainment = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        entertainment.sendKeys("CDs & Vinyl", Keys.ENTER);
    }


        public void amazonFresh(){
        categoryDropdown();
        WebElement amazonfresh=null;
        amazonfresh=driver.findElement(By.cssSelector("#searchDropdownBox"));
        amazonfresh.click();
        amazonfresh= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        amazonfresh.sendKeys("Amazon fresh", Keys.ENTER);
    }

        public void Books(){
            categoryDropdown();
            driver.findElement(By.xpath("//option[@value='search-alias=stripbooks']")).click();
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
        }

        public void AutomotiveParts(){
            categoryDropdown();
            driver.findElement(By.xpath("//option[@value='search-alias=automotive']")).click();
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Automotive parts", Keys.ENTER);
        }

        public void categorieBaby(){
            categoryDropdown();
            driver.findElement(By.xpath("//option[@value='search-alias=baby-products']")).click();
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Baby", Keys.ENTER);
        }

        public void ArtsAutomotive(){
            categoryDropdown();
            driver.findElement(By.xpath("//option[@value='search-alias=automotive']")).click();
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Automotive parts", Keys.ENTER);
        }

        public void BeautyPersonal(){
            categoryDropdown();
            driver.findElement(By.xpath("//option[@value='search-alias=beauty']")).click();
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Beauty & Personal Care", Keys.ENTER);
        }

        public void BabyFashion(){
            categoryDropdown();
            WebElement fashion=null;
            fashion=driver.findElement(By.xpath("//option[@value='search-alias=fashion-baby']"));
            fashion.click();
            fashion=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
            fashion.sendKeys("Baby fashion", Keys.ENTER);
        }

        public void fineart(){
            categoryDropdown();
            WebElement art=null;
            art=driver.findElement(By.xpath("//option[@value='search-alias=collectibles']"));
            art.click();
            art=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
            art.sendKeys("Collectibles", Keys.ENTER);
        }

        public void Computers() {
            categoryDropdown();
            driver.findElement(By.xpath("//option[@value='search-alias=computers']")).click();
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Computers", Keys.ENTER);
       }

        public void DigitalMusic(){
          categoryDropdown();
          driver.findElement(By.xpath("//option[@value='search-alias=digital-music']")).click();
          driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Digital music", Keys.ENTER);
      }
        public void Garden(){
          categoryDropdown();
          driver.findElement(By.xpath("//option[@value='search-alias=lawngarden']")).click();
          driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Garden & Outdoor", Keys.ENTER);
      }
        public void Electronics(){
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=electronics']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Electronics", Keys.ENTER);
      }

        public void GiftCard(){
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=gift-cards']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Gift cards", Keys.ENTER);
      }
        public void Credit(){
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=financial']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Credit and Payment Cards", Keys.ENTER);
      }

        public void Courses(){
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=courses']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Courses", Keys.ENTER);
      }
        public void Grocery(){
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=grocery']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Grocery & Gourmet Food", Keys.ENTER);
       }

       public void Health(){
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=hpc']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Health, Household & Baby Care", Keys.ENTER);
       }

       public void Kindle(){
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=digital-text']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Kindle Store", Keys.ENTER);
      }

       public void Movies(){
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=movies-tv']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Movies & TV", Keys.ENTER);
      }

        public void ClothingShoes(){
        categoryDropdown();
        driver.findElement(By.xpath("//option[@value='search-alias=fashion']")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Clothing, Shoes & Jewelry", Keys.ENTER);
      }

        public void WarehouseDeals(){
         categoryDropdown();
         driver.findElement(By.xpath("//option[@value='search-alias=warehouse-deals']")).click();
         driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Warehouse deals", Keys.ENTER);
      }

         public void itemsofWomen(){
         categoryDropdown();
         driver.findElement(By.cssSelector("#searchDropdownBox")).click();
         driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Womens", Keys.ENTER);
      }

          public void itemsofGirls(){
          categoryDropdown();
          driver.findElement(By.xpath("//option[@value='search-alias=fashion-girls']")).click();
          driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Girls", Keys.ENTER);
      }

         public void itemsofMen(){
         categoryDropdown();
         driver.findElement(By.xpath("//option[@value='search-alias=fashion-mens']")).click();
         driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Men", Keys.ENTER);
      }

        public void itemsofBoys(){
        categoryDropdown();
        driver.findElement(By.cssSelector("#searchDropdownBox")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Boys", Keys.ENTER);
      }

}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork {
    String  path = "/Users/levonyanlilit/Downloads/chromedriver";
    WebDriver driver;

    @BeforeMethod
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
    }

    @Test
    public  void verifyPricingPageTitle(){
        System.out.println();
        driver.get("https://picsart.com");
        //Click on item
        WebElement pricingItem = driver.findElement(By.cssSelector("[data-test='headerNavigation-navigationListItem-Pricing']"));
        pricingItem.click();
        //Get title text
        WebElement pageTitle = driver.findElement(By.cssSelector("h1.gold-pricing-title"));
        System.out.println(pageTitle.getText().equals("Try PicsArt Gold Free for 7-Days"));

    }

    @AfterMethod
    public void killDriver(){
        driver.close();
        driver.quit();
    }
}

import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    String  path = "/Users/levonyanlilit/Downloads/chromedriver";
    WebDriver driver;
    private static final int DELAY = 10;

    @BeforeMethod
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
        //I add this because can not get the elemt till the pop up is not full loaded
        driver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
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

    @Test
    public  void verifyLoginFunctionality() throws InterruptedException {
        System.out.println();
        driver.get("https://picsart.com");
        WebElement loginButton = driver.findElement(By.cssSelector("[data-test='headerAuth-signInBtn pa-uiLib-headerAuth-authBtn']"));
        if(driver.findElement(By.cssSelector("[class*='home-title']")).getText().equals("Create Amazing Photo & Video Edits With Online Design Tools"));
        {
            loginButton.click();

            WebElement loginPopUpTitle = driver.findElement(By.cssSelector("[class*='pa-uiLib-authentication-formTitle']"));
            if(loginPopUpTitle.getText().equals("Log In to Continue")) {
                WebElement usernameField = driver.findElement(By.cssSelector("input[name='username']"));
                usernameField.sendKeys("lewonyan3");
                WebElement passwordField = driver.findElement(By.cssSelector("input[name='password']"));
                passwordField.sendKeys("koko1997");
                WebElement popUpMainButton = driver.findElement(By.cssSelector("button.pa-uiLib-authentication-btn"));
                popUpMainButton.click();
            }
        }

        try {
            WebElement userAvatar = driver.findElement(By.cssSelector("div.pa-uiLib-headerProfileInfo-avatarBlock"));
            System.out.println("true");
        }
        catch (NoSuchElementException e)
        {
            e.getMessage();
            System.out.println("false");
        }


    }

    @AfterMethod
    public void killDriver(){
        driver.close();
        driver.quit();
    }
}

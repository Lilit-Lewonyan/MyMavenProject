import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class {
    String  path = "/Users/levonyanlilit/Downloads/chromedriver";
    WebDriver driver;
    private static final int DELAY = 20;
    @BeforeMethod
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
    }

    @Test
    public void verifyTest(){
        driver.get("https://picsartstage2.com/create");
        driver.manage().addCookie(new Cookie("we_experiment_create_page_variant","1"));
        driver.navigate().refresh();
        List<WebElement> creatProject = driver.findElements(By.cssSelector("[data-test='template-item']"));
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));"
                + "return true;";
        ((JavascriptExecutor)driver).executeScript(scrollElementIntoMiddle,creatProject.get(0));

    }

    @AfterMethod
    public void killDriver(){
        driver.close();
        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class Class {
    String  path = "/Users/levonyanlilit/Downloads/chromedriver";
    WebDriver driver;
    @BeforeMethod
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
    }

    @Test
    public void verifyTest(){
        driver.get("https://picsartstage2.com/create");
        driver.manage().addCookie(new Cookie("we_experiment_create_page_variant","0"));
        driver.navigate().refresh();
        WebElement creatProject = driver.findElement(By.cssSelector(""));

    }

    @AfterMethod
    public void killDriver(){
        driver.close();
        driver.quit();
    }
}

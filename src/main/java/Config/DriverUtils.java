package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {
    public static WebDriver driver;
    public static String path = "/Users/levonyanlilit/Downloads/chromedriver";
    private static final int DELAY = 20;

    public static void intitDriver(){
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(DELAY, TimeUnit.SECONDS);
    }

    public static void killDriver(){
        driver.close();
        driver.quit();

    }
}

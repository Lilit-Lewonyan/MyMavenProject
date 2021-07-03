package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
    public static WebDriver driver;
    public static String path;

    public void intitDriver(){
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
    }

    public void killDriver(){
        driver.close();
        driver.quit();

    }
}

package Config;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;
import java.util.function.Predicate;

public class WaitHelper {
    private WebDriverWait driverWait;
    public WaitHelper(){
        driverWait = new WebDriverWait(DriverUtils.driver,20);
    }
    public  static WaitHelper getWait(){
        return new WaitHelper();
    }

    public void elementToBeClickable(WebElement element){
        driverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void elementToBeVisible(WebElement element){
        driverWait.until(ExpectedConditions.invisibilityOf(element));
    }

    public  void waitPageToBeLoaded(){
        Predicate<WebDriver> pageLoaded = new Predicate<WebDriver>() {
            @Override
            public boolean test(WebDriver webDriver) {
                return ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete");
            }
        };
        driverWait.until((Function)pageLoaded);
    }
}

package Config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
}

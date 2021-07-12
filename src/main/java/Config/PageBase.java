package Config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
    static Actions actions = new Actions(DriverUtils.driver);
    public PageBase(){
        PageFactory.initElements(DriverUtils.driver,this);
    }

    public abstract void openPage();

    protected void click(WebElement element){
        WaitHelper.getWait().elementToBeClickable(element);
        element.click();
    }

    protected  void  refreshPage(){
        DriverUtils.driver.navigate().refresh();
    }

    protected void scrollAndClick(WebElement element){
        actions.moveToElement(element);
        WaitHelper.getWait().elementToBeClickable(element);
        element.click();
    }

    protected void doubleClick(WebElement element){
        WaitHelper.getWait().elementToBeClickable(element);
        actions.doubleClick(element);
    }

    protected abstract boolean isLoadedPage();
}

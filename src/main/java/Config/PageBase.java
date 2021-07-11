package Config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
    private String path;
    PageBase(String path){
        this.path = path;
    }

    public PageBase(){
        PageFactory.initElements(DriverUtils.driver,this);
    }

    public abstract void openPage();

    protected void click(WebElement element){
        WaitHelper.getWait().elementToBeClickable(element);
        element.click();
    }
}

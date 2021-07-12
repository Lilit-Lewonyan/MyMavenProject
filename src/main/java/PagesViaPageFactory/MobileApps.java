package PagesViaPageFactory;

import Config.Configuration;
import Config.DriverUtils;
import Config.PageBase;
import Config.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileApps  extends PageBase {
    @FindBy(css = "[data-test='primary-title']")
    WebElement  primaryTitle;

    @FindBy(css = "head, title")
    WebElement pageTitle;

    @Override
    public void openPage() {
        DriverUtils.driver.get(Configuration.ENVIRMENT+"/apps");
    }

    @Override
    protected boolean isLoadedPage() {
        WaitHelper.getWait().waitPageToBeLoaded();
        return pageTitle.isDisplayed() ;
    }
}

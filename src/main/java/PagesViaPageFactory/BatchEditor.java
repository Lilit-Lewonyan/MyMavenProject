package PagesViaPageFactory;

import Config.Configuration;
import Config.DriverUtils;
import Config.PageBase;
import Config.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BatchEditor extends PageBase {
    @FindBy(css = "[class*='uploadIcon']")
    WebElement uploadIcon;

    @FindBy(css="[class*='uploaderWrapper']")
    WebElement uploadSection;

    @FindBy(css = "[data-test='upscale-button']")
    WebElement upscaleButton;

    @FindBy(css="[data-test='editbackgrounid-button']")
    WebElement editBackgrounidButton;

    @FindBy(css = "head, title")
    WebElement pageTitle;

    @Override
    public void openPage() {
        DriverUtils.driver.get(Configuration.ENVIRMENT+"/create/batch");
    }

    @Override
    protected boolean isLoadedPage() {
        WaitHelper.getWait().waitPageToBeLoaded();
        return pageTitle.isDisplayed() ;
    }


}

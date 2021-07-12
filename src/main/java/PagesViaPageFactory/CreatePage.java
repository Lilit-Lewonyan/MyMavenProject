package PagesViaPageFactory;

import Config.Configuration;
import Config.DriverUtils;
import Config.PageBase;
import Config.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CreatePage extends PageBase {

    @FindBy(css="[class*= 'createButton']")
    private WebElement newProjectButton;

    @FindAll({@FindBy(css="[class*= 'createButton']")})
    private List<WebElement> elements;

    @FindBy(css = "head, title")
    WebElement pageTitle;



    public void openPage(){
        DriverUtils.driver.get(Configuration.ENVIRMENT+"/create");
    }

    @Override
    protected boolean isLoadedPage() {
        WaitHelper.getWait().waitPageToBeLoaded();
        return pageTitle.isDisplayed() ;
    }

    public void clickNewProjectButton(){
        newProjectButton.click();
    }

}

package PageObjects;

import Config.Configuration;
import Config.DriverUtils;
import Config.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class CreatePage extends PageBase {

    @FindBy(css="[class*= 'createButton']")
    private WebElement newProjectButton;

    @FindAll({@FindBy(css="[class*= 'createButton']")})
    private List<WebElement> elements;



    public void openPage(){
        DriverUtils.driver.get(Configuration.ENVIRMENT+"/create");
    }

    public void clickNewProjectButton(){
        newProjectButton.click();
    }

}

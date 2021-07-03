import Config.Configuration;
import Config.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CreatePage extends DriverUtils {

    private WebElement newProjectButton = driver.findElement(By.cssSelector("[class*= 'createButton']"));
    public void clickNewProjectButton(){
        newProjectButton.click();
    }
    public void openPage(){
        driver.get(Configuration.ENVIRMENT+"/create");
    }
}

import Config.Configuration;
import Config.DriverUtils;
import PageObjects.CreatePage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateTest {
    @BeforeMethod
    public void initPage(){

        DriverUtils.intitDriver();
        DriverUtils.driver.get(Configuration.ENVIRMENT);

    }

    @Test
    void test(){
        DriverUtils.driver.manage().addCookie(new Cookie("we_experiment_create_page_variant","0"));
        CreatePage createPage = new CreatePage();
        createPage.openPage();
        createPage.clickNewProjectButton();
    }

    @AfterMethod
    public void killBrowser(){
        DriverUtils.killDriver();
    }



}


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class HomeworkTests extends BaseMethods {
    @Test
    public void testDragAndDrop() {
        driver.get("https://picsartstage2.com/create");
        List<WebElement> instaStories = driver.findElements(By.cssSelector("[data-test='instagram-square']"));
        instaStories.get(0).click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebElement stickersTab = driver.findElement(By.cssSelector("[id='stickers-category']"));
        stickersTab.click();
        WebElement stiker= driver.findElement(By.cssSelector("[id='270647809007900']"));
        stiker.click();


    }
}

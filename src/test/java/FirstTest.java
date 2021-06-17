import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FirstTest {
    String  path = "/Users/levonyanlilit/Downloads/chromedriver";
    WebDriver driver;
    @BeforeMethod
    public void initDriver(){
       System.setProperty("webdriver.chrome.driver",path);
         driver = new ChromeDriver();
    }

    @Test
    public  void myFirsttest(){
        System.out.println();
        driver.get("https://picsart.com");
       WebElement webElement = driver.findElement(By.cssSelector("[data-test='headerNavigation-navigationListItem-Create']"));
       webElement.click();
       WebElement webElement1 = driver.findElement(By.cssSelector("[class*='createDesignHeader'] [class*='bottomText']"));
        System.out.println(webElement1.getText());





    }
    @AfterMethod
    public void killDriver(){
        driver.close();
        driver.quit();
    }
//    @BeforeSuite
//    public void f1(){
//        System.out.println("BeforeSuite");
//    }
//
//    @BeforeTest
//    public void f2(){
//        System.out.println("BeforeTest");
//    }
//
//    @BeforeClass
//    public void f3(){
//        System.out.println("BeforeClass");
//    }
//
//    @BeforeMethod
//    public void f4(){
//        System.out.println("BeforeMethod");
//    }
//
//    @Test
//    public void f5(){
//        System.out.println("Test");
//    }
//
//    @AfterMethod
//    public void f6(){
//        System.out.println("AfterMethod");
//    }
//
//    @AfterClass
//    public void f7(){
//        System.out.println("AfterClass");
//    }
//
//    @AfterTest
//    public void f8(){
//        System.out.println("AfterTest");
//    }
//
//    @AfterSuite
//    public void f9(){
//        System.out.println("AfterSuite");
//    }




}

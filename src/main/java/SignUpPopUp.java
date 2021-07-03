import Config.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpPopUp extends DriverUtils {
    private WebElement username=driver.findElement(By.cssSelector("input[name='email']"));
    private WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
    private WebElement signInButton = driver.findElement(By.cssSelector("button[type='submit']"));
    private WebElement signInButtonNav = driver.findElement(By.cssSelector("[data-test='login-button']"));

    public void signIn(String username, String password){
        signInButtonNav.click();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        signInButton.click();

    }
}

package pages;

import locators.LoginLocator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    ChromeDriver driver;
    LoginLocator loginLocator = new LoginLocator();

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void clickActionToLogin() {
        clickElement(loginLocator.actionToLogin);
    }

    public void inputAllFields(String emailUsername, String password) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        setText(loginLocator.inputEmailUsername, emailUsername);
        setText(loginLocator.inputPassword, password);
    }

    public void clickLoginButton() {
        clickElement(loginLocator.buttonLogin);
    }

    public void verifyLoginAction(String status) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String currentUrl = driver.getCurrentUrl();

        if (!currentUrl.isEmpty() && verifyElementIsPresent(loginLocator.bannerLogin)) {
            Assert.assertEquals(verifyElementIsPresent(loginLocator.bannerLogin), Boolean.parseBoolean(status));
        }
    }
}
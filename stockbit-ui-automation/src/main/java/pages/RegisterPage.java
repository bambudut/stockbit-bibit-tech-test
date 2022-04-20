package pages;

import locators.RegisterLocator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegisterPage extends BasePage {

    ChromeDriver driver;
    RegisterLocator registerLocator = new RegisterLocator();

    public RegisterPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void clickActionToRegister() {
        clickElement(registerLocator.actionToRegister);
    }

    public void clickRegisterWithEmail() {
        clickElement(registerLocator.buttonRegisterEmail);
    }

    public void inputAllFields(String name, String email, String username, String password, String confirm) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        setText(registerLocator.inputFullName, name);
        setText(registerLocator.inputEmail, email);
        setText(registerLocator.inputUserName, username);
        setText(registerLocator.inputPassword, password);
        setText(registerLocator.inputConfirmed, confirm);
    }

    public void clickRegisterButton() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElement(registerLocator.buttonRegister);
    }

    public void showErrorMessages() {
        if (verifyElementIsPresent(registerLocator.errorMessages)) {
            List<WebElement> elements = findElements(registerLocator.errorMessages);
            List<String> list = new ArrayList<>();
            for (WebElement element : elements) {
                if (!list.contains(element.getText()) && !element.getText().isEmpty()) {
                    list.add(element.getText());
                }
            }
            System.out.println("Register failed with error: " + String.join(", ", list));
        } else {
            System.out.println("Register was successfully executed.");
        }
        Assert.assertTrue(verifyElementIsPresent(registerLocator.errorMessages));
    }
}
package locators;

import org.openqa.selenium.By;

public class RegisterLocator {

    public By actionToRegister = By.xpath("(//a[@class='register-lnd'])[1]");
    public By buttonRegisterEmail = By.xpath("//a[@class='loginlogin register-email']");
    public By inputFullName = By.id("input-1");
    public By inputEmail = By.id("input-2");
    public By inputUserName = By.id("input-3");
    public By inputPassword = By.id("input-4");
    public By inputConfirmed = By.id("input-5");
    public By buttonRegister = By.xpath("//input[@type='submit']");
    public By errorMessages = By.xpath("//span[@class='errormsg']");
}
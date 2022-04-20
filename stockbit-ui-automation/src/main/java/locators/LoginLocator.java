package locators;

import org.openqa.selenium.By;

public class LoginLocator {

    public By actionToLogin = By.xpath("(//a[@class='login-ldn'])[1]");
    public By inputEmailUsername = By.id("username");
    public By inputPassword = By.id("password");
    public By buttonLogin = By.id("loginbutton");
    public By bannerLogin = By.xpath("//img[@alt='sekuritas-banner']");
}
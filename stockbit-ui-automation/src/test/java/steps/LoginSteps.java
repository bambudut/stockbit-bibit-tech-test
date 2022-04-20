package steps;

import driver.InitWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(InitWebDriver.driver);

    @Given("user click CTA login")
    public void userClickCTALogin() {
        loginPage.clickActionToLogin();
    }

    @When("user input email {string} and password {string}")
    public void userInputEmailAndPassword(String email, String password) {
        loginPage.inputAllFields(email, password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user check the login status {string}")
    public void userCheckTheLoginStatus(String status) {
        loginPage.verifyLoginAction(status);
    }
}
package steps;

import driver.InitWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage(InitWebDriver.driver);

    @Given("user click CTA register")
    public void userClickCTARegister() {
        registerPage.clickActionToRegister();
    }

    @When("user choose register with email")
    public void userChooseRegisterWithEmail() {
        registerPage.clickRegisterWithEmail();
    }

    @And("user input name {string}, email {string}, username {string}, password {string} and confirm password {string}")
    public void userInputNameEmailUsernamePasswordAndConfirmPassword(String name, String email, String username, String password, String confirm) {
        registerPage.inputAllFields(name, email, username, password, confirm);
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Then("user should be seen error message")
    public void userShouldBeSeenErrorMessage() {
        registerPage.showErrorMessages();
    }
}
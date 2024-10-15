package ui.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ui.pages.LoginPage;
import ui.utils.PropertyLoader;

public class LoginPageSteps {

    private LoginPage loginPage;

    private PropertyLoader propertyLoader = new PropertyLoader("credentials.properties");
    private String validUsername = propertyLoader.getProperty("VALIDUSERNAME");
    private String validPassword = propertyLoader.getProperty("VALIDPASSWORD");
    private String invalidUsername = propertyLoader.getProperty("INVALIDUSERNAME");
    private String invalidPassword = propertyLoader.getProperty("INVALIDPASSWORD");

    public LoginPageSteps() {
        loginPage = new LoginPage();
    }

    @When("I navigate to the homepage")
    public void navigateToUrl() {
        loginPage.open();

    }

    @Then("The homepage should load")
    public void VerifyUrlLoad() {
        loginPage.verifyHomepage();
    }

    @Given("I can open the Quota Management Tool")
    public void openURL() throws InterruptedException {
        loginPage.open();
        loginPage.verifyHomepage();
    }

    @When("I enter a valid username")
    public void enterEmail() throws InterruptedException {
        if (validUsername == null) {
            throw new RuntimeException("USERNAME property is not set");
        }
        loginPage.enterUsername(validUsername);
    }

    @And("enter a valid password")
    public void enterPassword() {
        if (validPassword == null) {
            throw new RuntimeException("PASSWORD property is not set");
        }
        loginPage.enterPassword(validPassword);
    }

    @And("click on the login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I log in into my account successfully")
    public void verifyLogin() {
        loginPage.verifyLogin();
    }

    @When("enter an invalid username")
    public void enterInvalidUsername() {
        loginPage.enterInvalidUsername(invalidUsername);
    }

    @And("enter an invalid password")
    public void enterInvalidPassword() {
        loginPage.enterInvalidPassword(invalidPassword);
    }

    @And("a proper error message should be displayed")
    public void emptyFieldError() {
        loginPage.verifyEmptyErrorMessage();
    }

    @And("an error Message should appear")
    public void checkErrorMessage() {
        loginPage.checkEmptyPassErrorMessage();
    }

    @Then("the user should not be logged in")
    public void verifyFaildLogin() {
        loginPage.verifyHomepage();
    }

    @And("an error message should be displayed")
    public void verifyErrornMessage() {
        loginPage.verifyErrornMessage();
    }

    @When("the user leaves the username field empty")
    public void leaveUsenameEmpty() {
        loginPage.leaveUsenameEmpty("");
    }

    @When("the user leaves the password field empty")
    public void leavePasswordEmpty() {
        loginPage.leavePasswordEmpty("");
    }

    @Given("User is logged in")
    public void userLogsIn() throws InterruptedException {
        loginPage.open();
        if (validUsername == null) {
            throw new RuntimeException("USERNAME property is not set");
        }
        loginPage.enterUsername(validUsername);
        if (validPassword == null) {
            throw new RuntimeException("PASSWORD property is not set");
        }
        loginPage.enterPassword(validPassword);
        loginPage.clickLogin();
        loginPage.verifyLogin();

    }

}

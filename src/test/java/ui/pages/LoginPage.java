package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "signOnButton")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/h2")
    WebElement loginPage_Titel;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/p-heading")
    WebElement homePage_Titel;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div[5]/form/div[1]/p-inline-notification")
    WebElement loginErrorMessage;

    @FindBy(xpath = "//*[@id=\"username-text\"]")
    WebElement emptyFieldErrorMessage;

    final String BLUE = "\033[0;34m";
    final String RESET = "\033[0m";

    public void enterUsername(String username) {
       
        waitForVisibility(usernameField);
        usernameField.sendKeys(username);
    }

    public void leaveUsenameEmpty(String username) {
        waitForVisibility(usernameField);
        usernameField.sendKeys(username);
    }

    public void enterInvalidUsername(String invalidUsername) {
        waitForVisibility(usernameField);
        usernameField.sendKeys(invalidUsername);
    }

    public void enterPassword(String password) {
        waitForVisibility(passwordField);
        passwordField.sendKeys(password);
    }

    public void enterInvalidPassword(String invalidPassword) {
        waitForVisibility(passwordField);
        passwordField.sendKeys(invalidPassword);
    }

    public void leavePasswordEmpty(String password) {
        waitForVisibility(passwordField);
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        waitForVisibility(loginBtn);
        loginBtn.click();
    }

    public void verifyLogin() {
        String actualTitle = getLoginPagetitel();
        System.out.println(BLUE + "This is the actual Title that was found" + ":" + actualTitle + RESET);
        String expectedTitle = "Allocation Management Local Development";
        Assert.assertEquals(actualTitle, expectedTitle, "Cant verify login. Titles dont match.");

    }

    public void verifyErrornMessage() {
        waitForVisibility(loginErrorMessage);
        String actualTitle = loginErrorMessage.getText();
        String expectedErrorMessage = "We didn't recognise the username or password you entered. Please try again.";
        Assert.assertEquals(actualTitle, expectedErrorMessage, "Cant verify HomePage. Titles dont match.");

    }

    public void verifyEmptyErrorMessage() {
        waitForVisibility(emptyFieldErrorMessage);
        String actualTitle = emptyFieldErrorMessage.getText();
        String normalizedActualTitle = actualTitle.replace("\n", " ").trim();
        String expectedErrorMessage = "PPN username Please fill out this field.";
        Assert.assertEquals(normalizedActualTitle, expectedErrorMessage,
                "Can't verify failed login. Titles don't match.");
    }

    public void checkEmptyPassErrorMessage() {
        waitForVisibility(emptyFieldErrorMessage);
        String actualTitle = emptyFieldErrorMessage.getText();
        String normalizedActualTitle = actualTitle.replace("\n", " ").trim();
        String expectedErrorMessage = "PPN username";
        Assert.assertEquals(normalizedActualTitle, expectedErrorMessage,
                "Can't verify failed login. Titles don't match.");
    }

    public String getLoginPagetitel() {
        waitForVisibility(loginPage_Titel);
        return loginPage_Titel.getText();
    }

    public String getHomePagetitel() {
        return homePage_Titel.getText();
    }

    public void verifyHomepage() {
        waitForVisibility(homePage_Titel);
        String actualTitle = getHomePagetitel();
        String expectedTitle = "Welcome to Porsche Partner Network";
        System.out.println(BLUE + "This is the actual Title that was found" + ":" + actualTitle + RESET);
        Assert.assertEquals(actualTitle, expectedTitle, "Cant verify HomePage. Titles dont match.");

    }

}

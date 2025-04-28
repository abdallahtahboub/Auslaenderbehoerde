package ui.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ui.utils.DriverManager;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div[5]/form/div[3]/div/div/button")
    WebElement Human;

    public void open() {

        driver.get("https://www.whatsapp.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // waitForVisibility(Human);
        // Human.click();
    }

    public BasePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    }

    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForClickability(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForInvisibility(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public boolean isElementNotPresent(By locator) {
        try {
            driver.findElement(locator);
            return false; // Element is present
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return true; // Element is not present
        }
    }

    public static void waitForComplete(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception ignored) {
        }
    }

}

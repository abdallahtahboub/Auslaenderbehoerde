package ui.utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class DriverManager extends AbstractTestNGCucumberTests {
    private static WebDriver driver;

    private static String browser = System.getProperty("browser", "chrome");

    @BeforeClass(alwaysRun = true)
    public static WebDriver getDriver() {
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();

                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "safari":
                    SafariOptions safariOptions = new SafariOptions();

                    driver = new SafariDriver(safariOptions);
                    break;
                case "chrome":
                default:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    // chromeOptions.addArguments("--headless"); // Run in headless mode
                    // chromeOptions.addArguments("--no-first-run");
                    // chromeOptions.addArguments("--disable-search-engine-choice-screen");
                    // chromeOptions.addArguments("--no-default-browser-check");
                    // chromeOptions.addArguments("--disable-popup-blocking");
                    // chromeOptions.addArguments(
                    // "user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36
                    // (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");

                    // Add any Chrome-specific options here
                    driver = new ChromeDriver(chromeOptions);
                    break;
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    @AfterClass(alwaysRun = true)
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

package ui.runners;

import io.cucumber.testng.CucumberOptions;
import ui.utils.DriverManager;

@CucumberOptions(features = "src/test/resources/features", glue = "ui.steps", tags = "@inquiry", plugin = {
                "pretty",
                "html:target/cucumber-reports.html" },

                monochrome = true)
public class TestNGRunner extends DriverManager {
}

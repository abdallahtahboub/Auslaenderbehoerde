package ui.Hooks;

import io.cucumber.java.Before;
import ui.steps.LoginPageSteps;

public class Hooks {

    private LoginPageSteps loginSteps = new LoginPageSteps();

    @Before
    public void ensureUserIsLoggedIn() throws InterruptedException {
        loginSteps.openURL();

    }
}

package ui.steps;

import java.io.FileNotFoundException;
import java.io.IOException;
import io.cucumber.java.en.When;
import ui.pages.WhatsappPage;

public class WhatsappSteps {

    private WhatsappPage whatsappPage = new WhatsappPage();
    
    @When("I can open the website")
    public void a() throws FileNotFoundException, ClassNotFoundException, IOException {
        whatsappPage.open();
    }

    @When("I login in Whatsapp")

    public void b() throws FileNotFoundException, ClassNotFoundException, IOException {
        whatsappPage.Login();
    }

    @When("I send a message in Whatsapp")
    public void c() throws IOException, ClassNotFoundException {
        whatsappPage.sendMessage();
    }
}
package ui.steps;

import ui.pages.InguirryPage;
import io.cucumber.java.en.*;

public class InquirySteps {
    private final InguirryPage inguirryPage;

    public InquirySteps() {
        inguirryPage = new InguirryPage();
    }

    @When("I can open the website")

    public void a() {
        inguirryPage.openWebsite();
    }

    @And("choose a reason for the Inquiry")
    public void b() {
        inguirryPage.chooseReason();

    }

    @And("enter E-Mail address")
    public void c() {
        inguirryPage.enterEmail();

    }

    @And("confirm my E-Mail address")
    public void d() {
        inguirryPage.confirmEmail();

    }

    @And("click on next")
    public void e() {
        inguirryPage.clickNext();

    }

    @And("enter the file number")
    public void f() {
        inguirryPage.enterFileCode();

    }

    @And("choose my nationality")
    public void g() {
        inguirryPage.chooseNationality();

    }

    @And("enter family name")
    public void h() {
        inguirryPage.enterfamilyName();

    }

    @And("enter first name")
    public void i() {

        inguirryPage.enterfirstName();

    }

    @And("enter date of birth")
    public void j() {
        inguirryPage.enterBithday();

    }

    @And("enter mobile number")
    public void k() {
        inguirryPage.enterMobileNumber();

    }

    @And("enter message")
    public void l() {
        inguirryPage.enterMessage();
    }

    @And("click on Send")
    public void m() {

        inguirryPage.sendInfos();

    }

}

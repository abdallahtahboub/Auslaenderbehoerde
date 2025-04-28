package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InguirryPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"form_subject_\"]")
    WebElement ReasonsList;

    @FindBy(xpath = "//*[@id=\"form_subject_\"]/option[6]")
    WebElement reason_Einbürgerung_Sonstiges;

    @FindBy(xpath = "//*[@id=\"form_email\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"form_emailval\"]")
    WebElement confirmEmail;

    @FindBy(xpath = "//*[@id=\"forth_1_1\"]")
    WebElement nextBtn;

    @FindBy(xpath = "//*[@id=\"input_1_2\"]")
    WebElement fileCode;

    @FindBy(xpath = "//*[@id=\"select_1_6\"]")
    WebElement nationalityList;

    @FindBy(xpath = "//*[@id=\"select_1_6\"]/option[16]")
    WebElement nationality;

    @FindBy(xpath = "//*[@id=\"input_1_7\"]")
    WebElement familyNameTxt;

    @FindBy(xpath = "//*[@id=\"input_1_8\"]")
    WebElement firstNameTxt;

    @FindBy(xpath = "//*[@id=\"input_1_9\"]")
    WebElement Birthdate;

    @FindBy(xpath = "//*[@id=\"input_1_10\"]")
    WebElement mobileNumberTxt;

    @FindBy(xpath = "//*[@id=\"input_1_12\"]")
    WebElement messageTxt;

    @FindBy(xpath = "//*[@id=\"page_1_20\"]/div[3]/div[2]/button[2]")
    WebElement sendBtn;

    @FindBy(xpath = "//*[@id=\"submit_1\"]")
    WebElement submitBtn;

    // URL of the website  "https://www.berlin.de/einwanderung/ueber-uns/kontakt/formular.1394756.php#form_1"

    private String website = "https://www.whatsapp.com";

    private String emailAddress = "tahboub252@gmail.com";
    private String fileNumber = "95-20198/23";
    private String familyName = "Tahboub";
    private String firstName = "Abdallah";

    public String birthday = "16";
    public String birthMonth = "10";
    public String birthYear = "1994";
    public String mobileNumber = "015224598976";

    public String message = "Sehr geehrte Damen und Herren,\n" +
            "ich wende mich heute an Sie, um den aktuellen Stand meiner Einbürgerungsantrags zu erfragen. Könnten Sie mir bitte mitteilen, wie der Status meines Antrags ist?.\n"
            +
            "Mit freundlichen Grüßen\n" +
            "Abdallah Tahboub";

    public void openWebsite() {

        driver.get(website);
    }

    public void chooseReason() {
        waitForClickability(ReasonsList);
        ReasonsList.click();
        waitForClickability(reason_Einbürgerung_Sonstiges);
        reason_Einbürgerung_Sonstiges.click();
        System.out.println("reason was clicked");

    }

    public void enterEmail() {
        waitForVisibility(email);
        email.sendKeys(emailAddress);
        System.out.println("The Email was enterd.");

    }

    public void confirmEmail() {
        waitForVisibility(confirmEmail);
        confirmEmail.sendKeys(emailAddress);
        System.out.println("The Email was confirmed.");
    }

    public void clickNext() {
        waitForClickability(nextBtn);
        nextBtn.click();
    }

    public void enterFileCode() {
        waitForVisibility(fileCode);
        fileCode.sendKeys(fileNumber);
        System.out.println("File code was enterd.");
    }

    public void chooseNationality() {
        waitForClickability(nationalityList);
        nationalityList.click();
        waitForClickability(nationality);
        nationality.click();
        System.out.println("Nationality entered.");
    }

    public void enterfamilyName() {
        waitForVisibility(familyNameTxt);
        familyNameTxt.sendKeys(familyName);
        System.out.println("Family name was enterd.");
    }

    public void enterBithday() {
        waitForVisibility(Birthdate);
        Birthdate.sendKeys(birthday);
        Birthdate.sendKeys(birthMonth);
        Birthdate.sendKeys(birthYear);
        System.out.println("Birthday name was enterd.");

    }

    public void enterfirstName() {
        waitForVisibility(firstNameTxt);
        firstNameTxt.sendKeys(firstName);
        System.out.println("first name was enterd.");

    }

    public void enterMobileNumber() {
        waitForClickability(mobileNumberTxt);
        mobileNumberTxt.sendKeys(mobileNumber);
        System.out.println("mobile number was entered.");

    }

    public void enterMessage() {
        waitForVisibility(messageTxt);
        messageTxt.sendKeys(message);
        System.out.println("message was entered");

    }

    public void sendInfos() {
        waitForClickability(sendBtn);
        sendBtn.click();
        waitForClickability(submitBtn);
        submitBtn.click();
        System.out.println("Infos were sent");

    }

}

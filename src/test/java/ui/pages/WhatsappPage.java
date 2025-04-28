package ui.pages;

import org.apache.hc.client5.http.cookie.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.io.*;
import java.util.*;

public class WhatsappPage extends BasePage {

    @FindBy(xpath = "//*[starts-with(@id, 'u_0_6')]") 
    WebElement AcceptCookies; 

    @FindBy(xpath = "//*[starts-with(@id, 'u_0_n')]/div/a[1]")
    WebElement LoginButton;

    public void Login() throws FileNotFoundException, IOException, ClassNotFoundException {
        waitForClickability(AcceptCookies);
        AcceptCookies.click();
        waitForClickability(LoginButton);
        LoginButton.click();
        System.out.println("Login button was clicked");

        System.out.println("Scan the QR code manually... Waiting for 30 seconds");
        waitForComplete(30000);
        System.out.println("30 seconds passed. Proceeding with the test...");
        // Save cookies
        File cookieFile = new File("whatsapp-cookies.data");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(cookieFile));
        oos.writeObject(driver.manage().getCookies());
        oos.close();

    }


    public void sendMessage() throws IOException, ClassNotFoundException {

        // Load saved cookies
        File cookieFile = new File("whatsapp-cookies.data");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(cookieFile));
        Set<Cookie> cookies = (Set<Cookie>) ois.readObject();
        ois.close();

        for (Cookie cookie : cookies) {
            driver.manage().addCookie((org.openqa.selenium.Cookie) cookie);
        }

        driver.navigate().refresh(); // Reload with session
        waitForComplete(10000);

    }

}

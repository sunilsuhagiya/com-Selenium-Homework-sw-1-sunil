package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        // Verify the text ‘Register ’
        String expectedMessage = "Register";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Register')]"));

        // Validate actual and expected message
        Assert.assertEquals("No Register text found",expectedMessage, actualMessage);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){

        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));

        //Select gender radio button
        clickOnElement(By.id("gender-male"));
        //Send text to FirstName
        sendTextToElement(By.id("FirstName"),"Prime");
        //Send text to LastName
        sendTextToElement(By.id("LastName"),"Test");
        // Select Day Month and Year
        sendTextToElement(By.name("DateOfBirthDay"),"5");
        sendTextToElement(By.name("DateOfBirthMonth"),"5");
        sendTextToElement(By.name("DateOfBirthYear"),"1926");
        // Sending email id to Email field
        sendTextToElement(By.name("Email"),"Pt@gmail.com");
        // Sending company name to company name field
        //sendTextToElement(By.name("Company name"),"Hello");
        // Sending password for password field
        sendTextToElement(By.name("Password"),"123demo");
        // sending confirm password for confirm password field
        sendTextToElement(By.name("ConfirmPassword"),"123demo");
        // Clicking on REGISTER Button
        clickOnElement(By.id("register-button"));

        // Verify the text ‘Register ’
        String expectedMessage = "Your registration completed";
        String actualMessage = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));

        // Validate actual and expected message
        Assert.assertEquals("No Register text found",expectedMessage, actualMessage);

    }

    @After
    public void testDown(){
        closeBrowser();
    }
}

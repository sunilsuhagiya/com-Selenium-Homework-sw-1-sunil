package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }


    public String getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        clickOnElement(By.linkText("Log in"));

        // This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

       String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page",expectedMessage, actualMessage);

    }


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        clickOnElement(By.linkText("Log in"));

        sendTextToElement(By.id("Email"),"sunilkumar_p@yahoo.com");

        sendTextToElement(By.name("Password"),"demo123");

        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //clickOnElement(By.xpath("//button[contains(text(),'Log out')]"));
        //clickOnElement(By.linkText("Log out"));
    }
    @Test
    public void verifyTheErrorMessage(){
        clickOnElement(By.linkText("Log in"));

        sendTextToElement(By.id("Email"),"sunilkumar_p@yahoo.com");

        sendTextToElement(By.name("Password"),"demo123");

        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        String expectedMessage = "Login was unsuccessful.Please correct the errors and try again. No customer account found";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
    }

    @After
    public void testDown(){
        closeBrowser();
    }

}
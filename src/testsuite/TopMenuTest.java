package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on the ‘Computers’ Tab
        clickOnElement(By.linkText("Computers"));
        // Verify the text ‘Computers’
        String expectedMessage = "Computers";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));

        // Validate actual and expected message
        Assert.assertEquals("No Computer text found",expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on the ‘Electronics’ Tab
        clickOnElement(By.linkText("Electronics"));
        // Verify the text ‘Computers’
        String expectedMessage = "Electronics";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));

        // Validate actual and expected message
        Assert.assertEquals("No Electronics text found",expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
        //click on the ‘Apparel’ Tab
        clickOnElement(By.linkText("Apparel"));
        // Verify the text ‘Apparel ’
        String expectedMessage = "Apparel";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));

        // Validate actual and expected message
        Assert.assertEquals("No Apparel text found",expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        //click on the ‘Digital downloads ’ Tab
        clickOnElement(By.linkText("Digital downloads"));
        // Verify the text ‘Apparel ’
        String expectedMessage = "Digital downloads";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));

        // Validate actual and expected message
        Assert.assertEquals("No Digital downloads text found",expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the ‘Apparel’ Tab
        clickOnElement(By.linkText("Books"));
        // Verify the text ‘Apparel ’
        String expectedMessage = "Books";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));

        // Validate actual and expected message
        Assert.assertEquals("No Books text found",expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the ‘Jewelry’ Tab
        clickOnElement(By.linkText("Jewelry"));
        // Verify the text ‘Jewelry ’
        String expectedMessage = "Jewelry";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));

        // Validate actual and expected message
        Assert.assertEquals("No Jewelry text found",expectedMessage, actualMessage);
    }

    @Test
    public void  userShouldNavigateToGiftCardsPageSuccessfull(){
        //click on the ‘Gift Cards’ Tab
        clickOnElement(By.linkText("Gift Cards"));
        // Verify the text ‘Jewelry ’
        String expectedMessage = "Gift Cards";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));

        // Validate actual and expected message
        Assert.assertEquals("No Gift Cards text found",expectedMessage, actualMessage);
    }


    @After
    public void testDown(){
         closeBrowser();
    }

}

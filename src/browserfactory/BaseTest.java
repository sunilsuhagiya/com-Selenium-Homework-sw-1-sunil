package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
write the browser setup code inside the class ‘Base Test’
 */
public class BaseTest {
    public static WebDriver driver;
        // Declaring global String type variable
        String baseUrl="https://demo.nopcommerce.com/ ";

    public void openBrowser(String baseUrl){
        // Most important key and path make sure select copy path/reference click root to copy and
        // paste it for path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        // Interface / reference variable / = assignment operator /
        // WebDriver We can use all the browser for our automation framework
        driver = new ChromeDriver(); // Creating object
        // Launch the URL
        driver.get(baseUrl);
        // Maximise window
        driver.manage().window().maximize();
        // we give implicit Time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser(){
        driver.quit();

    }
}

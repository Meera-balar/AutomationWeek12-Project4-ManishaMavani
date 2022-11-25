package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    //Global variable declaration
    public static WebDriver driver;

    //Method declaration and implementation for opening browser
    public void openBrowser( String BaseUrl){
        //Setup jey-value for Chrome browser
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver(); //object creation for chrome driver class
        //get the Url by using get method
        driver.get(BaseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //implicit time given to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    //Method declaration and implementation for closing browser
    public void closeBrowser(){
        driver.quit();
    }
}

package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilites.Utility;

public class LoginTest extends Utility {
    //Url stored into baseUrl
    String baseUrl = "https://www.saucedemo.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValid(){
        //Enter valid UserName
        sendTextToElement(By.xpath("//input[@id = 'user-name']"),"standard_user");
        //Enter Valid password
        sendTextToElement(By.xpath("//input[@id = 'password']"),"secret_sauce");
        //Click on login button
        clickOnElement(By.xpath("//input[@id = 'login-button']"));
        String expectedText = "PRODUCTS";
        String actualText = getTextFromElement(By.xpath("//span[text()='Products']"));
        //Validate actual and expected message
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //Enter valid UserName
        sendTextToElement(By.xpath("//input[@id = 'user-name']"),"standard_user");
        //Enter Valid password
        sendTextToElement(By.xpath("//input[@id = 'password']"),"secret_sauce");
        //Click on login button
        clickOnElement(By.xpath("//input[@id = 'login-button']"));
        //This is from requirement
        int expectedProducts = 6;
        //get the size to find number of products on webpage
        int actualProducts = sizeOfElement(By.xpath("//div[@class = 'inventory_item']"));
        //Validate actual and expected message
        Assert.assertEquals(expectedProducts,actualProducts);
    }
    @After
    public void tearDown(){
        //This method close the web browser
        closeBrowser();
    }
}


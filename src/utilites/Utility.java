package utilites;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    //Method declaration for clicking on element
    public void clickOnElement(By by){
        //Find element and click on element
        driver.findElement(by).click();
    }

    //Method declaration for send data into field
    public void sendTextToElement(By by, String text){
        //Find element and enter data into element
        driver.findElement(by).sendKeys(text);
    }
    //Method declaration for get text
    public String getTextFromElement(By by){
        //Find element and get text from field
        return driver.findElement(by).getText();
    }
    //method declaration to count number of element present on webpage
    public int sizeOfElement(By by){
        return driver.findElements(by).size();
    }
}

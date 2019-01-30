package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by balajakka on 27/01/2019.
 */
public class FacebookLoginPage2 {

    WebElement emailInput;
    WebElement pwdInput;
    WebElement firstNameInput;
    WebElement surnameInput;
    WebElement loginButton;

    public FacebookLoginPage2(WebDriver driver){
        emailInput = driver.findElement(By.id("email"));
        pwdInput = driver.findElement(By.id("pass"));
        firstNameInput = driver.findElement(By.id("u_0_j"));
        surnameInput = driver.findElement(By.id("u_0_l"));
        loginButton = driver.findElement(By.id("loginbutton"));

    }

    public void accessFacebookLoginPage(WebDriver driver){
        driver.get("https://www.facebook.com/");
    }

    public void enterEmailId(WebDriver driver, String emailId){
        emailInput.sendKeys(emailId);
    }

    public void assertFacebookLoginPage(WebDriver driver){
        Assert.assertEquals(true,driver.getTitle().contains("Facebook"));
    }

}

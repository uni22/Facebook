package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by balajakka on 25/01/2019.
 */
public class FacebookLoginPage {

    @FindBy(id = "email")
    static WebElement emailInput;

    @FindBy(id = "pass")
    static WebElement pwdInput;

    @FindBy(id = "u_0_j")
    static WebElement firstNameInput;

    @FindBy(id = "u_0_l")
    static WebElement surnameInput;

    @FindBy(id= "loginbutton")
    static WebElement loginButton;


    public static void assertEmailInputDisplayed(){
        Assert.assertEquals(true,emailInput.isDisplayed());
    }


    public static void enterEmailInput(String emailId){
        emailInput.sendKeys(emailId);
    }



}

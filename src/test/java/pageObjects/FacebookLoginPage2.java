package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class FacebookLoginPage2 {


    public static WebElement emailInput;
    WebElement pwdInput;
    public static WebElement firstNameInput;
    WebElement surnameInput;
    WebElement loginButton;
    WebElement forgottonPasswordLink;
    public WebElement dayDropdown;
    WebElement yearDropdown;
    WebElement monthDropdown;
    WebElement radio1;

    public FacebookLoginPage2(WebDriver driver){
        emailInput = driver.findElement(By.id("email"));
//        emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        // pwdInput = driver.findElement(By.id("pass"));
        pwdInput = driver.findElement(By.xpath("//input[@type='password'and@name='pass']"));
        firstNameInput = driver.findElement(By.id("u_0_j"));
        surnameInput = driver.findElement(By.id("u_0_l"));
        loginButton = driver.findElement(By.id("loginbutton"));
        //a[contains(text(),'Forgotten account?')]
        forgottonPasswordLink = driver.findElement(By.xpath("//a[contains(text(), 'Forgotten account?') ]"));
        dayDropdown= driver.findElement(By.id("day"));
        monthDropdown = driver.findElement((By.xpath("//select[@name='birthday_month']")));
        yearDropdown = driver.findElement((By.xpath("//select[@name='birthday_year']")));
        radio1= driver.findElement(By.xpath("//input[@type='radio' and @value ='1']"));
    }


    public void accessFacebookLoginPage(WebDriver driver){

        driver.get("https://www.facebook.com/");
    }

    public void enterEmailId(WebDriver driver, String emailId){
        emailInput.sendKeys(emailId);
    }
    // public void forgottonPassword(WebDriver driver, String )

    public void assertFacebookLoginPage(WebDriver driver){
        Assert.assertEquals(true,driver.getTitle().contains("Facebook"));
    }
    public void fwdpasdlLink() {
        forgottonPasswordLink.click();
    }
    public void selectDayFromDropdown() throws InterruptedException {
        Select daySelect = new Select(dayDropdown);
        // daySelect.selectByValue(dayString);

        daySelect.selectByIndex(8);
        // dayDropdown.isSelected();
        dayDropdown.isDisplayed();
        Thread.sleep(2000);
    }
    public void selectMonthDropdown () {
        Select monthSelect = new Select((monthDropdown));
        monthSelect.selectByVisibleText("May");

    }
    public void selectYearDropdown() {
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByValue("2018");


    }
    public void selectRadioButton(){
        // Select radioselect = new Select(radio1);
        // radioselect.
    }
    public static void myActions(WebDriver driver){

        Actions actions = new Actions(driver);
        Action builder = actions
                .moveToElement(firstNameInput)
                .click()
                .sendKeys("BALA")
                .sendKeys(Keys.TAB)
                .sendKeys("JAKKA")
                .sendKeys(Keys.TAB)
                .sendKeys("07710234714")
                .build();
        builder.perform();

    }
}

package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FacebookLoginPage;
import pageObjects.FacebookLoginPage2;
import utility.CapScreenSht;
import utility.ConfigFileReader;

import java.util.ArrayList;

import static stepDefinitions.Hooks.cfr;
import static stepDefinitions.Hooks.myDriver;
public class FacebookPageStepDef {

    FacebookLoginPage2 flp;
   // ConfigFileReader cfr;
    CapScreenSht scr= new CapScreenSht();


    @Given("^I am Facebook chrome user$")
    public void step1() {
        System.out.println("I am in given");
    }

    @When("^I access facebook url$")
    public void step2() {

        accessFacebook();
//        PageFactory.initElements(myDriver, FacebookLoginPage.class);
        flp = new FacebookLoginPage2(myDriver);
    }

    @Then("^I see facebook login page$")
    public void step3() throws InterruptedException {
         flp = new FacebookLoginPage2(myDriver);
        flp.assertFacebookLoginPage(myDriver);
        flp.enterEmailId(myDriver,"bala.jakka@icloud.com");
        flp.selectDayFromDropdown();
        flp.dayDropdown.isSelected();
        flp.selectMonthDropdown();
        flp.selectYearDropdown();
        flp.selectRadioButton();

//       FacebookLoginPage.assertEmailInputDisplayed();
//       FacebookLoginPage.enterEmailInput("bala.jakka@icloud.com");
       scr.capScrSht(myDriver,"fbloginpage");



    }
    @Then("^I click on the forgotenpassword$")
    public void i_click_on_the_forgotenpassword() {
        System.out.println(" i am in forgot password");
        flp.fwdpasdlLink();
    }
    @And("^I go back to homepage$")
        public void laststep() {
            System.out.println("i am in homepage again");
            // myDriver.navigate().back();
    }



    public void accessFacebook(){
//        myDriver.get("https://www.facebook.com/");
        myDriver.get(cfr.getApplicationUrl());


    }



}

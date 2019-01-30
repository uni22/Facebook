package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.FacebookLoginPage2;
import utility.ConfigFileReader;

import static stepDefinitions.Hooks.cfr;
import static stepDefinitions.Hooks.myDriver;

/**
 * Created by balajakka on 24/01/2019.
 */
public class FacebookPageStepDef {

    FacebookLoginPage2 flp;
//    ConfigFileReader cfr;


    @Given("^I am chrome user$")
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
    public void step3() {
        flp.assertFacebookLoginPage(myDriver);
        flp.enterEmailId(myDriver,"bala.jakka@icloud.com");
//        FacebookLoginPage.assertEmailInputDisplayed();
//        FacebookLoginPage.enterEmailInput("bala.jakka@icloud.com");

    }

    public void accessFacebook(){
//        myDriver.get("https://www.facebook.com/");
        myDriver.get(cfr.getApplicationUrl());
//        "https://www.facebook.com/"

    }
}

package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.CapScreenSht;

import java.util.ArrayList;

import static stepDefinitions.Hooks.myDriver;

public class SantanderStepDef {
    CapScreenSht scr1= new CapScreenSht();
     ArrayList<String> tabs2;
    @Given("^I am Santander chrome user$")
    public void step4() {
        System.out.println("I am in given");
    }
    Wait wait = new WebDriverWait(myDriver,10);
    WebElement  aboutOnLineBankingLink;

    @When("^I access santander$")
    public void i_access_santander() {
        myDriver.get("https://retail.santander.co.uk/LOGSUK_NS_ENS/BtoChannelDriver.ssobto?dse_operationName=LOGON&dse_processorState=initial&redirect=S");

        if(myDriver.findElement(By.xpath("//div[@id ='splash-97123-body']")).isDisplayed()){
            myDriver.findElement(By.xpath("//div[@title='Close']")).click();
        }
        aboutOnLineBankingLink =(WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='About Online Banking']")));
        myDriver.findElement(By.xpath("//a[text()='About Online Banking']")).click();

        tabs2 = new ArrayList<String>(myDriver.getWindowHandles());

        myDriver.switchTo().window(tabs2.get(0));

        myDriver.switchTo().window(tabs2.get(1));

        myDriver.switchTo().window(tabs2.get(0));

        myDriver.findElement(By.xpath("//a[text()='Contact us']")).click();

        tabs2.add(myDriver.getWindowHandle());

        myDriver.switchTo().window(tabs2.get(2));

        for(String h: tabs2){
            myDriver.switchTo().window(h);
        }
    }

    @Then("^I see Multiple windows$")
    public void i_see_Multiple_windows() {
        scr1.capScrSht(myDriver,"");
    }
}

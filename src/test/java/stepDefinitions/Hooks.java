package stepDefinitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.ConfigFileReader;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver myDriver;
    public static ConfigFileReader cfr = new ConfigFileReader();

    @Before
    public void beforeTest(){
//        System.setProperty("webdriver.chrome.driver", "D:\\Data\\Facebook\\src\\test\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",cfr.getDriverPath());
        myDriver = new ChromeDriver();
        myDriver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);


    }

    @After
    public void afterTest(){
//        myDriver.quit();

    }
}

package stepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="./src/test/Features",
        glue={"stepDefinitions"},
        format = {"pretty", "html:target/destination" +
                ""}
        // mvn test -Dcucumber.options=”–plugin junit:target/cucumber-reports/report.xml”.
)
public class TestRunner {
}

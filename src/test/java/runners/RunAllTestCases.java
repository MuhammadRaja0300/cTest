package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = {"stepDefinitions"},
        //tags= "@regression" ,

        plugin = {"pretty", "json:target/cucumber.json", "html:target/CucumberTestReport.html"}


)
public class RunAllTestCases {


}

package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/*.feature", glue = {"src/test/java/stepDefinitions"},
        //tags= "@regression" ,c

        plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"}


)
public class RunAllTestCases {


}

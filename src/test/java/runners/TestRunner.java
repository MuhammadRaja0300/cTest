package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags= "@regression" ,
        publish = true,
        plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"}


)
public class TestRunner {


}

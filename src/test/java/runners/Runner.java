package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/eminebatar/IdeaProjects/KaolaPlace01/src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false
)
public class Runner {
}
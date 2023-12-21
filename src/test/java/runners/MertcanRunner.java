package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\mertc\\IdeaProjects\\team03_cucumberProject\\src\\test\\resources\\features",
        glue = "stepdefinitions",
        dryRun = false,
        tags = "@US_20"
)
public class MertcanRunner {



}

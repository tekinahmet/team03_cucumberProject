package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUpScenarios(){
//        System.out.println("Before Hooks");
    }
    @After
    public void afterTearDown(Scenario scenario){
//        System.out.println("After Hooks");
//        if a test scenario fails, then capture the screenshot, and attach it to the html report
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","failed_screenshot");
            Driver.closeDriver();
        }
    }

    //    we can use conditional hooks using cucumber tags
    @After("@US_07 or @US_17")
    public void afterAllTearDown(){
        System.out.println("This runs only after @regression");
    }
}
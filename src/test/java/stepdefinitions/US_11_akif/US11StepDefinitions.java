package stepdefinitions.US_11_akif;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.akif.US11Locators;
import utilities.*;

public class US11StepDefinitions {

    US11Locators us11Locators = new US11Locators();

    @When("click on login button at the top right")
    public void click_on_login_button_at_the_top_right() {
        JSUtils.JSclickWithTimeout(us11Locators.loginButton);
    }
    @Then("verify that login page opened")
    public void verify_that_login_page_opened() {
        Assert.assertTrue(us11Locators.loginIcon.isDisplayed());
    }
    @Then("Enter vice dean credentials {string} and {string}")
    public void enter_vice_dean_credentials_and(String username, String password) {
        us11Locators.userName.sendKeys(username);
        us11Locators.password.sendKeys(password);
    }
    @Then("Click on the login button below the password field")
    public void click_on_the_login_button_below_the_password_field() {
        JSUtils.JSclickWithTimeout(us11Locators.loginClick);
        WaitUtils.waitFor(1);
    }

    @Then("Click on the Lesson Program tab")
    public void click_on_the_lesson_program_tab() {
        JSUtils.JSclickWithTimeout(us11Locators.lessonProgramTab);
        WaitUtils.waitFor(1);


    }
    @Then("Verify that lesson, day, start time and stop time information displayed on the page")
    public void verify_that_lesson_day_start_time_and_stop_time_information_displayed_on_the_page() {
        JSUtils.JSscrollIntoView(us11Locators.lessonInfo);
        WaitUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(us11Locators.lessonInfo);
        BrowserUtils.verifyElementDisplayed(us11Locators.dayInfo);
        BrowserUtils.verifyElementDisplayed(us11Locators.startTimeInfo);
        BrowserUtils.verifyElementDisplayed(us11Locators.stopTime);


    }


}

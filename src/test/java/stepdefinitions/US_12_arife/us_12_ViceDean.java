package stepdefinitions.US_12_arife;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.arife.US_02;
import pages.arife.US_12;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

public class us_12_ViceDean {

    US_12 viceDeanManagementPage = new US_12();

    US_02 logOut = new US_02();

    // TC_01
    @Given("go to homepage {string}")
    public void go_to_homepageTC1(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("managementOnSchools"));

    }
    @When("click login button")
    public void click_login_buttonTC1() {

        viceDeanManagementPage.loginOnHomePage.click();

    }
    @When("enter username {string}")
    public void enter_usernameTC1(String string) {

        viceDeanManagementPage.userName.sendKeys(ConfigReader.getProperty("ViseDeanName"));
    }
    @When("enter password {string}")
    public void enter_passwordTC1(String string) {

        viceDeanManagementPage.password.sendKeys(ConfigReader.getProperty("ViseDeanPassword"));
    }
    @When("click login")
    public void click_loginTC1() {

        viceDeanManagementPage.loginButton.click();

    }
    @When("Click on the menu")
    public void click_on_the_menu() {

        viceDeanManagementPage.ViceDeanMenu.click();
    }

    @When("Navigate lesson managment")
    public void navigate_lesson_managment() {

        viceDeanManagementPage.LessonManagement.click();
    }
    @When("Select a Lesson from Lesson Program Assignment List")
    public void select_a_lesson_from_lesson_program_assignment_list() {

        viceDeanManagementPage.LessonProgram.click();

        viceDeanManagementPage.ChooseALesson.click();

    }
    @When("choose a teacher from the list")
    public void choose_a_teacher_from_the_list() {

        JSUtils.JSclickWithTimeout(viceDeanManagementPage.SelectTeacher);

        JSUtils.JSgetValueBy(viceDeanManagementPage.SelectTeacher,"John Doe");

    }
    @When("Click on submit button")
    public void click_on_submit_button() {

        JSUtils.JSclickWithTimeout(viceDeanManagementPage.submitButton);

        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that {string} is shown on popup")
    public void verify_that_is_shown_on_popup(String string) {


        Assert.assertTrue(viceDeanManagementPage.LessonAddedTeacher.isDisplayed());

    }
    @Then("logout")
    public void logoutTC1() {

        logOut.MenuLogout.click();

        logOut.Logout.click();

        logOut.LogoutYesButton.click();

    }


    // TC_02




    @Given("go to homepage {string}")
    public void go_to_homepage(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("managementOnSchools"));
    }
    @When("click login button")
    public void click_login_button() {

        viceDeanManagementPage.loginOnHomePage.click();


    }
    @When("enter username {string}")
    public void enter_username(String string) {

        viceDeanManagementPage.userName.sendKeys(ConfigReader.getProperty("ViseDeanName"));
    }
    @When("enter password {string}")
    public void enter_password(String string) {

        viceDeanManagementPage.password.sendKeys(ConfigReader.getProperty("ViseDeanPassword"));
    }

    @When("click login")
    public void click_login() {

        viceDeanManagementPage.loginButton.click();
    }
    @Given("the user is on the Lesson Program List")
    public void the_user_is_on_the_lesson_management_page() {

        viceDeanManagementPage.ViceDeanMenu.click();

        viceDeanManagementPage.LessonManagement.click();

        viceDeanManagementPage.LessonProgram.click();

    }

    @When("select a lesson")
    public void select_a_lesson() {

        viceDeanManagementPage.LessonWithSameHour.click();


    }
    @When("select another lesson with the same hour and day")
    public void select_another_lesson_with_the_same_hour_and_day() {

        viceDeanManagementPage.LessonWithSameHour2.click();

    }
    @When("choose the a teacher from the list")
    public void choose_the_a_teacher_from_the_list() {

        JSUtils.JSclickWithTimeout(viceDeanManagementPage.SelectTeacher);

        JSUtils.JSgetValueBy(viceDeanManagementPage.SelectTeacher,"Cindie Wolff");

    }
    @When("clicks the submit button")
    public void clicks_the_submit_button() {

        viceDeanManagementPage.submitButton.click();

    }
    @Then("the message {string} should be displayed")
    public void the_message_should_be_displayed(String string) {


        Assert.assertTrue(viceDeanManagementPage.lessonCanNotAssigned.isDisplayed());


    }
    @Then("logout")
    public void logout() {


        logOut.MenuLogout.click();

        logOut.Logout.click();

        logOut.LogoutYesButton.click();


    }







}

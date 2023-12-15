package stepdefinitions.US_17_ahmet;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.Select;
import pages.ahmet.US_17_Teacher_Management_Page;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US_17_Teacher_Management {
    US_17_Teacher_Management_Page us_17_teacher_management_page = new US_17_Teacher_Management_Page();

    //background
    @Given("navigate to homepage {string}")
    public void navigate_to_homepage(String string) {
        Driver.getDriver().get(string);
    }
    @When("click on login button")
    public void click_on_login_button() {
        us_17_teacher_management_page.loginButton.click();
    }
    @When("enter user name {string}")
    public void enter_user_name(String string) {
        us_17_teacher_management_page.username.sendKeys(string);
    }
    @When("enter Password {string}")
    public void enter_password(String string) {
        us_17_teacher_management_page.password.sendKeys(string);
    }
    @When("click on login")
    public void click_on_login() {
        us_17_teacher_management_page.login.click();
    }

    //tc_01
    @Then("verify User signed in")
    public void verify_user_signed_in() {
        us_17_teacher_management_page.verifyUsername.isDisplayed();
    }
    @When("User logged out")
    public void user_logged_out() {
        us_17_teacher_management_page.menu.click();
        us_17_teacher_management_page.logout.click();
        us_17_teacher_management_page.confirmLogout.click();
    }

    //tc_02
    @When("click on Choose Lesson option")
    public void click_on_choose_lesson_option() {
        us_17_teacher_management_page.chooseStudent.click();
    }
    @When("select {string} assigned to user")
    public void select_assigned_to_user(String string) {
        Select select = new Select(us_17_teacher_management_page.chooseLesson);
        select.selectByVisibleText(string);
    }
    @When("click on Choose Student option")
    public void click_on_choose_student_option() {
        us_17_teacher_management_page.chooseStudent.click();
    }
    @When("select a {string}")
    public void select_a(String string) {
        Select select = new Select(us_17_teacher_management_page.chooseStudent);
        select.selectByVisibleText(string);
    }
    @When("click on Choose Education Term option")
    public void click_on_choose_education_term_option() {
        us_17_teacher_management_page.educationTerm.click();
    }
    @When("select an education semester")
    public void select_an_education_semester() {
        Select select = new Select(us_17_teacher_management_page.educationTerm);
        select.selectByValue("20");
    }
}

package stepdefinitions.US_17_ahmet;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

    //TC_03
    @When("enter {string}")
    public void enter(String string) {
        us_17_teacher_management_page.absentee.sendKeys(string);
    }

    @When("enter Midterm Exam {string}")
    public void enter_midterm_exam(String string) {
        us_17_teacher_management_page.midtermExam.sendKeys(string);
    }

    @When("enter Final Exam {string}")
    public void enter_final_exam(String string) {
        us_17_teacher_management_page.finalExam.sendKeys(string);
    }

    @When("enter Info Note About The Student {string}")
    public void enter_info_note_about_the_student(String string) {
        us_17_teacher_management_page.infoNote.sendKeys(string);
    }

    @When("click on Submit Button")
    public void click_on_submit_button() {
        us_17_teacher_management_page.submitButton.click();
    }

    @Then("verify User sees lesson name in Student Info list")
    public void verify_user_sees_lesson_name_in_student_info_list() {
        us_17_teacher_management_page.verifyLessonName.isDisplayed();
    }

    //tc_04
    @When("leave Choose Lesson option blank")
    public void leave_choose_lesson_option_blank() {
        us_17_teacher_management_page.chooseLesson.sendKeys("");
    }

    @When("leave Choose Lesson option unselected")
    public void leave_choose_lesson_option_unselected() {
        us_17_teacher_management_page.verifyLesson.isDisplayed();
    }

    //tc_05
    @When("leave on Choose Student option blank")
    public void leave_on_choose_student_option_blank() {
        us_17_teacher_management_page.chooseStudent.sendKeys("");
    }
    @Then("verify User sees student name in Student Info list")
    public void verify_user_sees_student_name_in_student_info_list() {
        us_17_teacher_management_page.verifyStudent.isDisplayed();
    }
    //tc_06
    @When("leave on Choose Education Term option blank")
    public void leave_on_choose_education_term_option_blank() {
        us_17_teacher_management_page.educationTerm.sendKeys("");
    }
    @Then("verify User sees education term in Student Info list")
    public void verify_user_sees_education_term_in_student_info_list() throws InterruptedException {
       us_17_teacher_management_page.verifyTerm.isDisplayed();
    }

    //tc_07
    @When("leave absentee blank")
    public void leave_absentee_blank() {
        us_17_teacher_management_page.absentee.sendKeys("");
    }
    @Then("verify User sees absentee required message in Student Info list")
    public void verify_user_sees_absentee_required_message_in_student_info_list() {
        us_17_teacher_management_page.verifyAbsenteeRequired.isDisplayed();
    }

    //tc_08
    @When("leave Midterm Exam blank")
    public void leave_midterm_exam_blank() {
        us_17_teacher_management_page.midtermExam.sendKeys("");
    }
    @Then("verify User sees midterm exam required message in Student Info list")
    public void verify_user_sees_midterm_exam_required_message_in_student_info_list() {
       us_17_teacher_management_page.verifyMidtermExamRequired.isDisplayed();
    }
    //tc_09
    @When("leave Final Exam blank")
    public void leave_final_exam_blank() {
       us_17_teacher_management_page.finalExam.sendKeys("");
    }
    @Then("verify User sees final exam required message in Student Info list")
    public void verify_user_sees_final_exam_required_message_in_student_info_list() {
       us_17_teacher_management_page.verifyFinalExamRequired.isDisplayed();
    }
    //tc_10
    @When("leave Info Note About The Student blank")
    public void leave_info_note_about_the_student_blank() {
        us_17_teacher_management_page.infoNote.sendKeys("");
    }
    @Then("verify User sees info required message in Student Info list")
    public void verify_user_sees_info_required_message_in_student_info_list() {
        us_17_teacher_management_page.verifyInfoNoteRequired.isDisplayed();
    }


}
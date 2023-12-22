package stepdefinitions.US_09_19_sibel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.sibel.TeacherManagementPage;
import pages.sibel.ViceDeanHomePage;
import utilities.ActionsUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;


public class US19StepDefs {
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    @Given("Click Menu from right top off the page in teacher page")
    public void clickMenu() {
      teacherManagementPage.menu.click();
    }
    @Given("Click Meet Management from the Left Menu Bar")
    public void clickMeetManagement() {
        teacherManagementPage.meetManagement.click();
    }
    @Given("Click Dropdown from Student List")
    public void click_dropdown_from_student_list() {
       JSUtils.JSclickWithTimeout(teacherManagementPage.selectStudent);
       WaitUtils.waitFor(2);

    }
    @And("Set Student name {string}")
    public void setStudentName(String studentName) {
       teacherManagementPage.inputStudent.sendKeys(studentName,""+Keys.ENTER);
    WaitUtils.waitFor(2);
    }

    @Given("Choose a Valid date From Date of Meet section")
    public void choose_a_valid_future_date_from_date_of_meet_section() {
        teacherManagementPage.dateInput.sendKeys("01/01/2024");
    }
    @And("Choose an UNValid date From Date of Meet section")
    public void chooseAnUNValidDateFromDateOfMeetSection() {
        teacherManagementPage.dateInput.sendKeys("01/01/2023");

    }
    @Given("enter a start time for the meeting")
    public void enter_a_start_time_for_the_meeting() {
        teacherManagementPage.timeInput.sendKeys("0120");
    }
    @Given("enter valid stop time for meeting")
    public void enter_valid_stop_time_a_time_after_the_start_time_for_meeting() {
       teacherManagementPage.stopTimeInput.sendKeys("0200");
    }
    @And("enter an INVALID stop time which is before the start time for meeting")
    public void enterAnInvalidStopTimeWhichIsBeforeTheStartTimeForMeeting() {
        teacherManagementPage.stopTimeInput.sendKeys("0110");

    }
    @Given("type a Description related to meeting")
    public void type_a_description_related_to_meeting() {
       teacherManagementPage.descriptionInput.sendKeys("Lesson related");
        WaitUtils.waitFor(2);
    }
    @Given("Click Submit Button")
    public void click_submit_button() throws InterruptedException {
        JSUtils.JSclickWithTimeout(teacherManagementPage.submitButton);
        Thread.sleep(2000);

    }
    @Then("verify if meeting created successfully")
    public void verifyIfMeetingCreatedSuccessfully() {
        Assert.assertTrue(teacherManagementPage.successMessage.isDisplayed());
    }
    @Then("verify if meeting couldn't created successfully")
    public void verifyIfMeetingCouldnTCreatedSuccessfully() {
Assert.assertTrue(teacherManagementPage.invalidDateMessage.isDisplayed());
    }
    @Then("verify if ERROR message has displayed for times")
    public void verifyIfERRORMessageHasDisplayedForTimes() {
        Assert.assertTrue(teacherManagementPage.invalidTimeMessage.isDisplayed());
    }

    @Then("Verify if Student selected successfully and visible on the list")
    public void verify_if_student_selected_successfully_and_visible_on_the_list() {
        Assert.assertTrue(teacherManagementPage.studentNameOnTheList.isDisplayed());
    }
    @Then("Verify if Meeting date selected successfully and visible")
    public void verify_if_meeting_date_selected_successfully_and_visible() {
        Assert.assertTrue(teacherManagementPage.meetingDateOnTheList.isDisplayed());
    }
    @Then("Verify if Meeting time selected successfully and visible")
    public void verify_if_meeting_time_selected_successfully_and_visible() {
        Assert.assertTrue(teacherManagementPage.startTimeOnTheList.isDisplayed());
        Assert.assertTrue(teacherManagementPage.stopTimeOnTheList.isDisplayed());
    }
    @Then("verify Description is visible on the created meeting")
    public void verify_description_is_visible_on_the_created_meeting() {
       Assert.assertTrue(teacherManagementPage.descriptionOnTheList.isDisplayed());
    }
    @And("Choose two Students names are {string},{string}")
    public void chooseTwoStudentsNamesAre(String arg0, String arg1) {
        teacherManagementPage.inputStudent.sendKeys(arg0,""+Keys.ENTER);
        teacherManagementPage.inputStudent.sendKeys(arg1,""+Keys.ENTER);
        WaitUtils.waitFor(2);

    }



}

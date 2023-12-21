package stepdefinitions.US_20_mertcan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.mertcan.US_20_Teacher_Management_Page;
import utilities.Driver;
import utilities.JSUtils;



import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.WaitUtils.waitFor;

public class US_20_Teacher_Management {
    US_20_Teacher_Management_Page us_20_teacher_management_page = new US_20_Teacher_Management_Page();

    //TC_01
    @Given("go to homepage")
    public void go_to_homepage() {
        Driver.getDriver().get("https://managementonschools.com/");
        waitFor(1);

    }
    @When("click login button")
    public void click_login_button() {
        us_20_teacher_management_page.loginbutton.click();
        waitFor(1);

    }
    @When("enter username {string}")
    public void enter_username(String string) {
        us_20_teacher_management_page.userName.sendKeys("teacherjane");
        waitFor(1);

    }
    @When("enter password {string}")
    public void enter_password(String string) {
        us_20_teacher_management_page.password.sendKeys("janeTeacher9");
        waitFor(1);

    }
    @When("click login")
    public void click_login() {
        us_20_teacher_management_page.loginbutton.click();
        waitFor(1);

    }
    @Then("verify User logged in")
    public void verify_user_logged_in() {
        assertTrue(us_20_teacher_management_page.verifyUsername.getText().contains("teachermartin"));
        waitFor(1);

    }

    //TC_02
    @Given("click menu ")
    public void click_menu () {
        us_20_teacher_management_page.menuButton.click();
        waitFor(1);

    }
    @Given("click meet management")
    public void click_meet_management() {
        us_20_teacher_management_page.meetmanagement.click();
        waitFor(1);

    }
    @Given("verify date time enter")
    public void verify_date_time_enter() {
        Assert.assertTrue(us_20_teacher_management_page.meetingDate.isDisplayed());
        waitFor(1);


    }
    @Given("verify start time enter")
    public void verify_start_time_enter() {
        Assert.assertTrue(us_20_teacher_management_page.startTime.isDisplayed());
        waitFor(1);


    }
    @Given("verify stop time enter")
    public void verify_stop_time_enter() {
        Assert.assertTrue(us_20_teacher_management_page.stopTime.isDisplayed());
        waitFor(1);

    }
    @Then("verify description enter")
    public void verify_description_enter() {
        Assert.assertTrue(us_20_teacher_management_page.description.isDisplayed());
        waitFor(1);

    }
    //TC_03
    @Given("click menu button")
    public void click_menu_button() {
        us_20_teacher_management_page.menuButton.click();
        waitFor(1);

    }
    @Given("click meet management button")
    public void click_meet_management_button() {
        us_20_teacher_management_page.meetmanagement.click();
        waitFor(1);

    }
    @Given("click edit button")
    public void click_edit_button() {
        us_20_teacher_management_page.editButton.click();
        waitFor(1);

    }
    @Given("change date of meet")
    public void change_date_of_meet() {
        us_20_teacher_management_page.dateofmeet.sendKeys("15/12/2024");
        waitFor(1);

    }
    @Given("change start time")
    public void change_start_time() {
        us_20_teacher_management_page.changedstarttime.sendKeys("08:00PM");
        waitFor(1);

    }
    @Given("change stop time")
    public void change_stop_time() {
        us_20_teacher_management_page.changedstoptime.sendKeys("10:00PM");
        waitFor(1);
    }
    @Then("delete description")
    public void delete_description() {
        us_20_teacher_management_page.changedescp.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
        waitFor(1);
    }
    @Then("add new description")
    public void add_new_description() {
        us_20_teacher_management_page.changedescp.sendKeys("meeting");
        waitFor(1);
    }
    @Then("click changed submit button")
    public void click_changed_submit_button(){
        us_20_teacher_management_page.changedsubmitb.click();
        waitFor(1);
    }
    @And("close meeting")
    public void closeMeeting() {
        us_20_teacher_management_page.closebutton.click();
        waitFor(1);
    }
    @And("delete meetings")
    public void deleteMeetings() {
        int idx = 0;
        List<WebElement> allstudentname = Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[1]"));
        for (int i = 0; i < allstudentname.size(); i++) {
            if (allstudentname.get(i).getText().equals("ADASGS AGFDSJH")) {
                idx = i;

            }
        }
        WebElement editButtonWE = Driver.getDriver().findElement(By.xpath("(//tbody//tr//td//button)[2]"));
        JSUtils.JSclickWithTimeout(editButtonWE);
    }


}



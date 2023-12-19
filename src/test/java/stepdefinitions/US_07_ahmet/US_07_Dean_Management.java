package stepdefinitions.US_07_ahmet;

import io.cucumber.java.en.*;
import pages.ahmet.US_07_Dean_Management_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US_07_Dean_Management {
    US_07_Dean_Management_Page us_07_dean_management_page = new US_07_Dean_Management_Page();
    @Given("go to homepage")
    public void go_to_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("managementOnSchool_URL"));
    }
    @When("click login button")
    public void click_login_button() {
        us_07_dean_management_page.login.click();
    }
    @When("enter username {string}")
    public void enter_username(String string) {
        us_07_dean_management_page.username.sendKeys(string);
    }
    @When("enter password {string}")
    public void enter_password(String string) {
        us_07_dean_management_page.password.sendKeys(string);
    }
    @When("click login")
    public void click_login() {
        us_07_dean_management_page.loginButton.click();
    }
    @Then("verify User logged in")
    public void verify_user_logged_in() {
        assertTrue(us_07_dean_management_page.verifyUsername.getText().contains("jackdoe159"));
    }

    //TC_02
    @When("click menu button")
    public void click_menu_button() {
        us_07_dean_management_page.menu.click();
        WaitUtils.waitFor(1);
    }
    @When("User signed out")
    public void user_signed_out() {
        us_07_dean_management_page.menu.click();
        us_07_dean_management_page.logOut.click();
        us_07_dean_management_page.confirmLogOut.click();
    }
    @When("verify that User sees contact get all")
    public void verify_that_user_sees_contact_get_all() {
        assertTrue(us_07_dean_management_page.verifyContactGetAll.getText().contains("Contact Get All"));
    }
    @When("click Contact Get All")
    public void click_contact_get_all() {
        us_07_dean_management_page.clickContactGetAll.click();
    }
    @Then("verify User sees Contact Message header")
    public void verify_user_sees_contact_message_header() {
        assertTrue(us_07_dean_management_page.contactMessageHeader.getText().contains("Contact Message"));
    }
    @Then("verify User sees Delete button")
    public void verify_user_sees_delete_button() {
        assertTrue(us_07_dean_management_page.deleteButton.isDisplayed());
    }

    //TC_03
    @When("verify User sees Name")
    public void verify_user_sees_name() {
        assertTrue(us_07_dean_management_page.verifyName.isDisplayed());
    }
    @When("verify User sees Email")
    public void verify_user_sees_email() {
        assertTrue(us_07_dean_management_page.verifyEmail.isDisplayed());
    }
    @When("verify User sees Date")
    public void verify_user_sees_date() {
        assertTrue(us_07_dean_management_page.verifyDate.isDisplayed());
    }
    @When("verify User sees Subject")
    public void verify_user_sees_subject() {
        assertTrue(us_07_dean_management_page.verifySubject.isDisplayed());
    }
    @When("verify User sees Message")
    public void verify_user_sees_message() {
        assertTrue(us_07_dean_management_page.verifyMessage.isDisplayed());
    }

    //TC_04
    @Then("verify User deletes messages")
    public void verify_user_deletes_messages() {
        assertTrue(us_07_dean_management_page.deleteButton.isDisplayed());
    }


}

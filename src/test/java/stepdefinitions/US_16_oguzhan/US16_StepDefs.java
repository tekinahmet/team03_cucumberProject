package stepdefinitions.US_16_oguzhan;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.oguzhan.US16_VD_ManagementPage;
import utilities.Driver;
import utilities.MediaUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class US16_StepDefs {
    US16_VD_ManagementPage us16_vd_managementPage = new US16_VD_ManagementPage();

    @Given("go to homepage")
    public void go_to_homepage() {

        Driver.getDriver().get("https://managementonschools.com/");
    }
    @When("click login button")
    public void click_login_button() {
        us16_vd_managementPage.login.click();
    }
    @When("enter username {string}")
    public void enter_username(String string) {
        us16_vd_managementPage.viceDeanName.sendKeys(string);
    }
    @When("enter password {string}")
    public void enter_password(String string) {
        us16_vd_managementPage.viceDeanPassword.sendKeys(string);
    }
    @When("click login")
    public void click_login() {
        us16_vd_managementPage.loginButton.click();
    }
    @Then("verify User logged in")
    public void verify_user_logged_in() throws IOException {
        assertTrue(us16_vd_managementPage.verifyViceDeanName.getText().contains("HankTheVD"));
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @When("User signed out")
    public void user_signed_out() {
        us16_vd_managementPage.menu.click();
        us16_vd_managementPage.logOut.click();
        us16_vd_managementPage.confirmLogOut.click();
    }
    // Test Case 2

    @Then("verify User sees Delete button")
    public void verify_user_sees_delete_button() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
        assertTrue(us16_vd_managementPage.deleteButton.isDisplayed());


    }
    // Test Case 3
    @When("click menu button")
    public void click_menu_button() {
        us16_vd_managementPage.menu.click();
    }

    @When("click Contact Get All")
    public void click_contact_get_all() {
        us16_vd_managementPage.clickContactGetAll.click();
    }

    @When("verify User sees Contact Message header")
    public void verify_user_sees_contact_message_header() {
        assertTrue(us16_vd_managementPage.contactMessageHeader.getText().contains("Contact Message"));
    }

    @When("verify User sees Name")
    public void verify_user_sees_name() {
        assertTrue(us16_vd_managementPage.contactMessageHeader.getText().contains("Contact Message"));
    }

    @When("verify User sees Email")
    public void verify_user_sees_email() {
        assertTrue(us16_vd_managementPage.verifyEmail.isDisplayed());
    }

    @When("verify User sees Date")
    public void verify_user_sees_date() {
        assertTrue(us16_vd_managementPage.verifyDate.isDisplayed());
    }

    @When("verify User sees Subject")
    public void verify_user_sees_subject() {
        assertTrue(us16_vd_managementPage.verifySubject.isDisplayed());
    }

    @When("verify User sees Message")
    public void verify_user_sees_message() throws IOException {
        assertTrue(us16_vd_managementPage.verifyMessage.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
// Test Case 4

    @Then("verify User deletes messages")
    public void verify_user_deletes_messages() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
        assertTrue(us16_vd_managementPage.deleteButton.isDisplayed());
    }
//    @Then("user closes the driver")
//    public void user_closes_driver() {
//        Driver.closeDriver();
//    }

}

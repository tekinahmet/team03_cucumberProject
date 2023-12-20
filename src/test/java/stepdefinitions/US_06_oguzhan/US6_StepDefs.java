package stepdefinitions.US_06_oguzhan;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.oguzhan.US6_deanPage;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertTrue;


public class US6_StepDefs {

    US6_deanPage us6_deanPage = new US6_deanPage();
    Faker faker = new Faker();


    @Then("verify user logged in")
    public void verify_user_logged_in() {
        assertTrue(us6_deanPage.verifyDeanName.getText().contains("Final Project"));
    }
    @When("click Vice Dean Management")
    public void click_vice_dean_management() {
        us6_deanPage.viceDeanManagement.click();
    }
    @Then("verify User sees Vice Dean Management header")
    public void verify_user_sees_vice_dean_management_header() {
        assertTrue(us6_deanPage.verifyVDManagementPage.getText().contains("Vice Dean Management"));
    }
    // TEST CASE 1
    @Then("user click name box {string}")
    public void user_click_name_box(String name) throws InterruptedException {
     //   us6_deanPage.name.sendKeys(string);
        us6_deanPage.name.sendKeys(Faker.instance().name().firstName());
        WaitUtils.waitFor(1);
    }
    @Then("user click surname box {string}")
    public void user_click_surname_box(String surname) throws InterruptedException {
      // us6_deanPage.surname.sendKeys(string);
        us6_deanPage.surname.sendKeys(Faker.instance().name().lastName());
        WaitUtils.waitFor(1);
    }
    // ADD on this line Birth-Place

    @Then("user click Birth Place box {string}")
    public void user_click_birth_place_box(String birthPlace) {
      //  us6_deanPage.birthPlace.sendKeys(string); use faker below
        us6_deanPage.birthPlace.sendKeys(Faker.instance().address().city());

    }
    @Then("user click male in gender {string}")
    public void user_click_male_in_gender(String string) {
       us6_deanPage.male.click();
    }
    @Then("user enters birthday {string}")
    public void user_enters_birthday(String string) {
       us6_deanPage.DateOfBirth.sendKeys(string+ Keys.TAB);
        WaitUtils.waitFor(2);
    }
    @Then("user enters phone number as xxx-xxx-xxxx  {string}")
    public void user_enters_phone_number_as_xxx_xxx_xxxx(String phoneNumber) {
    //   us6_deanPage.phoneNumber.sendKeys(string);
       us6_deanPage.phoneNumber.sendKeys(""+Faker.instance().number().digits(3)+"-"+Faker.
               instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
        WaitUtils.waitFor(2);
    }

    @Then("user enters SSN as xxx-xx-xxxx {string}")
    public void user_enters_ssn_as_xxx_xx_xxxx(String ssnNumber) {
     //  us6_deanPage.ssnNumber.sendKeys(string);
       us6_deanPage.ssnNumber.sendKeys(Faker.instance().number().digits(3)+"-"+Faker.
               instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
        WaitUtils.waitFor(1);
    }
    @Then("user enters userName as {string}")
    public void user_enters_user_name_as(String userName) {
      //  us6_deanPage.username.sendKeys(string);
        us6_deanPage.username.sendKeys(Faker.instance().name().firstName());
    }

    @Then("user enters password \\(at least eight characters, one number, uppercase letter, lowercase letter) as {string}")
    public void user_enters_password_at_least_eight_characters_one_number_uppercase_letter_lowercase_letter_as(String string) {
       us6_deanPage.password.sendKeys(string);
    }
    @Then("user click submit")
    public void user_click_submit() {
      us6_deanPage.submitButton.click();
      WaitUtils.waitFor(1);
    }
    // VICE-DEAN SAVED CODE
    @Then("verify Vice dean Saved")
    public void verify_vice_dean_saved() throws IOException {
        assertTrue(us6_deanPage.savedAlert.isDisplayed());
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @When("user signed out")
    public void user_signed_out() {
       us6_deanPage.menu.click();
       us6_deanPage.logOut.click();
       us6_deanPage.confirmLogOut.click();
    }

// TEST CASE 2
@When("user click female in gender {string}")
public void user_click_female_in_gender(String string) throws IOException {
    us6_deanPage.female.click();
    MediaUtils.takeScreenshotOfTheEntirePage();
}
// TEST CASE 3
@Then("User directly clicks on the submit button")
public void user_directly_clicks_on_the_submit_button() {
   us6_deanPage.submitButton.click();
}
    @Then("verify that the user sees a red Required warning each box")
    public void verify_that_the_user_sees_a_red_required_warning_each_box() throws IOException {
        assertTrue(us6_deanPage.requiredAlert.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
// TEST CASE 4

    @Then("user enters SSN in wrong format")
    public void user_enters_ssn_in_wrong_format() {
        us6_deanPage.ssnNumber.sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().
                digits(3)+"-"+Faker.instance().number().digits(3));
    }
    @Then("verify that the user sees a red wrong SSN warning at related box")
    public void verify_that_the_user_sees_a_red_wrong_ssn_warning_each_box() throws IOException {
       assertTrue(us6_deanPage.alertSSN.isDisplayed());
       MediaUtils.takeScreenshotOfTheEntirePage();
    }
    // TEST CASE 5
    @When("user enters password less than eight characters as {string}")
    public void user_enters_password_less_than_eight_characters_as(String string) {
   us6_deanPage.password.sendKeys(string);
}

    // at least 8 characters warning
    @Then("verify user sees At least {int} characters warning")
    public void verify_user_sees_at_least_characters_warning(Integer int1) throws IOException {
        assertTrue(us6_deanPage.charAlert.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    // TEST CASE 6
    @Then("verify user sees missing upper case warning")
    public void verify_user_sees_missing_upper_case_warning() throws IOException {
        assertTrue(us6_deanPage.upperCaseAlert.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    // TEST CASE 7
    @Then("verify user sees missing One lowercase character")
    public void verify_user_sees_missing_one_lowercase_character() throws IOException {
       assertTrue(us6_deanPage.lowerCaseAlert.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    // TEST CASE 8
    @Then("verify user sees missing One number character")
    public void verify_user_sees_missing_one_number_character() throws IOException {
      assertTrue(us6_deanPage.oneNumber.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Then("user closes driver")
    public void user_closes_driver() {
        Driver.closeDriver();
    }

}







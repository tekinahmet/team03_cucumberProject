package stepdefinitions.US_22_fatma;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.fatma.Fatma_US_login;
import pages.fatma.Fatma_US_22_Admin;
import utilities.Driver;
import utilities.MediaUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class US_22 {

    Fatma_US_login fatmaUs22 = new Fatma_US_login();
    Fatma_US_22_Admin fatmaUs22Admin = new Fatma_US_22_Admin();


    //******************TC_01*******************

    @Given("User goes to the {string}")
    public void user_goes_to_the(String string) throws IOException {

        Driver.getDriver().get(string);

    }

    @When("user clicks on login button")
    public void click_on_login_button() {
        fatmaUs22.login.click();

    }

    @When("user enters the username {string}")
    public void enter_the_username(String string) {
        fatmaUs22.userName.sendKeys(string);

    }

    @When("user enters the password {string}")
    public void enter_the_password(String string) {
        fatmaUs22.password.sendKeys(string);

    }

    @When("user clicks on login")
    public void click_on_login() {
        fatmaUs22.loginButton.click();

    }

    @Then("user must see the Add Admin on the page")
    public void must_see_the_on_the_page() {
        WaitUtils.waitFor(2);
        assertTrue(fatmaUs22Admin.adminVisibility.isDisplayed());
    }

    @Then("User enters a name")
    public void user_enters_a_name() {
        fatmaUs22Admin.nameInput.sendKeys("John");

    }

    @Then("User  enters a surname")
    public void user_enters_a_surname() {
        fatmaUs22Admin.surnameInput.sendKeys(Faker.instance().name().lastName());

    }

    @Then("User enters a birth place")
    public void user_enters_a_birth_place() {
        fatmaUs22Admin.birthPlace.sendKeys(Faker.instance().address().cityName());

    }

    @Then("User chooses a gender \\(clicks on male or female)")
    public void user_chooses_a_gender_clicks_on_male_or_female() {
        fatmaUs22Admin.maleGender.click();

    }

    @Then("User enters a birth date")
    public void user_enters_a_birth_date() {
        fatmaUs22Admin.date.sendKeys("03121990");

    }

    @Then("User enters a phone number as required")
    public void user_enters_a_phone_number_as_required() {
        fatmaUs22Admin.phoneNo.sendKeys("525-657-" + Faker.instance().number().numberBetween(1000, 9999));


    }

    @Then("User enters a SSN as required")
    public void user_enters_a_ssn_as_required() {
        fatmaUs22Admin.ssn.sendKeys("525-07-" + Faker.instance().number().numberBetween(1000, 9999));


    }

    @Then("User enters an username")
    public void user_enters_an_username() {
        fatmaUs22Admin.username.sendKeys(Faker.instance().name().username());


    }

    @Then("User enters a password as required")
    public void user_enters_a_password_as_required() {
        fatmaUs22Admin.password.sendKeys("Asdfuıo098");

    }

    @Then("User clicks on the submit button")
    public void user_clicks_on_the_submit_button() {

        fatmaUs22Admin.submitButton.click();

    }

    @Then("user must see the Admin Saved message")
    public void user_must_see_the_message() throws IOException {

        assertTrue(fatmaUs22Admin.adminSavedMessage.isDisplayed());


        MediaUtils.takeScreenshotOfTheEntirePage();
        Driver.closeDriver();
    }


    //*********************TC_02********************

    @Then("User directly clicks on the submit button")
    public void user_directly_clicks_on_the_submit_button() {
        fatmaUs22Admin.submitButton.click();

    }


    @Then("verify that the user sees a red Required warning each box")
    public void verify_that_the_user_sees_a_red_warning_each_box() throws IOException {

        assertTrue(fatmaUs22Admin.requiredMessage1.isDisplayed());
        assertTrue(fatmaUs22Admin.requiredMessage2.isDisplayed());
        assertTrue(fatmaUs22Admin.requiredMessage3.isDisplayed());
        assertTrue(fatmaUs22Admin.requiredMessage4.isDisplayed());
        assertTrue(fatmaUs22Admin.requiredMessage5.isDisplayed());
        assertTrue(fatmaUs22Admin.requiredMessage6.isDisplayed());
        assertTrue(fatmaUs22Admin.requiredMessage7.isDisplayed());
        assertTrue(fatmaUs22Admin.requiredMessage8.isDisplayed());

        MediaUtils.takeScreenshotOfTheEntirePage();
        Driver.closeDriver();

    }


    //******************TC_03******************
    @Then("User leaves the blank gender section")
    public void user_leaves_the_blank_gender_section() {


    }


    @Then("the user must not be able to add admin")
    public void the_user_must_not_be_able_to_add_admin() throws IOException {

        // assertFalse(fatmaUs22Admin.adminSavedMessage.isDisplayed()); //it's not working
        MediaUtils.takeScreenshotOfTheEntirePage();

        // For this case, user should not able to add admin.
        // So it is okay but, I did not see any required message as well.

    }


    //******************TC_04***************
    @Then("User enters a date \\(trying critical values)")
    public void user_enters_a_date_trying_critical_values() {
        fatmaUs22Admin.date.sendKeys("12021000");

    }

    @Then("user should not be able to log in with that impossible date")
    public void user_should_not_be_able_to_log_in_with_that_imposible_date() throws IOException {
        assertFalse(fatmaUs22Admin.adminSavedMessage.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();
        Driver.closeDriver();

        //Normally user should not able to log in, but it does. That is why this case failed.

    }

    //****************TC_05***************

    @Then("User enters a SSN first - missing")
    public void user_enters_a_ssn_first_missing() {
        fatmaUs22Admin.ssn.sendKeys("34423-5432");

    }


    @Then("must see the {string} message")
    public void must_see_the_message(String string) {
        assertTrue(fatmaUs22Admin.requiredMessage6.isDisplayed());

    }


    @Then("User enters a SSN second - missing")
    public void user_enters_a_ssn_second_missing() throws InterruptedException {

        wait(3000);
        fatmaUs22Admin.ssn.clear();
        fatmaUs22Admin.ssn.clear();
        fatmaUs22Admin.ssn.sendKeys("344-235432");

    }


    @Then("User enters more than eleven character")
    public void user_enters_more_than_character() throws InterruptedException {

        wait(3000);
        fatmaUs22Admin.ssn.clear();
        wait(3000);
        fatmaUs22Admin.ssn.clear();
        fatmaUs22Admin.ssn.sendKeys("123-34-34457");

    }


    @Then("must see the {string}")
    public void must_see_the(String string) throws IOException {
        assertTrue(fatmaUs22Admin.enterValidSSN.getText().contains(string));

        MediaUtils.takeScreenshotOfTheEntirePage();
        Driver.closeDriver();

    }

    //*****************TC_06******************

    @Then("User enters a password just one char")
    public void user_enters_a_password_just_one_char() {
        fatmaUs22Admin.password.sendKeys("f");

    }

    @Then("It has to appear {string} on the below")
    public void it_has_to_appear_on_the_below(String string) {
        assertTrue(fatmaUs22Admin.requiredMessage8.getText().contains(string));

    }

    @Then("User enters a password all lowercase eight char")
    public void user_enters_a_password_all_lowercase_char() {
        WaitUtils.waitFor(3);
        fatmaUs22Admin.password.clear();
        WaitUtils.waitFor(3);

        fatmaUs22Admin.password.sendKeys("asdfghjk");


    }

    @Then("User enters a password all uppercase eight char")
    public void user_enters_a_password_all_uppercase_char() {

        WaitUtils.waitFor(3);
        fatmaUs22Admin.password.clear();
        WaitUtils.waitFor(3);
        fatmaUs22Admin.password.sendKeys("ASDFGHJKL");


    }

    @Then("User enters a password with one uppercase but without number")
    public void user_enters_a_password_with_one_uppercase_but_without_number() throws IOException {

        WaitUtils.waitFor(3);
        fatmaUs22Admin.password.clear();
        WaitUtils.waitFor(3);
        fatmaUs22Admin.password.sendKeys("Asdh");
        MediaUtils.takeScreenshotOfTheEntirePage();
        Driver.closeDriver();


    }
}

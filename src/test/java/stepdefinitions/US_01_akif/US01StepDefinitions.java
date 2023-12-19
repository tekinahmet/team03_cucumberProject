package stepdefinitions.US_01_akif;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.akif.US01Locators;
import utilities.ActionsUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US01StepDefinitions {

    US01Locators us01Locators = new US01Locators();


    @Given("user goes to url {string}")
    public void user_goes_to_url(String url) {
        Driver.getDriver().get(url);
        Driver.getDriver().navigate().refresh();
        WaitUtils.waitFor(1);

    }

    @When("click on register button at the top right")
    public void click_on_register_button_at_the_top_right() {
        us01Locators.topRegisterButton.click();
        WaitUtils.waitFor(1);

    }

    @Then("verify that register page opened")
    public void verify_that_register_page_opened() {
        Assert.assertTrue(us01Locators.registerIcon.isDisplayed());
        WaitUtils.waitFor(1);
    }

    @Then("enter name {string}")
    public void enter_name(String name) {
        us01Locators.registerName.sendKeys(name);
        WaitUtils.waitFor(1);
    }

    @Then("enter surname {string}")
    public void enter_surname(String surname) {
        us01Locators.surname.sendKeys(surname);
        WaitUtils.waitFor(1);
    }

    @Then("enter birth place {string}")
    public void enter_birth_place(String birthplace) {
        us01Locators.birthPlace.sendKeys(birthplace);
        WaitUtils.waitFor(1);
    }

    @Then("enter phone number {string}")
    public void enter_phone_number(String phonenumber) {
        us01Locators.phoneNumber.sendKeys(phonenumber);
        WaitUtils.waitFor(1);
    }

    @Then("choose gender")
    public void choose_gender() {
        JSUtils.JSclickWithTimeout(us01Locators.genderFemale);
        WaitUtils.waitFor(1);
    }

    @Then("enter date of birth {string}")
    public void enter_date_of_birth(String birthday) {
        us01Locators.dateOfBirth.sendKeys(birthday);
        WaitUtils.waitFor(1);
    }

    @Then("enter SSN {string}")
    public void enter_ssn(String ssn) {
        us01Locators.SSN.sendKeys(ssn);
        WaitUtils.waitFor(1);
    }

    @Then("enter registrationUsername {string}")
    public void enter_registration_username(String username) {
        us01Locators.registerUserName.sendKeys(username);
        WaitUtils.waitFor(1);
    }

    @Then("enter registrationPassword {string}")
    public void enter_registration_password(String password) {
        us01Locators.registerPassword.sendKeys(password);
        WaitUtils.waitFor(1);
    }

    @Then("click on register button at the bottom")
    public void click_on_register_button_at_the_bottom() {
        JSUtils.JSclickWithTimeout(us01Locators.bottomRegisterButton);
        WaitUtils.waitFor(1);

    }

    @Then("verify that registration is successful")
    public void verify_that_registration_is_successful() {
        Assert.assertTrue(us01Locators.alertUS01.isDisplayed());
    }

    @Then("verify that registration is not successful")
    public void verify_that_registration_is_not_successful() {
        Assert.assertFalse(us01Locators.alertUS01.isDisplayed());
    }






}


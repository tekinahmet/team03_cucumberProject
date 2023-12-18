package stepdefinitions.US_05_zeynep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import pages.zeynep.US_05_Dean_Management_Page;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.security.Key;

import static org.junit.Assert.assertTrue;

public class US_05_StepDefs {

    US_05_Dean_Management_Page us_05_dean_management_page = new US_05_Dean_Management_Page();

    @Given("go to webpagee")
    public void go_to_webpagee() {
        Driver.getDriver().get("https://managementonschools.com/");
        WaitUtils.waitFor(2);
    }

    @When("click on loginn")
    public void clickOnLoginn() {
        us_05_dean_management_page.login.click();
    }

    @And("enter usernamee {string}")
    public void enterUsernamee(String username) {
        us_05_dean_management_page.username.sendKeys(username);
    }

    @And("enter passwordd {string}")
    public void enterPasswordd(String password) {
        us_05_dean_management_page.password.sendKeys(password);
    }

    @And("click login buttonn")
    public void clickLoginButtonn() {
        us_05_dean_management_page.loginButton.click();
        WaitUtils.waitFor(2);
    }


    @And("click on Menu buttonn")
    public void clickOnMenuButton() {
        us_05_dean_management_page.menuButton.click();
        WaitUtils.waitFor(2);
    }


    @And("click on Dean Management")
    public void clickOnDeanManagement() {
        us_05_dean_management_page.deanManagement.click();
        WaitUtils.waitFor(3);
    }


    //TC_01
    @Then("Verify Name column is visible")
    public void verifyNameColumnIsVisible() {
        Assert.assertTrue(us_05_dean_management_page.nameColumn.isDisplayed());
        WaitUtils.waitFor(3);
    }

    @Then("Verify Gender column is visible")
    public void verifyGenderColumnIsVisible() {
        Assert.assertTrue(us_05_dean_management_page.genderColumn.isDisplayed());
    }

    @Then("Verify Phone Number column is visible")
    public void verifyPhoneNumberColumnIsVisible() {
        Assert.assertTrue(us_05_dean_management_page.phoneNumberColumn.isDisplayed());
    }

    @Then("Verify SSN column is visible")
    public void verifySSNColumnIsVisible() {
        Assert.assertTrue(us_05_dean_management_page.ssnColumn.isDisplayed());
    }

    @Then("Verify User Name Information is visible")
    public void verifyUserNameInformationIsVisible() {
        Assert.assertTrue(us_05_dean_management_page.userNameColumn.isDisplayed());
    }

    //TC_03
    @Then("Click on edit button at the end of the row")
    public void clickOnEditButtonAtTheEndOfTheRow() {
        JSUtils.JSclickWithTimeout(us_05_dean_management_page.editButton);
        WaitUtils.waitFor(3);
    }

    @And("enter name")
    public void enterName() {
        us_05_dean_management_page.nameField.sendKeys("folina");
    }

    @And("enter surname {string}")
    public void enterSurname(String enter_surnamez) {us_05_dean_management_page.surnameField.sendKeys(enter_surnamez);
    }

    @And("birth place {string}")
    public void birthPlace(String birth_place) {us_05_dean_management_page.birthPlaceField.sendKeys(Keys.CONTROL + "a");
        us_05_dean_management_page.birthPlaceField.sendKeys(Keys.DELETE);
        us_05_dean_management_page.birthPlaceField.sendKeys(birth_place);
    }

    @And("gender")
    public void gender() {us_05_dean_management_page.genderOption.click();
    }

    @And("date of birth")
    public void dateOfBirth() {us_05_dean_management_page.dateOfBirth.sendKeys();
    }

    @And("date of birth {string}")
    public void dateOfBirth(String date_birthz) {us_05_dean_management_page.dateOfBirth.sendKeys(date_birthz);
    }

    @And("phone number {string}")
    public void phoneNumber(String phoneNumberz) {us_05_dean_management_page.phoneField.sendKeys(Keys.CONTROL + "a");
        us_05_dean_management_page.phoneField.sendKeys(Keys.DELETE);
        us_05_dean_management_page.phoneField.sendKeys(phoneNumberz);
    }

    @And("ssn {string}")
    public void ssn(String ssnNumberz) {us_05_dean_management_page.ssnField.sendKeys(Keys.CONTROL + "a");
        us_05_dean_management_page.ssnField.sendKeys(Keys.DELETE);
        us_05_dean_management_page.ssnField.sendKeys(ssnNumberz);
    }

    @And("user name information {string}")
    public void userNameInformation(String user_name_infoz) {us_05_dean_management_page.userNameFiled.sendKeys(Keys.CONTROL +"a");
        us_05_dean_management_page.userNameFiled.sendKeys(Keys.DELETE);
        us_05_dean_management_page.userNameFiled.sendKeys(user_name_infoz);
    }

    @And("click on submit button")
    public void clickOnSubmitButton() {us_05_dean_management_page.submitButton.click();
    }

    @And("passwordz {string}")
    public void passwordz(String enter_passwordz) {us_05_dean_management_page.passwordField.sendKeys(enter_passwordz);
    }


    @Then("Verify that Dean updated successful message is visible")
    public void verifyThatDeanUpdatedSuccessfulMessageIsVisible() {Assert.assertTrue(us_05_dean_management_page.verifyMessagez.isDisplayed());
    }
}


//@And("enter surname {string}")
    //public void enterSurname(String enter_surname) {us_05_dean_management_page.surnameField.sendKeys(enter_surname);
    //}

   // @And("birth place {string}")
   // public void birthPlace(String birthplace) {us_05_dean_management_page.birthPlaceField.sendKeys(birthplace);
   // }

    //@And("gender")
    //public void gender() {us_05_dean_management_page.genderOption.click();
    //}








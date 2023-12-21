package stepdefinitions.US_04_melik;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import pages.melik.Melik_AdminPage;
import pages.melik.Melik_DeanPage;
import pages.melik.Melik_LoginPage;
import utilities.Driver;


import static org.junit.Assert.*;

public class US_04_StepDefinitions {

    Melik_LoginPage loginPage = new Melik_LoginPage();
    Melik_AdminPage adminPage = new Melik_AdminPage();
    Melik_DeanPage deanPage = new Melik_DeanPage();

    public static String userName;
    public static String password;
    public static String firstName;

    @Given("User navigates to the {string}")
    public void user_navigates_to_the(String url) {

        Driver.getDriver().get(url);

    }
    @When("User clicks the login button at the top of page")
    public void user_clicks_the_login_button_at_the_top_of_page() {

        loginPage.login.click();
    }
    @When("User enters the username as {string}")
    public void user_enters_the_username_as(String username) {

        loginPage.username.sendKeys(username);

    }
    @When("User enters the password as {string}")
    public void user_enters_the_password_as(String password) {

        loginPage.password.sendKeys(password);

    }
    @When("User clicks the login button")
    public void user_clicks_the_login_button() {

        loginPage.loginButton.click();

    }
    @When("User clicks the menu button")
    public void user_clicks_the_menu_button() {

        adminPage.menuButton.click();

    }
    @When("User clicks the Dean Management button")
    public void user_clicks_the_dean_management_button() {

        adminPage.deanManagement.click();

    }

    @When("Verify that Admin is on Dean Management page")
    public void verify_that_admin_is_on_dean_management_page() {

        assertTrue(deanPage.addDeanText.getText().contains("Add Dean"));

    }


    @When("User enters the name {string}")
    public void user_enters_the_name(String name) {

        firstName = Faker.instance().name().firstName();
        deanPage.name.click();
        deanPage.name.sendKeys(Faker.instance().name().firstName());

    }
    @When("User enters the surname {string}")
    public void user_enters_the_surname(String surname) {

        deanPage.surname.sendKeys(Faker.instance().name().lastName());

    }
    @When("User enters Birth Place {string}")
    public void user_enters_birth_place(String BirthPlace) {

        deanPage.birthPlace.sendKeys(Faker.instance().address().city());

    }
    @When("User clicks the Male in the gender")
    public void user_clicks_the_male_in_the_gender() {

        if (!deanPage.male.isSelected()){
            deanPage.male.click();
        }

    }
    @When("User enters the Date of Birth")
    public void user_enters_the_date_of_birth() {

        deanPage.DateOfBirth.sendKeys("11021995");

    }

    @When("User enters the phone number {string} as xxx-xxx-xxxx")
    public void user_enters_the_phone_number_as_xxx_xxx_xxxx(String string) {


        deanPage.phoneNumber.sendKeys(""+Faker.instance().number().digits(3)+
                "-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));

    }
    @When("User enters the Ssn Number {string} as xxx-xx-xxxx")
    public void user_enters_the_ssn_number_as_xxx_xx_xxxx(String string) {

        deanPage.ssnNumber.sendKeys(""+Faker.instance().number().digits(3)+
                "-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));

    }

    @When("User enters the User Name {string}")
    public void user_enters_the_user_name(String string) {

        userName = Faker.instance().name().username();
        deanPage.username.sendKeys(userName);

    }

//    @When("User enters Password {string} \\(at least eight characters, one number, uppercase letter, lowercase letter)")
//    public void user_enters_password_at_least_eight_characters_one_number_uppercase_letter_lowercase_letter(String string) {
//
//        deanPage.password.sendKeys(Faker.instance().internet().password(9,11,true,true,true));
//
//    }

    @When("User enters Password {string}")
    public void user_enters_password(String Password) {

        password = Password;
        deanPage.password.sendKeys(password);

    }
    @When("User click the submit button")
    public void user_click_the_submit_button() {

        deanPage.submitButton.click();

    }

    @Then("Verify that the alert is visible Dean Saved")
    public void verifyThatTheAlertIsVisibleDeanSaved() throws InterruptedException {

        assertTrue(deanPage.alertForDean.isDisplayed());
        Thread.sleep(2);
    }


    @When("User leaves blank into the name {string}")
    public void user_leaves_blank_into_the_name(String name) {

        deanPage.name.sendKeys(name);

    }
    @When("User leaves blank into the Surname {string}")
    public void user_leaves_blank_into_the_surname(String Surname) {

        deanPage.surname.sendKeys(Surname);
    }
    @When("User leaves blank into the Birth Place {string}")
    public void user_leaves_blank_into_the_birth_place(String string) {

     deanPage.birthPlace.sendKeys(string);
    }
    @When("User leaves blank into the Date of Birth {string}")
    public void user_leaves_blank_into_the_date_of_birth(String string) {

        deanPage.DateOfBirth.sendKeys(string);
    }
    @When("User leaves blank into the Phone number {string}")
    public void user_leaves_blank_into_the_phone_number(String string) {

        deanPage.phoneNumber.sendKeys(string);
    }
    @When("User leaves blank into the Ssn Number {string}")
    public void user_leaves_blank_into_the_ssn_number(String string) {

        deanPage.ssnNumber.sendKeys(string);
    }
    @When("User leaves blank into the User Name {string}")
    public void user_leaves_blank_into_the_user_name(String string) {

        deanPage.username.sendKeys(string);
    }
    @Then("Verify that the text is visible as Required")
    public void verifyThatTheTextIsVisibleAsRequired() {

            assertTrue(deanPage.verifyName.getText().contains("Required"));
            assertTrue(deanPage.verifySurname.getText().contains("Required"));
            assertTrue(deanPage.verifyBirthPlace.getText().contains("Required"));
            assertTrue(deanPage.verifyDateOfBirth.getText().contains("Required"));
            assertTrue(deanPage.verifyPhoneNumber.getText().contains("Required"));
            assertTrue(deanPage.verifySsnNumber.getText().contains("Required"));
            assertTrue(deanPage.verifyUserName.getText().contains("Required"));
            assertTrue(deanPage.verifyPassword.getText().contains("Enter your password"));

    }

    @When("User leaves blank into the Password {string}")
    public void user_leaves_blank_into_the_password(String Password) {

        deanPage.password.sendKeys(Password);
    }

    @When("User enters the invalid Ssn Number {string} as xxx-xx-xxxx")
    public void user_enters_the_invalid_ssn_number_as_xxx_xx_xxxx(String string) {
        deanPage.ssnNumber.click();
        deanPage.ssnNumber.sendKeys(string);
    }


    @Then("Verify that the alert is visible Please enter valid SSN number")
    public void verifyThatTheAlertIsVisiblePleaseEnterValidSSNNumber() {

//        JSUtils.JSclickWithTimeout(deanPage.alertForSsn);
//        assertTrue(Driver.getDriver().switchTo().alert().getText().contains("enter valid"));

//        Actions actions = new Actions(Driver.getDriver());
//        actions.clickAndHold(deanPage.alertForSsn).perform();
//        assertTrue(Driver.getDriver().switchTo().alert().getText().contains("enter valid"));


        assertTrue(deanPage.alertForSsn.isDisplayed());
        
    }

    @Then("Verify that the text is visible for Ssn Number")
    public void verifyThatTheAlertIsVisibleForSsnNumber() {

        assertTrue(deanPage.verifySsnNumber.getText().contains("Minimum 11"));
    }



    @When("User enters invalid Password {string}")
    public void user_enters_invalid_password(String Password) {
        deanPage.password.sendKeys(Password);

    }
    @Then("Verify that the text is visible for password")
    public void verifyThatTheTextIsVisibleForPassword() {

        String invalidPasswordText = deanPage.verifyPassword.getText();
        if(invalidPasswordText.contains("At least 8 characters")){
            assertTrue(deanPage.verifyPassword.getText().contains("At least 8 characters"));

        } else if (invalidPasswordText.contains("uppercase")) {
            assertTrue(deanPage.verifyPassword.getText().contains("uppercase"));

        } else if (invalidPasswordText.contains("lowercase")) {
            assertTrue(deanPage.verifyPassword.getText().contains("lowercase"));
            
        }else {assertTrue(deanPage.verifyPassword.getText().contains("number"));}
    }





    @Then("Close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }



}

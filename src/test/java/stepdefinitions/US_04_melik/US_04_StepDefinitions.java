package stepdefinitions.US_04_melik;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import pages.melik.US_04_AdminPage;
import pages.melik.US_04_DeanPage;
import pages.melik.US_04_LoginPage;
import utilities.Driver;


import static org.junit.Assert.*;

public class US_04_StepDefinitions {

    US_04_LoginPage loginPage = new US_04_LoginPage();
    US_04_AdminPage adminPage = new US_04_AdminPage();
    US_04_DeanPage deanPage = new US_04_DeanPage();

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

        deanPage.DateOfBirth.sendKeys("11.02.1995");

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

        deanPage.username.sendKeys(Faker.instance().name().username());

    }
    @When("User enters Password {string} \\(at least eight characters, one number, uppercase letter, lowercase letter)")
    public void user_enters_password_at_least_eight_characters_one_number_uppercase_letter_lowercase_letter(String string) {

        deanPage.password.sendKeys(Faker.instance().internet().password(9,11,true,true,true));

    }
    @When("User click the submit button")
    public void user_click_the_submit_button() {

        deanPage.submitButton.click();

    }
}

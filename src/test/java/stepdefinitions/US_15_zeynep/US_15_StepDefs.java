package stepdefinitions.US_15_zeynep;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.zeynep.US_15_Student_Management_Page;
import utilities.Driver;
import utilities.WaitUtils;

public class US_15_StepDefs {

    US_15_Student_Management_Page us_15_student_management_page = new US_15_Student_Management_Page();
    @Given("go to webpagez")
    public void go_to_webpagez() {
        Driver.getDriver().get("https://managementonschools.com/");
    }
    @When("click on loginz")
    public void clickOnLoginz() {us_15_student_management_page.login.click();
        WaitUtils.waitFor(1);
    }

    @And("enter usernamez {string}")
    public void enterUsernamez(String username) {us_15_student_management_page.username.sendKeys(username);
        WaitUtils.waitFor(2);
    }

    @And("enter passwordz {string}")
    public void enterPasswordz(String password) {us_15_student_management_page.password.sendKeys(password);
    }

    @And("click login buttonz")
    public void clickLoginButtonz() {us_15_student_management_page.loginButton.click();
        WaitUtils.waitFor(2);
    }

    @And("click on Menu buttonz")
    public void clickOnMenuButtonz() {us_15_student_management_page.menuButton.click();
        WaitUtils.waitFor(2);
    }

    @And("click on Student Managementz")
    public void clickOnStudentManagementz() {us_15_student_management_page.studentManagement.click();
        WaitUtils.waitFor(3);
    }

    @And("choose teacher on dropdown menu")
    public void chooseTeacherOnDropdownMenu() {us_15_student_management_page.chooseTeacher.sendKeys("Porter Cormier");
    }

    @And("enter namez {string}")
    public void enterNamez(String name) {us_15_student_management_page.nameField.sendKeys(name);
    }

    @And("enter surnamez {string}")
    public void enterSurnamez(String surname) {us_15_student_management_page.surnameField.sendKeys(surname);
    }

    @And("enter birth placez {string}")
    public void enterBirthPlacez(String birtPlace) {us_15_student_management_page.birthPlaceField.sendKeys(birtPlace);
    }

    @And("enter emailz {string}")
    public void enterEmailz(String email) {us_15_student_management_page.emailField.sendKeys(email);
    }

    @And("enter phone numberz {string}")
    public void enterPhoneNumberz(String phoneNumber) {us_15_student_management_page.phoneNumberField.sendKeys(phoneNumber);
    }

    @And("select genderz")
    public void selectGenderz() {us_15_student_management_page.genderSelect.click();
    }

    @And("select date of birthz {string}")
    public void selectDateOfBirthz(String dateOfBirth) {us_15_student_management_page.dateOfBirth.sendKeys(dateOfBirth);
    }

    @And("enter ssnz {string}")
    public void enterSsnz(String ssnNumber) {us_15_student_management_page.ssnNumberField.sendKeys(ssnNumber);
    }

    @And("usernamez {string}")
    public void usernamez(String username2) {us_15_student_management_page.usernameField.sendKeys(username2);
    }

    @And("father namez {string}")
    public void fatherNamez(String fathername) {us_15_student_management_page.fatherNameField.sendKeys(fathername);
    }

    @And("mother name {string}")
    public void motherName(String mothername) {us_15_student_management_page.motherNameField.sendKeys(mothername);
    }

    @And("enter passworddd {string}")
    public void enterPassworddd(String password2) {us_15_student_management_page.passwordField.sendKeys(password2);
    }


    @Then("click on submit buttonz")
    public void clickOnSubmitButtonz() {us_15_student_management_page.submitButton.click();
    }
    @Then("verify the student number automatically appear")
    public void verifyTheStudentNumberAutomaticallyAppear() {us_15_student_management_page.savedStudentAlertMessage.isDisplayed();
    }

    //TC
    @Then("verify invalid message shows up")
    public void verifyInvalidMessageShowsUp() {us_15_student_management_page.invalidMessage.isDisplayed();
    }

    //TC_09

    @And("enter ssnsecond {string}")
    public void enterSsnsecond(String ssnsecond) {us_15_student_management_page.ssnNumberField.sendKeys(ssnsecond);
    }

    @Then("verify alert message shows up")
    public void verifyAlertMessageShowsUp() {us_15_student_management_page.ssnAlertMessage.isDisplayed();
    }

    //TC_13
    @And("enter passwordfirst {string}")
    public void enterPasswordfirst(String passwordfirst) {us_15_student_management_page.passwordField.sendKeys(passwordfirst);
    }


    //TC_14
    @And("enter passwordsecond {string}")
    public void enterPasswordsecond(String passwordsecond) {us_15_student_management_page.passwordField.sendKeys(passwordsecond);
    }


}

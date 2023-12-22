package stepdefinitions.US_09_19_sibel;

import io.cucumber.java.en.Given;
import pages.sibel.ManagementSchoolsHomePage;
import pages.sibel.ManagementSchoolsLoginPage;
import utilities.Driver;

public class CommonStepDefs {
    ManagementSchoolsHomePage managementSchoolsHomePage = new ManagementSchoolsHomePage();
    ManagementSchoolsLoginPage managementSchoolsLoginPage = new ManagementSchoolsLoginPage();
    @Given(": User navigates to home page {string}")
    public void user_navigates_to_home_page(String string) {
        Driver.getDriver().get(string);
    }
    @Given("Click on Login Button")
    public void click_on_login_button() {
        managementSchoolsHomePage.login.click();

    }
    @Given("Type UserName {string} and Password {string}")
    public void type_user_name_and_password(String string, String string2) {
       managementSchoolsLoginPage.userName.sendKeys(string);
       managementSchoolsLoginPage.password.sendKeys(string2);

    }
    @Given("Click on the login button")
    public void click_on_the_login_button() {
        managementSchoolsLoginPage.loginButton.click();
    }


}

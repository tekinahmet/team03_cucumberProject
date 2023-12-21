package stepdefinitions.US_02_arife;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.arife.US_02;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;


public class adminSeeUserStepDefs {


    US_02 adminSeeUserPage = new US_02();


    //TC_01

    @Given("Login as admin")
    public void tc01AdminLogin() {

        Driver.getDriver().get(ConfigReader.getProperty("managementOnSchools"));

        adminSeeUserPage.loginOnHomePage.click();

        adminSeeUserPage.userName.sendKeys(ConfigReader.getProperty("adminUserName"));

        adminSeeUserPage.password.sendKeys(ConfigReader.getProperty("adminPassword"));

        adminSeeUserPage.loginButton.click();

    }


    @When("Click on Menu")

    public void click_on_menu() {

        JSUtils.JSclickWithTimeout(adminSeeUserPage.MenuButton);
    }


    @When("Navigate to the guest user list")
    public void navigate_to_the_guest_user_list() {

        adminSeeUserPage.GuestUser.click();
    }


    @Then("Verify admin see guest users in the list")
    public void verify_admin_see_guest_users_in_the_list() {

        Assert.assertNotNull("Name should be seen", adminSeeUserPage.ListUserName);
    }


    @Then("verify admin see the name, phone number, SSN, and username information for each guest user")
    public void verify_arife_see_the_name_phone_number_ssn_and_username_information_for_each_guest_user() {


        Assert.assertNotNull("Name should be seeen", adminSeeUserPage.Name);

        Assert.assertNotNull("Phone number should be seen", adminSeeUserPage.PhoneNumber);

        Assert.assertNotNull("SSN should be seen", adminSeeUserPage.Ssn);

        Assert.assertNotNull("Username should be seen", adminSeeUserPage.ListUserName);
    }

    @Then("logout")
    public void tc01logout() {

        adminSeeUserPage.MenuLogout.click();

        adminSeeUserPage.Logout.click();

        adminSeeUserPage.LogoutYesButton.click();


    }


    // TC_02

    @Given("Login as admin")

    public void tc02AdminLogin() {

        Driver.getDriver().get(ConfigReader.getProperty("managementOnSchools"));

        adminSeeUserPage.loginOnHomePage.click();

        adminSeeUserPage.userName.sendKeys(ConfigReader.getProperty("adminUserName"));

        adminSeeUserPage.password.sendKeys(ConfigReader.getProperty("adminPassword"));

        adminSeeUserPage.loginButton.click();

    }


    @When("Click on Menu")

    public void tc02_click_on_menu() {

        JSUtils.JSclickWithTimeout(adminSeeUserPage.MenuButton);
    }


    @When("Navigate to the guest user list")
    public void tc02_navigate_to_the_guest_user_list() {

        adminSeeUserPage.GuestUser.click();
    }


    @Then("click on delete icon")
    public void click_on_delete_icon() {

        adminSeeUserPage.deleteButton.click();


    }

    @Then("verify the information of the user is deleted")
    public void verify_the_information_of_the_user_is_deleted() {

        Assert.assertTrue(adminSeeUserPage.deleteSuccessful.isDisplayed());

    }


    @Then("logout")
    public void tc02logout() {

        adminSeeUserPage.MenuLogout.click();

        adminSeeUserPage.Logout.click();

        adminSeeUserPage.LogoutYesButton.click();


    }


}



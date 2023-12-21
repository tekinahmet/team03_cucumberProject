package stepdefinitions.US_23_fatma;

import io.cucumber.java.en.Then;
import pages.fatma.Fatma_US_23_ViceDean;
import pages.fatma.Fatma_US_login;

import static org.junit.Assert.assertTrue;

public class US_23 {

    Fatma_US_login fatmaLogin = new Fatma_US_login();
    Fatma_US_23_ViceDean fatmaViceDean = new Fatma_US_23_ViceDean();



    @Then("User clicks on MENU button")
    public void user_enters_the_menu_button() {
        fatmaViceDean.menuButton.click();


    }
    @Then("User clicks on VICE DEAN MANAGEMENT link")
    public void user_enters_the_vice_dean_management_link() {
        fatmaViceDean.viceDean.click();


    }
    @Then("user must see the Vice Dean Management")
    public void user_must_see_the_vice_dean_management() {

       assertTrue(fatmaViceDean.addViceDean.isDisplayed());

    }
    @Then("User must see the Vice Dean Saved message")
    public void user_must_see_the_vice_dean_saved_message() {

        assertTrue(fatmaViceDean.viceDeanSaved.isDisplayed());

    }

    @Then("verify that the user sees a red {string} warning each box")
    public void verify_that_the_user_sees_a_red_warning_each_box(String string) {

        assertTrue(fatmaViceDean.requiredMessage1.isDisplayed());
        assertTrue(fatmaViceDean.requiredMessage2.isDisplayed());
        assertTrue(fatmaViceDean.requiredMessage3.isDisplayed());
        assertTrue(fatmaViceDean.requiredMessage4.isDisplayed());
        assertTrue(fatmaViceDean.requiredMessage5.isDisplayed());
        assertTrue(fatmaViceDean.requiredMessage6.isDisplayed());
        assertTrue(fatmaViceDean.requiredMessage7.isDisplayed());
        assertTrue(fatmaViceDean.requiredMessage8.isDisplayed());


    }

}

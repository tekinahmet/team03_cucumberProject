package stepdefinitions.US_03_behice;

import io.cucumber.java.en.*;
import pages.behice.US_03_ContactPage_Page;
import utilities.Driver;
import utilities.WaitUtils;
import static org.junit.Assert.assertTrue;

public class US_03_ContactPage {
    US_03_ContactPage_Page us_03_contactPage_page = new US_03_ContactPage_Page();

    @Given("user navigates to homepage")
    public void user_Navigates_To_Homepage() {
        Driver.getDriver().get("https://managementonschools.com/");
    }
    @Given("user clicks on contact link")
    public void user_clicks_on_contact_link() {
        us_03_contactPage_page.contactLink.click();
    }
    @And("user enters name {string}")
    public void user_enters_name(String string) {
        WaitUtils.waitFor(2);
        us_03_contactPage_page.name.sendKeys(string);
    }
    @And("user enters valid email address {string}")
    public void user_enters_valid_email_address(String string) {
        us_03_contactPage_page.email.sendKeys(string);
    }
    @And("user enters subject {string}")
    public void user_enters_subject(String string) {
        us_03_contactPage_page.subject.sendKeys(string);
    }
    @And("user enters message {string}")
    public void user_enters_message(String string) {
        us_03_contactPage_page.message.sendKeys(string);
    }
    @Then("user clicks on send message button")
    public void user_clicks_on_send_message_button() {
        WaitUtils.waitFor(2);
        us_03_contactPage_page.sendMessageButton.click();
    }

    //-------------------- TC01 -----------------------
    @Then("verify contact message created successfully confirmation appear")
    public void verify_contact_message_created_successfully_confirmation_appear() {
        WaitUtils.waitForVisibility(us_03_contactPage_page.contactCreatedAlertMessage,5);
        assertTrue(us_03_contactPage_page.contactCreatedAlertMessage.getText().contains("Contact Message Created Successfully"));
    }

    //-------------------- TC02 -----------------------
    @Then("verify the required message is visible")
    public void verify_the_required_message_is_visible() {
        assertTrue(us_03_contactPage_page.requiredTextMessage.isDisplayed());
    }

    //-------------------- TC03 -----------------------
    @Then("verify please enter valid email message will appear")
    public void verify_please_enter_valid_email_message_will_appear() {
        WaitUtils.waitForVisibility(us_03_contactPage_page.invalidEmailAlertMessage,5);
        assertTrue(us_03_contactPage_page.invalidEmailAlertMessage.getText().contains("Please enter valid email"));
    }


}

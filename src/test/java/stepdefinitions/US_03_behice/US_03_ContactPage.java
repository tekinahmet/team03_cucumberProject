//package stepdefinitions.US_03_behice;
//
//import io.cucumber.java.en.*;
//import pages.behice.US_03_ContactPage_Page;
//import utilities.Driver;
//import utilities.WaitUtils;
//
//import static org.junit.Assert.assertTrue;
//
//public class US_03_ContactPage {
//
//    US_03_ContactPage_Page us_03_contactPage_page = new US_03_ContactPage_Page();
//
//    @Given("go to homepage")
//    public void go_to_homepage() {
//        Driver.getDriver().get("https://managementonschools.com/");
//    }
//    @When("click on contact link")
//    public void click_on_contact_link() {
//        us_03_contactPage_page.contactLink.click();
//        WaitUtils.waitFor(1);
//    }
//    @When("enter name {string}")
//    public void enter_name(String string) {
//        WaitUtils.waitFor(2);
//        us_03_contactPage_page.name.sendKeys(string);
//    }
//    @When("enter valid email address {string}")
//    public void user_enters_valid_email_address(String string) {
//        us_03_contactPage_page.email.sendKeys(string);
//    }
//    @When("user enters subject {string}")
//    public void user_enters_subject(String string) {
//        us_03_contactPage_page.subject.sendKeys(string);
//    }
//    @When("user enters message {string}")
//    public void user_enters_message(String string) {
//        us_03_contactPage_page.message.sendKeys(string);
//    }
//    @Given("user clicks on send message button")
//    public void user_clicks_on_send_message_button() {
//        us_03_contactPage_page.sendMessageButton.click();
//        WaitUtils.waitFor(2);
//    }
//
//    //-------------------- TC01 -----------------------
//    @Then("verify contact message created successfully confirmation appear")
//    public void verify_contact_message_created_successfully_confirmation_appear() {
//        WaitUtils.waitForVisibility(us_03_contactPage_page.contactCreatedAlertMessage,5);
//        assertTrue(us_03_contactPage_page.contactCreatedAlertMessage.getText().contains("Contact Message Created Successfully"));
//    }
//    //-------------------- TC02 -----------------------
//    @Then("verify the required message is visible")
//    public void verify_the_required_message_is_visible() {
//        assertTrue(us_03_contactPage_page.requiredTextMessage.isDisplayed());
//    }
//
//}

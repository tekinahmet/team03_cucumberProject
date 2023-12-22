package stepdefinitions.US_09_19_sibel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.sibel.ViceDeanHomePage;
import utilities.Driver;

public class US09StepDefs {
    ViceDeanHomePage viceDeanHomePage = new ViceDeanHomePage();
    @Given(": Click Menu from right top off the page")
    public void click_menu_from_right_top_off_the_page() {
       viceDeanHomePage.menu.click();
    }
    @Given("Click Lesson Management from the Left Menu Bar")
    public void click_lesson_management_from_the_left_menu_bar() {
        viceDeanHomePage.lessonManagement.click();
    }
    @Given("Click Lessons")
    public void click_lessons() {
        viceDeanHomePage.lessonList.click();
    }
    @Then("Check the page if created Lesson names are visible")
    public void check_the_page_if_created_lesson_names_are_visible() {
        Assert.assertTrue(viceDeanHomePage.lessonNameOnSecondRow.isDisplayed());

    }
    @Then("Check the page if created Compulsories are visible")
    public void check_the_page_if_created_compulsories_are_visible() {
        Assert.assertTrue(viceDeanHomePage.compulsorySecondRow.isDisplayed());

    }
    @Then("Check the page if created Credit Scores are visible")
    public void check_the_page_if_created_credit_scores_are_visible() {
        Assert.assertTrue(viceDeanHomePage.creditScore.isDisplayed());

    }
    @Then("close the browser")
    public void close_the_browser() {
        Driver.closeDriver();

    }

    @And("Click from first row Delete Icon from the Lessons list below")
    public void clickFromFirstRowDeleteIconFromTheLessonsListBelow() {
        viceDeanHomePage.viceDeleteButton.click();
    }

    @Then("Check if there is a succession message for the deleted Lesson")
    public void checkIfThereIsASuccessionMessageForTheDeletedLesson() {
      Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Assert Lesson you deleted not on the list anymore")
    public void assertLessonYouDeletedNotOnTheListAnymore() {
        Assert.assertFalse(viceDeanHomePage.lessonNameOnSecondRow.isDisplayed());
    }

    @And("Inspect if there is any update section")
    public void inspectIfThereIsAnyUpdateSection() {
        viceDeanHomePage.updateButton.click();
    }
}

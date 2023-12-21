package stepdefinitions.US_14_melik;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.melik.Melik_AdminPage;
import pages.melik.Melik_DeanPage;
import pages.melik.Melik_TeacherPage;
import utilities.JSUtils;
import utilities.WaitUtils;



import static org.junit.Assert.*;


public class US_14_StepDefinitions {

    Melik_TeacherPage teacherPage = new Melik_TeacherPage();
    Melik_AdminPage adminPage = new Melik_AdminPage();
    Melik_DeanPage deanPage = new Melik_DeanPage();

    String teacherSurname;
    String teacherName;
    String teacherBirthPlace;
    String teacherEmail;

    String teacherPhoneNumber;
    String teacherSsnNumber;


    @When("User clicks the Teacher Management button")
    public void user_clicks_the_teacher_management_button() {

     adminPage.teacherManagement.click();


    }
    @When("Verify that User is on Teacher Management page")
    public void verify_that_user_is_on_teacher_management_page() {

        assertEquals("Add Teacher", teacherPage.teacherText.getText());
    }
    @Then("verify whether the created FelixKeeling as username are visible in the list for user")
    public void verify_whether_the_created_teacher_akmer_as_username_are_visible_in_the_list_for_user() {

        //        System.out.println("teacherPage.verifyTeacherCreated.getText() = " + teacherPage.verifyTeacherCreated.getText());
//       assertEquals("TeacherAkmer",teacherPage.verifyTeacherCreated.getText());
        assertEquals("FelixKeeling",teacherPage.verifyTeacherCreated.getText());
    }
    @Then("User clicks the edit button")
    public void user_clicks_the_edit_button() {

//        System.out.println("teacherPage.editButton.getText() = " + teacherPage.editButton.getText());

        JSUtils.JSclickWithTimeout(teacherPage.editButton);

    }
    @Then("User choose a lesson")
    public void user_choose_a_lesson() {

        WaitUtils.waitFor(2);
        teacherPage.chooseLessons.sendKeys("JAVA", Keys.ENTER);
    }
    @Then("User types the name")
    public void user_types_the_name() {

        teacherName = Faker.instance().name().firstName();
      teacherPage.chooseLessons.sendKeys(Keys.TAB,teacherName);

    }
    @Then("User types the surname")
    public void user_types_the_surname() {

        teacherSurname = Faker.instance().name().lastName();
        teacherPage.chooseLessons.sendKeys(Keys.TAB,Keys.TAB,teacherSurname);

    }
    @Then("User types Birth Place")
    public void user_types_birth_place() {

        teacherBirthPlace = Faker.instance().address().city();
      teacherPage.chooseLessons.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,teacherBirthPlace);
    }
    @Then("User types email into the emailbox")
    public void user_types_email_into_the_emailbox() {

        teacherEmail = Faker.instance().internet().emailAddress();
        teacherPage.chooseLessons.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,teacherEmail);

    }
    @Then("User types the phone number as xxx-xxx-xxxx")
    public void user_types_the_phone_number_as_xxx_xxx_xxxx() {

        teacherPhoneNumber = ""+Faker.instance().number().digits(3)+
                "-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);

        teacherPage.chooseLessons.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,teacherPhoneNumber);

    }
    @Then("User types the Ssn Number as xxx-xx-xxxx")
    public void user_types_the_ssn_number_as_xxx_xx_xxxx() {

        teacherSsnNumber = ""+Faker.instance().number().digits(3)+
                "-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        teacherPage.chooseLessons.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,teacherSsnNumber);
    }
    @Then("User clicks the is advisor teacher")
    public void user_clicks_the_is_advisor_teacher() {

        teacherPage.advisorTeacher.click();
        }

    @Then("User clicks the Female in the gender")
    public void user_clicks_the_female_in_the_gender() {

        if (!deanPage.female.isSelected()){
            deanPage.female.click();
        }
    }
    @Then("User types the Date of Birth")
    public void user_types_the_date_of_birth() {

        deanPage.female.sendKeys(Keys.TAB,"22091996", Keys.TAB);

    }
    @Then("User types the UserName")
    public void user_types_the_user_name() {

    }
    @Then("User types Password {string}")
    public void user_types_password(String Password) {

        teacherPage.passwordforTeacher.sendKeys(Password);
    }
    @Then("verify that Teacher updated Successful")
    public void verify_that_teacher_updated_successful() {

      WaitUtils.waitForVisibility(teacherPage.alertForUpdated,2);
      assertTrue(teacherPage.alertForUpdated.getText().contains("updated"));

    }

    @And("User clicks the Submit button for teacher")
    public void userClicksTheSubmitButtonForTeacher() {

//     teacherPage.passwordforTeacher.sendKeys(Keys.TAB,Keys.ENTER);
     teacherPage.submitButtonForTeacher.sendKeys(Keys.ENTER);
    }
}

package pages.oguzhan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US6_deanPage {
    public US6_deanPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // xpaths for the same steps
    @FindBy(xpath = "//a[@href='/login']"

    )
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement DeanName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement DeanPassword;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButton;


    @FindBy(xpath = "//span[.='Final Project']")
    public WebElement verifyDeanName;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//a[text()='Vice Dean Management']")
    public WebElement viceDeanManagement;

    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header' and text()='Vice Dean Management']")
    public WebElement verifyVDManagementPage;
// common use for all test cases
    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female;

    @FindBy(id = "birthDay")
    public WebElement DateOfBirth;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "ssn")
    public WebElement ssnNumber;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOut;

    @FindBy(xpath = "//button[.='Yes']")
    public WebElement confirmLogOut;

   @FindBy(xpath ="//div[.='Vice dean Saved']")
    public WebElement savedAlert;

   // Type here required alert message
    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement requiredAlert;
    // Type here alert SSN
    @FindBy(xpath = "//div[.='Please enter valid SSN number']")
    public WebElement alertSSN;
    // At least 8 character alert
    @FindBy(xpath = "//div[@class='invalid-feedback' and text()='At least 8 characters']")
    public WebElement charAlert;

    @FindBy(xpath = "//div[@class='invalid-feedback' and text()='One uppercase character']")
    public WebElement upperCaseAlert;

    @FindBy(xpath = "//div[@class='invalid-feedback' and text()='One lowercase character']")
    public WebElement lowerCaseAlert;

    @FindBy(xpath = "//div[@class='invalid-feedback' and text()='One number']")
    public WebElement oneNumber;
}

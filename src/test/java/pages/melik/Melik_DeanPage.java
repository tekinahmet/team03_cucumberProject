package pages.melik;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Melik_DeanPage {


    public Melik_DeanPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Add Dean']")
    public WebElement addDeanText;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement male;

    @FindBy(xpath = "//body//div[contains(@role,'dialog')]//div[contains(@class,'row')]//div[contains(@class,'row')]//div[1]//div[1]//input[1]")
    public WebElement female;

    @FindBy(xpath = "//input[@type='date']")
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

    @FindBy(xpath = "//div[.='Dean Saved']")
    public WebElement alertForDean;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement verifyName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement verifySurname;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement verifyBirthPlace;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement verifyDateOfBirth;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement verifyPhoneNumber;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement verifySsnNumber;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement verifyUserName;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement verifyPassword;

    @FindBy(xpath = "//div[.='Please enter valid SSN number']")
    public WebElement alertForSsn;






}

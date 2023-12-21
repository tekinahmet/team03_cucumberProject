package pages.fatma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Fatma_US_23_ViceDean {
    public Fatma_US_23_ViceDean() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//button[@aria-label='Toggle navigation'])[1]")
    public WebElement menuButton;


    @FindBy(linkText = "Vice Dean Management")
    public WebElement viceDean;


    @FindBy(xpath = "(//h5[@bg='primary'])[1]")
    public WebElement addViceDean;


    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@placeholder='Surname']")
    public WebElement surnameInput;


    @FindBy(xpath = "//input[@placeholder='Birth Place']")
    public WebElement birthPlace;


    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleGender;


    @FindBy(xpath = "//input[@type='date']")
    public WebElement date;

    @FindBy(id ="phoneNumber")
    public WebElement phoneNo;

    @FindBy(id ="ssn")
    public WebElement ssn;

    @FindBy(id ="username")
    public WebElement username;

    @FindBy(id ="password")
    public WebElement password;

    @FindBy(xpath ="//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitButton;


    @FindBy(xpath ="//div[.='Vice Dean Saved']")
    public WebElement viceDeanSaved;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[1]")
    public WebElement requiredMessage1;

    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[2]")
    public WebElement requiredMessage2;

    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[3]")
    public WebElement requiredMessage3;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[4]")
    public WebElement requiredMessage4;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[5]")
    public WebElement requiredMessage5;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[6]")
    public WebElement requiredMessage6; //min 11 char for ssn

    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[7]")
    public WebElement requiredMessage7;


    @FindBy(xpath = "(//div[@class=\"invalid-feedback\"])[8]")
    public WebElement requiredMessage8;



  }

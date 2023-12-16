package pages.ahmet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_17_Teacher_Management_Page {
    public US_17_Teacher_Management_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TC_01
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement login;
    @FindBy(xpath = "//span[.='teacherdonald']")
    public WebElement verifyUsername;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logout;
    @FindBy(xpath = "//button[.='Yes']")
    public WebElement confirmLogout;

    //TC_02

    @FindBy(xpath = "//select[@id='lessonId']")
    public WebElement chooseLesson;

    @FindBy(xpath = "//select[@id='studentId']")
    public WebElement chooseStudent;

    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement educationTerm;

    //TC_03

    @FindBy(xpath = "//input[@id='absentee']")
    public WebElement absentee;

    @FindBy(xpath = "//input[@id='midtermExam']")
    public WebElement midtermExam;
    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement finalExam;

    @FindBy(xpath = "//input[@id='infoNote']")
    public WebElement infoNote;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//span[.='Jmeter']")
    public WebElement verifyLessonName;
    @FindBy(xpath = "//div[.='Please select lesson']")
    public WebElement verifyLesson;
    @FindBy(xpath = "//div[.='Please select student']")
    public WebElement verifyStudent;
    @FindBy(xpath = "//div[.='Please select education term ']")
    public WebElement verifyTerm;

    @FindBy(xpath = "//div[.='Required']")
    public WebElement verifyAbsenteeRequired;
    @FindBy(xpath = "//div[.='Required']")
    public WebElement verifyMidtermExamRequired;
    @FindBy(xpath = "//div[.='Required']")
    public WebElement verifyFinalExamRequired;
    @FindBy(xpath = "//div[.='Required']")
    public WebElement verifyInfoNoteRequired;




}

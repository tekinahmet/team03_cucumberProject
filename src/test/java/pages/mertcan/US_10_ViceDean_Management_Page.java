package pages.mertcan;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class US_10_ViceDean_Management_Page {

    public US_10_ViceDean_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginbutton;

    @FindBy(xpath = "//input[@value='AdminProject13']")
    public WebElement verifyuserName;

    //TC_02
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonmanagement;
    @FindBy(xpath = "//button[.='Lesson Program']")
    public WebElement lessonprogram;
    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement chooselessonbutton;
    //TC_03
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton2;
    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonmanagement2;
    @FindBy(xpath = "(//option[.='Choose Education Term'])[1]")
    public WebElement chooseeducationterm;
    @FindBy(xpath = "//option[.='Choose Day']")
    public WebElement chooseday;
    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement starttime;
    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stoptime;
    @FindBy(xpath ="(//button[.='Submit'])[1]")
    public WebElement submitButtonlesprog;



































}

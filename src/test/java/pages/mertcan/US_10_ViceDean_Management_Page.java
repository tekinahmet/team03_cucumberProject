package pages.mertcan;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.temporal.WeekFields;


public class US_10_ViceDean_Management_Page {

    public US_10_ViceDean_Management_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //TC_01
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginbutton;

    @FindBy(xpath = "//span[.='TonyStark123")
    public WebElement verifyUsername;



    //TC_02
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonmanagament;
    @FindBy(xpath ="//button[.='Lesson Program']")
    public WebElement lessonProgram;
    @FindBy(xpath = "//div[.='Select lesson']")
    public WebElement chooselessonbutton;
    @FindBy(xpath = "//div[.='Java']")
    public WebElement java;

    //TC_03
    @FindBy(xpath = "(//option[.='Choose Education Term'])[2]")
    public WebElement chooseeducationterm;
    @FindBy(xpath = "(//option[.='FALL_SEMESTER'])[1]")
    public WebElement semesterselected;
    @FindBy(xpath = "//option[.='Choose Day']")
    public WebElement chooseday;
    @FindBy(xpath ="//option[.='FRIDAY']")
    public WebElement fridayselected;
    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement starttime;
    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stoptime;
        @FindBy(xpath ="(//button[.='Submit'])[3]")
    public WebElement submitButtonlesprog;



































}

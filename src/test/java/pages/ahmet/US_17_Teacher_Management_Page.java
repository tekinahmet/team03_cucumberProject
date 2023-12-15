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
    @FindBy(xpath = "//span[.='teacherjack']")
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







}

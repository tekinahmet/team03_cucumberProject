package pages.akif;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US11Locators {

    public US11Locators(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@href='/login']" )
    public WebElement loginButton;

    @FindBy(xpath = "//div[text()='Login']" )
    public WebElement loginIcon;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginClick;

    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramTab;

    @FindBy(xpath = "(//thead//th[text()='Lesson'])[1]")
    public WebElement lessonInfo;

    @FindBy(xpath = "(//thead//th[text()='Day'])[1]")
    public WebElement dayInfo;

    @FindBy(xpath = "(//thead//th[text()='Start Time'])[1]")
    public WebElement startTimeInfo;

    @FindBy(xpath = "(//thead//th[text()='Stop Time'])[1]")
    public WebElement stopTime;







}

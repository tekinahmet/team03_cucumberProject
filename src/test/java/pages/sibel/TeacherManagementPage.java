package pages.sibel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {

    public TeacherManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[.='Meet Management']")
    public WebElement meetManagement;

    @FindBy(xpath = "//input[@id='react-select-2-input']")
    public WebElement inputStudent;

//    @FindBy(xpath = "//div[@class=' css-1dyz3mf']")
//    public WebElement multiValue;

    @FindBy(xpath = " //div[@class=' css-19bb58m']")
    public WebElement selectStudent;
    @FindBy(xpath = "//input[@id='date']")
    public WebElement dateInput;
    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement timeInput;
    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTimeInput;
    @FindBy(xpath = "//input[@id='description']")
    public WebElement descriptionInput;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[1]")
    public WebElement studentNameOnTheList;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[2]")
    public WebElement meetingDateOnTheList;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[3]")
    public WebElement startTimeOnTheList;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[4]")
    public WebElement stopTimeOnTheList;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[5]")
    public WebElement descriptionOnTheList;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;
@FindBy(xpath = "//div[.='Meet Saved Successfully']")
    public WebElement successMessage;

    @FindBy(xpath = "//div[.='must be a future date']")
    public WebElement invalidDateMessage;

    @FindBy(xpath = "//div[.='Error: start time must not be greater than or equal to stop time']")
    public WebElement invalidTimeMessage;






}

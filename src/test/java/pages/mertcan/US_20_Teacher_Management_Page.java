package pages.mertcan;

import com.github.dockerjava.api.model.CpuUsageConfig;
import io.cucumber.java.tr.Eğerki;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_20_Teacher_Management_Page {
    public US_20_Teacher_Management_Page(){
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

    @FindBy(xpath = "//span[.='teachermartin")
    public WebElement verifyUsername;

    //TC_02-TC_03

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[.='Meet Management']")
    public WebElement meetmanagement;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[1]")
    public WebElement studentName;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[2]")
    public WebElement meetingDate;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[3]")
    public WebElement startTime;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[4]")
    public WebElement stopTime;
    @FindBy(xpath = "//div[@class='table-responsive']//tr[1]//td[5]")
    public WebElement description;
    @FindBy(xpath = "//button[.='  Edit']")
    public WebElement editButton;
    @FindBy(xpath = "//div[@aria-label='Remove Aa12 Aa12']")
    public WebElement deletestudent;
    @FindBy(xpath = "//div[.='Select Students02']")
    public WebElement selectstudent;
    @FindBy(xpath = "//div[.='Aaaa12 Aaaa12']")
    public WebElement addnewstudent;
    @FindBy(xpath = "(//input[@id='date'])[2]")
    public WebElement dateofmeet;
    @FindBy(xpath = "(//input[@id='startTime'])[2]")
    public WebElement changedstarttime;
    @FindBy(xpath = "(//input[@id='stopTime'])[2]")
    public WebElement changedstoptime;
    @FindBy(xpath = "(//input[@id='description'])[2]")
    public WebElement changedescp;
    @FindBy(xpath = "(//button[.='Submit'])[2]")
    public WebElement changedsubmitb;
    @FindBy(xpath = "(//button[@aria-label='Close'])[3]")
    public WebElement closebutton;





































}

package pages.arife;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_02{


    public US_02(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath= "//a[@class='header_link ms-2']")

    public WebElement loginOnHomePage;


    @FindBy(xpath= "//input[@id='username']")

    public WebElement userName;



    @FindBy(xpath= "//input[@id='password']")

    public WebElement password;


    @FindBy(xpath= "//button[@class='fw-semibold btn btn-primary'] ")

    public WebElement loginButton;



    @FindBy(xpath= "//button[@aria-controls='offcanvasNavbar-expand-false']")

    public WebElement MenuButton;


    @FindBy(xpath= "//*[text()='Guest User']")

    public WebElement GuestUser;


    @FindBy(xpath= "//h5[@bg='primary']")

    public WebElement GuestUserListTitle;


    @FindBy(xpath="//div[@class=\"table-responsive\"]")

    public WebElement GuestUserTable;


    @FindBy(xpath= "//*[text()='Name']")

    public WebElement Name;


    @FindBy(xpath = "//*[text()='Phone Number']")

    public WebElement PhoneNumber;


    @FindBy(xpath= "//*[text()='Ssn']")

    public WebElement Ssn;


    @FindBy(xpath = "//*[text()='User Name']")

    public WebElement ListUserName;



    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")

    public WebElement MenuLogout;



    @FindBy(xpath = "//*[text()='Logout']")

    public WebElement Logout;


    @FindBy(xpath = "//button[@class='btn btn-warning']")

    public WebElement LogoutYesButton;



    @FindBy(xpath = "(//button[@class='btn btn-danger'])[1]")

    public WebElement deleteButton;



    @FindBy(xpath = "//*[@id=\"6\"]/div[1]/div[2]")

    public WebElement deleteSuccessful;





}

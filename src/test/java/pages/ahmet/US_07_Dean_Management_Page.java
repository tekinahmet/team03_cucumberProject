package pages.ahmet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_07_Dean_Management_Page {
    public US_07_Dean_Management_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='jackdoe159']")
    public WebElement verifyUsername;

    //TC_02
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOut;
    @FindBy(xpath = "//button[.='Yes']")
    public WebElement confirmLogOut;
    @FindBy(xpath = "//a[.='Contact Get All']")
    public WebElement verifyContactGetAll;
    @FindBy(xpath = "//a[.='Contact Get All']")
    public WebElement clickContactGetAll;
    @FindBy(xpath = "//h5[.='Contact Message']")
    public WebElement contactMessageHeader;
    @FindBy
    public WebElement deleteButton;
    //TC_03
    @FindBy(xpath = "//th[.='Name']")
    public WebElement verifyName;
    @FindBy(xpath = "//th[.='Email']")
    public WebElement verifyEmail;
    @FindBy(xpath = "//th[.='Date']")
    public WebElement verifyDate;
    @FindBy(xpath = "//th[.='Subject']")
    public WebElement verifySubject;
    @FindBy(xpath = "//th[.='Message']")
    public WebElement verifyMessage;

}

package pages.zeynep;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_05_Dean_Management_Page {

    public US_05_Dean_Management_Page (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButton;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/a[2]")
    public WebElement deanManagement;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[1]")
    public WebElement nameColumn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[2]")
    public WebElement genderColumn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[3]")
    public WebElement phoneNumberColumn;

    @FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[4]" )
    public WebElement ssnColumn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/thead/tr/th[5]")
    public WebElement userNameColumn;

    //TC03
    @FindBy (xpath = "//button[@class='text-dark btn btn-outline-info']")
    public WebElement editButton;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[1]/div/input")
    public WebElement nameField;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[2]/div/input")
    public WebElement surnameField;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[3]/div/input")
    public WebElement birthPlaceField;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[4]/div/div[1]/div/input")
    public WebElement genderOption;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[5]/div/input")
    public WebElement dateOfBirth;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[6]/div/input")
    public WebElement phoneField;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[7]/div/input")
    public WebElement ssnField;

    @FindBy (xpath ="/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[8]/div/input" )
    public WebElement userNameFiled;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[9]/div/input")
    public WebElement passwordField;

    @FindBy (xpath = "/html/body/div[3]/div/div/div[2]/div[2]/button")
    public WebElement submitButton;

    @FindBy(xpath = "//div[.='Dean updated Successful']")
    public WebElement verifyMessagez;




}

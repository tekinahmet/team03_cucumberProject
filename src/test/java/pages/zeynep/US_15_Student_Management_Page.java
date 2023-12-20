package pages.zeynep;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.WatchEvent;

public class US_15_Student_Management_Page {
    public US_15_Student_Management_Page (){
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
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/a[3]")
    public WebElement studentManagement;

    //TC_01

    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[1]/select")
    public WebElement chooseTeacher;
    @FindBy (xpath ="/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[2]/div/input")
    public WebElement nameField;

    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[3]/div/input")
    public  WebElement surnameField;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[1]/div/input")
    public  WebElement birthPlaceField;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[2]/div/input")
    public  WebElement emailField;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[3]/div/input")
    public  WebElement phoneNumberField;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[4]/div/div[1]/div/input")
    public  WebElement genderSelect;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[5]/div/input")
    public  WebElement dateOfBirth;
    @FindBy (xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[1]/div/input")
    public  WebElement ssnNumberField;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[2]/div/input")
    public WebElement usernameField;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[3]/div/input")
    public WebElement fatherNameField;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[4]/div/input")
    public WebElement motherNameField;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[5]/div/input")
    public WebElement passwordField;
    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[6]/div/button")
    public WebElement submitButton;

    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[2]/div/div/form/div[1]/div[2]/div/div")
    public WebElement invalidMessage;

    @FindBy(xpath ="//div[.='Please enter valid SSN number']")
    public WebElement ssnAlertMessage;


    @FindBy(xpath = "//div[.='Student saved Successfully']")
    public WebElement savedStudentAlertMessage;

}

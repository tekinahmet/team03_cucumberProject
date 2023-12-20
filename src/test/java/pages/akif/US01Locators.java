package pages.akif;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01Locators {

public US01Locators(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//a[@href='/register']")
    public WebElement topRegisterButton;

@FindBy(id = "name")
    public WebElement registerName;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div//input[@value='FEMALE']")
    public WebElement genderFemale;

    @FindBy(xpath = "//div//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy(id = "birthDay")
    public WebElement dateOfBirth;

    @FindBy(id = "ssn")
    public WebElement SSN;

    @FindBy(id = "username")
    public WebElement registerUserName;

    @FindBy(id = "password")
    public WebElement registerPassword;

    @FindBy(xpath = "(//div//button[@type='button'])[3]")
    public WebElement bottomRegisterButton;

    @FindBy(xpath = "//div//button[text()='Register']")
    public WebElement registerIcon;

    @FindBy(xpath = "//div[text()='Error: User with username ShadowHeart already register']")
    public WebElement alertUS01;










}

package pages.oguzhan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US16_VD_ManagementPage {
    public US16_VD_ManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']"

    )
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement viceDeanName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement viceDeanPassword;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='HankTheVD']")
    public WebElement verifyViceDeanName;

    //TC_02
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;

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

    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logOut;
    @FindBy(xpath = "//button[.='Yes']")
    public WebElement confirmLogOut;
}

package pages.sibel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManagementSchoolsHomePage {

    public ManagementSchoolsHomePage(){

        PageFactory.initElements(Driver.getDriver(),this); }
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

}

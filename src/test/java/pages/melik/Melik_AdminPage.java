package pages.melik;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Melik_AdminPage {


    public Melik_AdminPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='Menu']")
    public WebElement menuButton;

    @FindBy(partialLinkText = "Dean Management")
    public WebElement deanManagement;

    @FindBy(partialLinkText = "Teacher Management")
    public WebElement teacherManagement;


}

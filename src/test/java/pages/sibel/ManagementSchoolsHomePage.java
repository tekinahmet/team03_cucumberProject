package pages.sibel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManagementSchoolsHomePage {

    public void managementSchoolHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText = "login")
    public WebElement login;

}

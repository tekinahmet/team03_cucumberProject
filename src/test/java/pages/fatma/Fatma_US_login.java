package pages.fatma;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Fatma_US_login {
    public Fatma_US_login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement login;


    @FindBy(id = "username")
    public WebElement userName;


    @FindBy(id = "password")
    public WebElement password;


    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;



}
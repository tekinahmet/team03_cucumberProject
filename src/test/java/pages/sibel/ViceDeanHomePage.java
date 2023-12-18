package pages.sibel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanHomePage {

    public void viceDeanHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonManagement;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonList;

}

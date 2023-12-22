package pages.sibel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanHomePage {

    public ViceDeanHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//a[.='Lesson Management']")
    public WebElement lessonManagement;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonList;

    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//table//tr[2]//td[1]")
    public WebElement lessonNameOnSecondRow;

    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//table//tr[2]//td[2]")
    public WebElement compulsorySecondRow;

    @FindBy(xpath = "//div[@id='controlled-tab-example-tabpane-lessonsList']//table//tr[2]//td[3]")
    public WebElement creditScore;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement viceDeleteButton;
    @FindBy(linkText = "Lesson Deleted")
    public WebElement deletedAlert;
    @FindBy(linkText = "Update")
    public WebElement updateButton;

}

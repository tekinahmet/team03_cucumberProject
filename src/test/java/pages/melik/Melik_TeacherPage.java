package pages.melik;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class Melik_TeacherPage {

    public Melik_TeacherPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h5[.='Add Teacher']")
    public WebElement teacherText;

    @FindBy(xpath = "(//input)[14]")
    public WebElement chooseLessons;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(xpath = "//tbody[@class='table-group-divider']//tr[18]//td[4]")
    public WebElement verifyTeacherCreated;

    @FindBy(xpath = "(//span//button[@type='button'])[18]")
    public WebElement editButton;



    @FindBy(xpath = "//div[.='Teacher updated Successful']")
    public WebElement alertForUpdated;

    @FindBy(xpath = "//*[@class='form-control is-invalid']")
    public WebElement passwordforTeacher;
    
    @FindBy(xpath = "(//*[@class='form-check-input'])[4]")
    public WebElement advisorTeacher;


    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButtonForTeacher;









}

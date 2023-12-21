package pages.arife;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_12 {

    public US_12(){

        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath= "//a[@class='header_link ms-2']")

    public WebElement loginOnHomePage;


    @FindBy(xpath= "//input[@id='username']")

    public WebElement userName;


    @FindBy(xpath= "//input[@id='password']")

    public WebElement password;


    @FindBy(xpath= "//button[@class='fw-semibold btn btn-primary'] ")

    public WebElement loginButton;


    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler']")

    public WebElement ViceDeanMenu;




    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")

    public WebElement LessonProgram;



    @FindBy(xpath= "//input[@id='lessonProgramId']")

    public WebElement ChooseALesson;



    @FindBy(xpath = "//select[@id='teacherId']")

    public WebElement SelectTeacher;





    @FindBy(xpath = "//a[text()='Lesson Management']")

    public WebElement LessonManagement;



    @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-educationTerm\"]/div[2]/div[1]/div/div/form/div/div[5]/div/button")

    public WebElement submitButton;



    @FindBy(xpath = "//div[text()='Lesson added to Teacher']")

    public WebElement LessonAddedTeacher;



    @FindBy(xpath = "//input[@value='1455']")   // java- monday- 10 am

    public WebElement LessonWithSameHour;


    @FindBy(xpath = "//input[@value='1456']")

    public WebElement LessonWithSameHour2;


    @FindBy(xpath = "//div[text()='The given id must not be null!; nested exception is java.lang.IllegalArgumentException: The given id must not be null!']")

    public WebElement lessonCanNotAssigned;



}


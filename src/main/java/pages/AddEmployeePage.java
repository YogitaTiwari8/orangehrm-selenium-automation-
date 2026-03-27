package pages;

import extensions.CustomUIExtension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddEmployeePage {
    //locators of addEmployee form
//    private  By txtFullName=By.id("Name");
//    private By txtAge=By.id("Age");
//    private By txtSalary=By.id("Salary");
//    private By txtDurationWorked=By.id("DurationWorked");
//    private By selectGrade=By.id("Grade");
//    private By txtEmail=By.id("Email");
//    private By btnSubmit=By.className("btn-submit");
    @FindBy(id = "Name")
    WebElement txtFullName;
    @FindBy(id = "Age")
    WebElement txtAge;
    @FindBy(id = "Salary")
    WebElement txtSalary;
    @FindBy(id = "DurationWorked")
    WebElement txtDurationWorked;
    @FindBy(id = "Grade")
    WebElement  selectGrade;
    @FindBy(id = "Email")
    WebElement  txtEmail;
    @FindBy(className = "btn-submit")
    WebElement btnSubmit;
    private WebDriver driver;

    public AddEmployeePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public EmployeeListPage addEmployee(String fullname, String age, String salary, String grade, String email, String durationworked){
        CustomUIExtension.performEnterText(txtFullName,fullname);
        CustomUIExtension.performEnterText(txtAge,age);
        CustomUIExtension.performEnterText(txtSalary,salary);
        CustomUIExtension.performSelectionByVisibleText(selectGrade,grade);
        CustomUIExtension.performEnterText(txtDurationWorked,durationworked);
        CustomUIExtension.performEnterText(txtEmail,email);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(btnSubmit));
        CustomUIExtension.performSubmit(btnSubmit);
        return new EmployeeListPage(driver);
    }
}

package pages;

import extensions.CustomUIExtension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    //private By lnklogin=By.xpath("/html/body/header/nav/div/div/ul[2]/li[2]/a");
    //private By lnkEmployeeList=By.partialLinkText("Employees");
    //locator for login link
    @FindBy(linkText = "Login")
    WebElement lnklogin;
    //locator for employee list
    @FindBy(partialLinkText = "Employees")
    WebElement  lnkEmployeeList;

    @FindBy(className = "btn-link")
    WebElement  lnkLogout;
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage loginClick(){
        CustomUIExtension.performClick(lnklogin);
        return new LoginPage(driver);
    }
    public EmployeeListPage employeeListClick(){
        CustomUIExtension.performClick(lnkEmployeeList);
        return new EmployeeListPage(driver);
    }
    public void logoutClick(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(lnkLogout));
        CustomUIExtension.performClick(lnkLogout);
    }
}

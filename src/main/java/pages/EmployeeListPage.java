package pages;

import extensions.CustomUIExtension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage {
    //locator for create new employee button
//    private  By  btnCreateEmployee= By.partialLinkText("+ New Employee");
    @FindBy(linkText = "+ New Employee")
    WebElement btnCreateEmployee;
    private WebDriver driver;
    public EmployeeListPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public AddEmployeePage clickAddEmployee(){
        CustomUIExtension.performClick(btnCreateEmployee);
        return new AddEmployeePage(driver);
    }

}

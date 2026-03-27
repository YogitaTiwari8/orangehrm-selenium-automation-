package pages;

import extensions.CustomUIExtension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    //locator for login
//    private By txtUserName=By.id("UserName");
    @FindBy(id="UserName")
    WebElement txtUserName;
    //    private By txtPassword=By.id("Password");
    @FindBy(id="Password")
    WebElement txtPassword;
    //    private By btnLogin=By.className("btn-signin");
    @FindBy(className = "btn-signin")
    WebElement btnSignIn;
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this); //important if not written will give null for find by
    }
    public HomePage performLogin(String username,String password){
        CustomUIExtension.performEnterText(txtUserName,username);
        CustomUIExtension.performEnterText(txtPassword,password);
        CustomUIExtension.performClick(btnSignIn);
        return new HomePage(driver);
    }
}

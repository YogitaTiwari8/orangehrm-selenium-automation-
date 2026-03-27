package tests;

import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://eaapp.somee.com/");
        logintest(driver);
        addEmployeeTest(driver);
    }
    public static void logintest(WebDriver driver){
        HomePage homePage=new HomePage(driver);
        var loginpage=homePage.loginClick();
        loginpage.performLogin("admin","password");
    }
    public static void addEmployeeTest(WebDriver driver){
        HomePage homePage=new HomePage(driver);
        var employeeListPage=homePage.employeeListClick();
        var addEmployeePage=employeeListPage.clickAddEmployee();
        addEmployeePage.addEmployee("Nidhi","23","50000","Middle","nidhi@gmail.com","12");
    }

    public static void logout(WebDriver driver){
        HomePage homePage=new HomePage(driver);
    }
}

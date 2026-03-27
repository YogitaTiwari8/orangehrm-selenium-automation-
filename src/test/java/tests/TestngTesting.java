package tests;

import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngTesting {
    private WebDriver driver;
    @BeforeTest
    public void setUp(){
        driver=new ChromeDriver();
        driver.get("http://eaapp.somee.com/");
        driver.manage().window().maximize();
    }

    @Parameters({"UserName","Password"})
    @Test(priority=1)
    public void testLogin(String UserName,String Password){
        HomePage homePage=new HomePage(driver);
        var loginpage=homePage.loginClick();
        loginpage.performLogin(UserName,Password);
    }

    @Test(priority=2)
    public void testAddEmployee(){
        HomePage homePage=new HomePage(driver);
        var employeeListPage=homePage.employeeListClick();
        var addEmployeePage=employeeListPage.clickAddEmployee();
        addEmployeePage.addEmployee("Nid","23","50000","Middle","nidhi234@gmail.com","12");
    }

    @Test(priority=3)
    public void logout(){
        HomePage homePage=new HomePage(driver);
        homePage.logoutClick();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}

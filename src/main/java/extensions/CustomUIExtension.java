package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CustomUIExtension{
    public static void performEnterText(WebElement element, String value){
        element.click();
        element.clear();
        element.sendKeys(value);
    }
    public static void performClick( WebElement element){
        element.click();
    }
    public static void performSelectionByVisibleText(WebElement element,String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public static void performSelectionByIndex(WebElement element,int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public static void performSelectionByValue(WebElement element,String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }
    public static void performSubmit(WebElement element){
        element.submit();
    }
}

package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElement {
    public boolean isElementPresent(WebElement webElement,WebDriver driver){
        WebDriverWait webDriverWait = new WebDriverWait(driver,8);
        try {
            webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}

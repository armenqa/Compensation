package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Proxy;

/**
 * Created by STDev_003 on 4/25/2017.
 */
public class LoginPage {
   protected WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void login(String login, String password){
        loginField.clear();
        passwordField.clear();
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
    }

    @FindBy(xpath = "//input[@id='id_username']")
    protected WebElement loginField;
    @FindBy(xpath = "//input[@id='id_password']")
    protected WebElement passwordField;
    @FindBy(xpath = "//input[@class='btn blockBtn blue']")
    protected WebElement submitButton;

    public void submit(){
        submitButton.click();
       // return new ReceiptPage(driver);
    }

}

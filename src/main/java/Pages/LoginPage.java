package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

/**
 * Created by STDev_003 on 4/25/2017.
 */
public class LoginPage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='id_username']")
    protected WebElement loginField;

    @FindBy(xpath = "//input[@id='id_password']")
    protected WebElement passwordField;

    @FindBy(xpath = "//input[@class='btn blockBtn blue']")
    protected WebElement submitButton;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void login(String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
    }
    public void submit(){
        submitButton.click();
    }

}

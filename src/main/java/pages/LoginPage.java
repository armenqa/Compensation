package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
    protected WebElement submitLoginButton;

    public void submit(){
        submitLoginButton.click();
       // return new ReceiptPage(driver);
    }
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/accounts/login']")).click();
        Thread.sleep(2000);
        login("armen","Password");
        submit();
    }

}

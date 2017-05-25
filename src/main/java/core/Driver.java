package core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Driver {
    public WebDriver driver(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Armen QA/Desktop/Compensation-master/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(options);
        driver.get("http://compensation.codebnb.me");
        return driver;
    }

}

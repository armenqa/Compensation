package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

/**
 * Created by STDev_003 on 4/27/2017.
 */
public class Driver {
    public WebDriver driver(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Armen QA/Desktop/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver =new ChromeDriver(options);
        driver.get("http://compensation.codebnb.me");
        return driver;
    }

}

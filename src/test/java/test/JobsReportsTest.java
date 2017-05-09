package test;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;


public class JobsReportsTest {
    Xpaths xpaths = new Xpaths();
    Driver driver = new Driver();
    WebDriver webdriver;
    LoginPage login;


    @BeforeMethod
    public void before() throws InterruptedException {
        webdriver = driver.driver();
        login = new LoginPage(webdriver);
        login.login();
    }

    @Test()
    public void hoverJobList() throws InterruptedException {
        Thread.sleep(5000);

        Actions action = new Actions(webdriver);
        WebElement we = webdriver.findElement(xpaths.inputJob);
        action.moveToElement(we).click().build().perform();
       // webdriver.findElement(xpaths.inputJob).click();


    }
}
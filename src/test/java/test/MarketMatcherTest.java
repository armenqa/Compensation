package test;
import core.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
    /*
        Preconditions: When we logged in
        Steps
        1: Click on the "Market Matcher" button on main menu
        2: Click on the "Show all items icon"
        3: In list click on the "Engineer" row
        Actual result: Should be shown the Engineers details
        Expected result: We see the Engineers details
    */
public class MarketMatcherTest {
    Xpaths xpaths=new Xpaths();
    Driver driver=new Driver();
    WebDriver webdriver;
    LoginPage login;
    @BeforeMethod
    public void before() throws InterruptedException {
        webdriver=driver.driver();
        login=new LoginPage(webdriver);
        login.login();
    }
    @Test()
    void openMarketMatcher() throws InterruptedException {
        webdriver.findElement(xpaths.marketMatcher).click();
        webdriver.findElement(xpaths.comboBox).click();
        Thread.sleep(3000);
        webdriver.findElement(xpaths.lisecond).click();
        Thread.sleep(3000);
        webdriver.findElement(xpaths.gradeVerify).isDisplayed();
//        webdriver.findElement(xpaths.MarketA).click();
//        webdriver.findElement(xpaths.MarketA).click();
        Thread.sleep(3000);
    }
    @AfterMethod
    private void  closeDriver(){
        webdriver.close();
        webdriver.quit();
    }
}

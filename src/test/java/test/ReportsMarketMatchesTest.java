package test;

import core.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class ReportsMarketMatchesTest {

    Xpaths xpaths = new Xpaths();
    Driver driver = new Driver();
    WebDriver webdriver;
    LoginPage login;

    @BeforeMethod
    public void before() throws InterruptedException {
        webdriver = driver.driver();
        login = new LoginPage(webdriver);
        login.login();
        webdriver.navigate().to("http://compensation.codebnb.me/reports/market_matches/");
    }

    @Test()
    void openMarketMatches() throws InterruptedException {
        Thread.sleep(3000);
        webdriver.findElement(xpaths.filterIcon).click();
        Thread.sleep(2000);
        webdriver.findElement(xpaths.filterIconInput).sendKeys("barigun");
        Thread.sleep(2000);
        webdriver.findElement(xpaths.searchButtonMarket).click();
        Thread.sleep(4000);
        webdriver.findElement(xpaths.verifyMessageMarketMatches).isDisplayed();
        Thread.sleep(2000);

        webdriver.findElement(xpaths.filterIcon).click();
        Thread.sleep(2000);
        webdriver.findElement(xpaths.filterIconInput).clear();
        webdriver.findElement(xpaths.filterIconInput).sendKeys("Technology");
        Thread.sleep(2000);
    }

    @AfterMethod
    private void closeDriver() {
        webdriver.close();
        webdriver.quit();
    }
}


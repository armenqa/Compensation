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
        1: Click on the "Surveys" button on main menu
        2: Click on the first row of the "Survey Data" list
        3: Click on the drop down icon of the "Details"    http://joxi.ru/bmoJ9jecZzKGry
        4: Click on the fourth element of the drop down list of "Details"
        Actual result: Our "Base,TTC,TDC" information should be updated
        Expected result: The informations of "Base,TTC,TDC" are updated
    */
public class SurveysTest {
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
    public void surveys() throws InterruptedException {
        //Click on the "Surveys" button on main menu
        webdriver.findElement(xpaths.surveys).click();
        Thread.sleep(4000);
        //Click on the first row of the "Survey Data" list
        webdriver.findElement(xpaths.surveyData).click();
        Thread.sleep(3000);
        //Click on the drop down icon of the "Details"    http://joxi.ru/bmoJ9jecZzKGry
        webdriver.findElement(xpaths.detailsIcon).click();
        Thread.sleep(3000);
        //Click on the fourth element of the drop down list of "Details"
        webdriver.findElement(xpaths.detailsElement).click();
        //Our "Base,TTC,TDC" information should be updated
    }
    @AfterMethod
    private void  closeDriver(){
        webdriver.close();
        webdriver.quit();
    }


}

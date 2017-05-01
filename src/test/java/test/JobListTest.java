package test;
import core.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import static org.testng.AssertJUnit.assertEquals;
    /*
        Preconditions: When we logged in
        Steps
        1: Click on the "JOB LIST" button on main menu
        2: Verify that we redirected on the page "Job List"
        3: Click on the dropdown item to "Find Job"
        4: Click on the firs "Edit" icon of  list
        Actual result: Should be redirect on the "http://compensation.codebnb.me/jobs/edit/6675/" page
        Expected result: We navigated on the "http://compensation.codebnb.me/jobs/edit/6675/" page
    */
public class JobListTest {
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
    public void jobList() throws InterruptedException {
        //Click on the "JOB LIST" button on main menu
        webdriver.findElement(xpaths.jobList).click();
        Thread.sleep(3000);
        //Verify that we redirected on the page "Job List"
        assertEquals("Genesis Healthcare: Job list", webdriver.findElement(xpaths.verifyJoblist).getText());
        Thread.sleep(3000);
        //Click on the dropdown item to "Find Job"
        webdriver.findElement(xpaths.findJobDropdown).click();
        Thread.sleep(4000);
        //Click on the firs "Edit" icon of  list
        webdriver.findElement(xpaths.firstEdit).click();
        //Should be redirect on the "http://compensation.codebnb.me/jobs/edit/6675/" page
        Thread.sleep(4000);
        //Verify that we redirect on the "http://compensation.codebnb.me/jobs/edit/6675/" page
    }
    @AfterTest
    private void  closeDriver(){
        webdriver.close();
        webdriver.quit();
    }
}

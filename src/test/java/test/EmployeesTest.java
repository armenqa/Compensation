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
		1: Navigate to the Employees page
		2: Click on the "Last name" icon
		3: Click on the input field "Last name icon" and enter the "Tina"
		4: Click on the search icon
		5: Navigate second page of "Employees"
		Actual result: Should be shown all information in the list
		Expected result: We se all information of list
    */
public class EmployeesTest {
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
    public void employees() throws InterruptedException {

        //navigate to the Employees page
        webdriver.findElement(xpaths.employes).click();
        Thread.sleep(4000);
        //click on the "Last name" icon
        webdriver.findElement(xpaths.lastNameIcon).click();
        Thread.sleep(4000);
        //click on the input field "Last name icon" and enter the "Tina"
        webdriver.findElement(xpaths.inpFild).sendKeys("Lewis");
        Thread.sleep(4000);
        //click on the search icon  //should be shown only "Tyna" information in the list
        webdriver.findElement(xpaths.searchbutton).click();
        Thread.sleep(4000);
        //click on the search icon
        webdriver.findElement(xpaths.searchIcon).click();
        Thread.sleep(4000);
        //clear "Tena" in the input field
        webdriver.findElement(xpaths.clearTina).clear();
        //click on the search icon  //should be shown all information in the list
        webdriver.findElement(xpaths.searchbutton).click();
        Thread.sleep(4000);
        //navigate second page of "Employees"
        webdriver.findElement(xpaths.navigateSecond).click();
    }
    @AfterMethod
    private void  closeDriver(){
        webdriver.close();
        webdriver.quit();
    }
}
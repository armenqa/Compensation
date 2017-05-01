package test;
import core.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MyFirstWebDriverTest {
    Xpaths xpaths=new Xpaths();
    Driver driver=new Driver();
    WebDriver webdriver;
    LoginPage loginPage;


    /*
    Steps
    1: Opened "Mozilla Firefox".
    2: Enter "compensation.codebnb.me" in the browser field.
    3: Verifying that we on the "compensation.codebnb.me" page
    4: Click on the button "SIGN IN"
    5: In opened window enter valid "login" and "password"
    Actual result: Should be redirect on the "http://compensation.codebnb.me/" page.
    Expected result: Redirected on the "http://compensation.codebnb.me/" page.
     */
    @BeforeMethod()
    public void  sighninDriver() throws InterruptedException {
        webdriver=driver.driver();
        loginPage = new LoginPage(webdriver);
        loginPage.login();
    }
    @Test(priority=3)
    public void  logTrue() throws InterruptedException {
        assertEquals("LOGOUT",webdriver.findElement(xpaths.logOut).getText());
       // webdriver.findElement(xpaths.logOut).click();
        Thread.sleep(3000);
    }

//    @Test(priority=1)
//    public  void logFalce() throws InterruptedException{
//        webdriver.findElement(xpaths.log).click();
//        Thread.sleep(2000);
//        //shoud be opened "login" and "password" popup window
//        loginPage.login("adasdczxzxcsdfdrrhhddg","345353sfsdf");
//        Thread.sleep(3000);
//        //press submit
//        loginPage.submit();
//        Thread.sleep(4000);
//        //hamozvum enq vor haytnvela errore messege
//        webdriver.findElement(xpaths.errore).isDisplayed();
//        Thread.sleep(3000);
//    }

//    @Test(priority=2)
//    public void  logEmpty() throws InterruptedException {
//       webdriver.findElement(xpaths.log).click();
//        //shoud be opened "login" and "password" popup window
//        Thread.sleep(2000);
//        loginPage.login("","");
//        Thread.sleep(3000);
//        //press submit
//        loginPage.submit();
//        Thread.sleep(4000);
//        //hamozvum enq vor haytnvela errore messege
//        webdriver.findElement(xpaths.errore).isDisplayed();
//        Thread.sleep(3000);
//    }



    /*
        Preconditions: When we logged in
        Steps
            1: Hover on the "Reports" button on main menu
            2: Click on the "Jobs Reports" from the "Reports" dropdown menu
            3: Click on the "Grade" icon and import in input field  30
        Actual result: Should be redirect on the "http://compensation.codebnb.me/reports/jobs-reports/" page
        Expected result: We navigated on the "http://compensation.codebnb.me/reports/jobs-reports/" page

//    @Test()
   public void reports() throws InterruptedException {
        //Navigate on the "job reports page"

//        driver.navigate().to("http://compensation.codebnb.me/reports/jobs-reports/");
        driver.navigate().to("http://compensation.codebnb.me/");
        Thread.sleep(3000);
        //Click on the "Grade icon"
        System.out.print("BEFORE REPORT");
        driver.findElement(xpaths.reports).click();
        driver.findElement(xpaths.jobReports).click();
        Thread.sleep(3000);
        //Click on the "Grade" input field and import 30 on this field
        driver.findElement(xpaths.GradeInput).sendKeys("30" );
        //search
        driver.findElement(xpaths.GradeInputSearch).click();
        Thread.sleep(3000);

//        Actions builder = new Actions(driver);
//        //Hover on the "Reports" button on main menu
//        builder.moveToElement(driver.findElement(xpaths.reports)).perform();
//        Thread.sleep(2000);
//        // Click on the "Jobs Reports" from the "Reports" dropdown menu
//        builder.moveToElement(driver.findElement(xpaths.jobReports)).click();
//        Thread.sleep(2000);
//        //driver.findElement(By.xpath("//button[@class='fadeToggleBtn']")).click();

//		driver.findElement(By.xpath(".//*[@id='employee_table']/div/div[2]/table/thead/tr/th[2]/button")).click();
//		Thread.sleep(10000);
    }

*/



   @AfterTest
   private void  closeDriver(){
      webdriver.close();
       webdriver.quit();
    }

}



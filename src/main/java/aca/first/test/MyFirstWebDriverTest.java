package aca.first.test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

        import org.openqa.selenium.By;

        import org.openqa.selenium.interactions.Actions;

        import org.testng.annotations.AfterTest;

        import org.testng.annotations.Test;

        import org.openqa.selenium.firefox.FirefoxDriver;


        import static org.testng.AssertJUnit.assertEquals;

public class MyFirstWebDriverTest {
    Xpaths xpaths=new Xpaths();
    private WebDriver driver;
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
    @BeforeTest()
    private void  sighninDriver() throws InterruptedException {
        // Opened "Mozilla Firefox"
        driver = new FirefoxDriver();
        // Open http://compensation.codebnb.me/ page
        driver.get("http://compensation.codebnb.me/");
        // Make sure that our site has an element by this xpath    //span[contains(.,'Compensation')]
        assertEquals("COMPENSATION", driver.findElement(By.xpath("//span[contains(.,'Compensation')]")).getText());
        // Make sure that our site has an element by this xpath    //a[@href='/accounts/login']"
        assertEquals("SIGN IN", driver.findElement(By.xpath("//a[@href='/accounts/login']")).getText());
        // Click on the button "SIGN IN"
        driver.findElement(xpaths.login).click();
        //shoud be opened "login" and "password" popup window
        Thread.sleep(2000);
        // sendkey for the input field "username"
        driver.findElement(xpaths.username).sendKeys("armen" );
        // sendkey for the input field "password"
        driver.findElement(xpaths.password).sendKeys("Password" );
        Thread.sleep(3000);
        //press submit
        driver.findElement(xpaths.submit).click();
        Thread.sleep(4000);

    }
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
    @Test()
    public void jobList() throws InterruptedException {
        //Click on the "JOB LIST" button on main menu
        driver.findElement(xpaths.jobList).click();
        Thread.sleep(5000);
        //Verify that we redirected on the page "Job List"
        assertEquals("City of Houston: Job list", driver.findElement(xpaths.verifyJoblist).getText());
        Thread.sleep(4000);
        //Click on the dropdown item to "Find Job"
        driver.findElement(xpaths.findJobDropdown).click();
        Thread.sleep(6000);
        //Click on the firs "Edit" icon of  list
        driver.findElement(xpaths.firstEdit).click();
        //Should be redirect on the "http://compensation.codebnb.me/jobs/edit/6675/" page
        Thread.sleep(5000);
        //Verify that we redirect on the "http://compensation.codebnb.me/jobs/edit/6675/" page

    }

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

    @Test()
    public void employees() throws InterruptedException {

        //navigate to the Employees page
        driver.findElement(xpaths.employes).click();
        Thread.sleep(4000);
        //click on the "Last name" icon
        driver.findElement(xpaths.lastNameIcon).click();
        Thread.sleep(4000);
        //click on the input field "Last name icon" and enter the "Tina"
        driver.findElement(xpaths.inpFild).sendKeys("Tina" );
        Thread.sleep(4000);
        //click on the search icon  //should be shown only "Tyna" information in the list
        driver.findElement(xpaths.searchbutton).click();
        Thread.sleep(4000);
        //click on the search icon
        driver.findElement(xpaths.searchIcon).click();
        Thread.sleep(4000);
        //clear "Tena" in the input field
        driver.findElement(xpaths.clearTina).clear();
        //click on the search icon  //should be shown all information in the list
        driver.findElement(xpaths.searchbutton).click();
        Thread.sleep(4000);
        //navigate second page of "Employees"
        driver.findElement(xpaths.navigateSecond).click();
    }
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
    @Test()
    public void surveys() throws InterruptedException {
        //Click on the "Surveys" button on main menu
        driver.findElement(xpaths.surveys).click();
        Thread.sleep(4000);
        //Click on the first row of the "Survey Data" list
        driver.findElement(xpaths.surveyData).click();
        Thread.sleep(3000);
        //Click on the drop down icon of the "Details"    http://joxi.ru/bmoJ9jecZzKGry
        driver.findElement(xpaths.detailsIcon).click();
        Thread.sleep(3000);
        //Click on the fourth element of the drop down list of "Details"
        driver.findElement(xpaths.detailsElement).click();
        //Our "Base,TTC,TDC" information should be updated
    }

    /*
        Preconditions: When we logged in
        Steps
        1: Click on the "Market Matcher" button on main menu
        2: Click on the "Show all items icon"
        3: In list click on the "Engineer" row

        Actual result: Should be shown the Engineers details
        Expected result: We see the Engineers details
     */
    @Test()
    void openMarketMatcher() throws InterruptedException {

        //driver.findElement(By.xpath("/html/body/div/header/div/div[2]/nav/ul/ul/li[4]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Jobs Reports']")).click();
        Thread.sleep(3000);
    }


    /*
        Preconditions: When we logged in
        Steps
            1: Hover on the "Reports" button on main menu
            2: Click on the "Jobs Reports" from the "Reports" dropdown menu
        Actual result: Should be redirect on the "http://compensation.codebnb.me/reports/jobs-reports/" page
        Expected result: We navigated on the "http://compensation.codebnb.me/reports/jobs-reports/" page
        */
    @Test()
    public void reports() throws InterruptedException {

        Actions builder = new Actions(driver);
        //Hover on the "Reports" button on main menu
        builder.moveToElement(driver.findElement(xpaths.reports)).perform();
        Thread.sleep(2000);
        // Click on the "Jobs Reports" from the "Reports" dropdown menu
        builder.moveToElement(driver.findElement(xpaths.jobReports)).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//button[@class='fadeToggleBtn']")).click();

//		driver.findElement(By.xpath(".//*[@id='employee_table']/div/div[2]/table/thead/tr/th[2]/button")).click();
//		Thread.sleep(10000);
    }





    @AfterTest
    private void  closeDriver(){
        driver.close();
        driver.quit();
    }

}



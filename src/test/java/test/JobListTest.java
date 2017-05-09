package test;
import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.File;
import java.util.Random;

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

    private File getLatestFileFromDir(String dirPath) {
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return null;
        }
        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {
            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
                lastModifiedFile.delete();
            }
        }
        return lastModifiedFile;

    }




    @BeforeMethod
    public void before() throws InterruptedException {
        webdriver=driver.driver();
        login=new LoginPage(webdriver);
        login.login();
    }
    @Test()
    public void jobListSearching() throws InterruptedException {
        //Click on the "JOB LIST" button on main menu
        webdriver.findElement(xpaths.jobList).click();
        Thread.sleep(3000);
        //Verify that we redirected on the page "Job List"
        assertEquals("Genesis Healthcare: Job list", webdriver.findElement(xpaths.verifyJoblist).getText());
        Thread.sleep(3000);
        //Click on the dropdown item to "Find Job"
        webdriver.findElement(xpaths.findJobDropdown).click();
        Thread.sleep(3000);
        //Click on the firs "Edit" icon of  list
        webdriver.findElement(xpaths.firstEdit).click();
        Thread.sleep(3000);
        //Should be redirect on the "http://compensation.codebnb.me/jobs/edit/6675/" page

        webdriver.findElement(xpaths.JobTitles).clear();
        Thread.sleep(1500);
        webdriver.findElement(xpaths.JobTitles).sendKeys("HOSPYTAL");
        Thread.sleep(1500);
        webdriver.findElement(xpaths.JobCode).clear();
        Thread.sleep(1500);
        webdriver.findElement(xpaths.JobCode).sendKeys("40006-55");
        Thread.sleep(1500);
        webdriver.findElement(xpaths.Department).clear();
        Thread.sleep(1500);
        webdriver.findElement(xpaths.Department).sendKeys("Civilian-Police ");
        Thread.sleep(3000);
        webdriver.findElement(xpaths.GradeName).click();
        Thread.sleep(3000);
        webdriver.findElement(By.xpath("//select[@name='grade_name']/option[5]")).click();
        webdriver.findElement(xpaths.SaveEditJob).click();
        Thread.sleep(3000);
        webdriver.findElement(By.xpath("//div[text()='Job Code must be unique']")).isDisplayed();
        //div[text()='job has been saved successfully']
//        webdriver.findElement(xpaths.findJobInput).clear();
//        Thread.sleep(3000);
//        webdriver.findElement(xpaths.findJobInput).sendKeys("40006-55");

        //cancle this page
      //  webdriver.findElement(xpaths.canclePage).click();
        //Verify that we redirect on the "http://compensation.codebnb.me/jobs/edit/6675/" page



    }

        @Test()
        public void jobListLoadPdf() throws InterruptedException {
            webdriver.findElement(xpaths.jobList).click();
            Thread.sleep(3000);
            webdriver.findElement(xpaths.printjob).click();
            Thread.sleep(8000);
            //download pdf file
            File getLatestFile = getLatestFileFromDir("C:/Users/Armen QA/Downloads");
            Thread.sleep(6000);
            String fileName = getLatestFile.getName();
            Thread.sleep(6000);
            Assert.assertTrue(fileName.contains("download"));
        }

        @AfterMethod
        private void  closeDriver(){
            webdriver.close();
            webdriver.quit();
    }
}



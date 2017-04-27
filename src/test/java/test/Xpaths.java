package test;

import org.openqa.selenium.By;


public class Xpaths {
    //reports
    final   By reports = By.xpath("//a[text()='Reports']");
    final  By jobReports = By.xpath("//a[contains(@class,'reportBtn')]");
    final  By jobReportsIcon = By.xpath("//button[@data-target='#id_grade']");
    //marketMatcher

    final   By marketMatcher = By.xpath("//a[text()='Market Matcher']");
    final   By comboBox = By.xpath("//a[@class='custom-combobox-toggle ui-corner-right']");
    final   By liEngineer = By.xpath("//li[text()='Engineer']");
    final   By MarketA = By.xpath("//a[text()='Jobs Reports']");
    final   By GradeInput = By.xpath(".//input[@data-name='grade' and @type='text']");
    final   By GradeInputSearch = By.xpath(".//button[@class='search-filter-job_report' and @data-name='grade']");


    //surveys
    final   By surveys = By.xpath("//a[text()='Surveys']");
    final   By surveyData = By.xpath(".//*[@id='A278 - 2'] ");
    final   By detailsIcon = By.xpath(".//*[@id='survey_types']");
    final   By detailsElement = By.xpath(".//*[@id='survey_types']/option[4]");
    //employees
    final   By employes = By.xpath("//a[text()='Employees']");
    final   By lastNameIcon = By.xpath(".//*[@id='employee_table']/div/div[2]/table/thead/tr/th[2]/button");
    final   By inpFild = By.xpath(".//*[@id='first_name_panel']/div[1]/div[1]/input");
    final   By searchbutton = By.xpath(".//*[@id='first_name_panel']/div[1]/div[1]/button");
    final   By searchIcon = By.xpath(".//*[@id='employee_table']/div/div[2]/table/thead/tr/th[2]/button");
    final   By clearTina = By.xpath(".//*[@id='first_name_panel']/div[1]/div[1]/input");
    final   By navigateSecond = By.xpath(".//html/body/div/div[3]/ul/li[4]/a");
    //jobList
    final   By employees = By.xpath("//a[text()='Employees']");
    final   By jobList = By.xpath("//a[text()='Job List']");
    final   By verifyJoblist = By.xpath("//h6[text()='City of Houston: Job list']");
    final   By findJobDropdown = By.xpath("//a[@data-original-title='Show All Items']");
    final   By firstEdit = By.xpath(".//tbody/tr[1]/td[9]/a");
    //sighnin
    final   By log = By.xpath("//a[@href='/accounts/login']");
    final   By username = By.xpath("//input[@id='id_username']");
    final   By password = By.xpath("//input[@id='id_password']");
    final   By submit = By.xpath("//input[@class='btn blockBtn blue']");
    final   By logOut = By.xpath("//a[@href='/accounts/logout/']");
    final   By errore = By.xpath(".//*[@id='login_form']/ul/li");



}

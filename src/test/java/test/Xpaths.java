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
    final   By lisecond = By.xpath("//ul[@id='ui-id-3']/li[2]");
    final   By gradeVerify = By.xpath("//span[@class='tdElement']");
  //  final   By MarketA = By.xpath("//a[text()='Jobs Reports']");
    final   By GradeInput = By.xpath(".//input[@data-name='grade' and @type='text']");
    final   By GradeInputSearch = By.xpath(".//button[@class='search-filter-job_report' and @data-name='grade']");


    //surveys
    final   By surveys = By.xpath("//a[text()='Surveys']");
    final   By surveyData = By.xpath(".//*[@id='A278 - 2']");
    final   By detailsIcon = By.xpath(".//*[@id='survey_types']");
    final   By detailsElement = By.xpath(".//*[@id='survey_types']/option[4]");
    //employees
    final   By employes = By.xpath("//a[text()='Employees']");
    final   By lastNameIcon = By.xpath(".//*[@id='employee_table']/div/div[2]/table/thead/tr/th[2]/button");
    final   By inpFild = By.xpath(".//*[@id='first_name_panel']/div[1]/div[1]/input");
    final   By searchButton = By.xpath(".//*[@id='first_name_panel']/div[1]/div[1]/button");
    final   By searchIcon = By.xpath(".//*[@id='employee_table']/div/div[2]/table/thead/tr/th[2]/button");
    final   By clearTina = By.xpath("//input[@data-name='last_name' and @type='text']");
    final   By navigateSecond = By.xpath(".//html/body/div/div[3]/ul/li[4]/a");


    //jobList
    final   By employees = By.xpath("//a[text()='Employees']");
    final   By jobList = By.xpath("//a[text()='Job List']");
    final   By verifyJoblist = By.xpath("//h6[text()='Genesis Healthcare: Job list']");
    final   By findJobDropdown = By.xpath("//a[@data-original-title='Show All Items']");
    final   By findJobInput = By.xpath(".//*[@id='search_job']/div/span/input");
    final   By firstEdit = By.xpath(".//tbody/tr[1]/td[9]/a");
    final   By canclePage = By.xpath("//a[@class='btnOutline grey']");
    final   By printjob = By.xpath("//table[@class='tableStyle tableJobs sortable']/tbody/tr[3]/td[7]/button");
    final   By inputJob = By.xpath("//li[@class='hoverOpenBtn'][1]");
    final   By optionGradeName = By.xpath("//select[@name='grade_name']/option[5]");
    final   By popupPrintRadiobutton = By.xpath("//div[@class='modal-body']/form/label[1]/input");
    final   By popupSubmit = By.xpath("//div[@class='modal-footer']/button[@id='print_or_send_email']");

    //JobListEdit
    final   By JobTitles = By.xpath("//input[@id='id_title']");
    final   By JobCode = By.xpath(".//*[@id='id_job_code']");
    final   By Department = By.xpath("//input[@id='id_departament']");
    final   By GradeName = By.xpath("//select[@name='grade_name']");
    final   By JobTitle = By.xpath("//a[text()='Employees']");
    final   By SaveEditJob = By.xpath("//button[@class='btn blue']");

    //sighnin
    final   By log = By.xpath("//a[@href='/accounts/login']");
    final   By username = By.xpath("//input[@id='id_username']");//input[@id='id_username']
    final   By password = By.xpath("//input[@id='id_password']");
    final   By submit = By.xpath("//input[@class='btn blockBtn blue']");
    final   By logOut = By.xpath("//a[@href='/accounts/logout/']");
    final   By errore = By.xpath(".//*[@id='login_form']/ul/li");

    //market Matches
    final   By filterIcon = By.xpath(".//*[@id='market_matches']/div/div[2]/table/thead[1]/tr/th[2]/button");
    final   By filterIconInput = By.xpath(".//*[@id='market_matches']/div/div[2]/table/thead[1]/tr/th[2]/div/div/input");
    final   By searchButtonMarket = By.xpath(".//*[@id='market_matches']/div/div[2]/table/thead[1]/tr/th[2]/div/div/button");
    final   By verifyMessageMarketMatches = By.xpath("//span[@class='help-inline']");

  //button[@class='search-filter-market_matches' and @data-name='survay_brand']

    //@ndhanur
    final   By verifyMessage = By.xpath(".//*[@id='employee_table']/div/div[2]/span");
}

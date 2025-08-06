package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	public JavaUtility jutil=new JavaUtility();
	public static ExtentReports ereport;
	public WebDriverUtility wutil=new WebDriverUtility();
	public FileUtility futil=new FileUtility();
	public ExcelUtility eutil=new ExcelUtility();
	public static ExtentTest test;
	
	@BeforeSuite
	public void reportConfiguration() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/ExtentReport_"+jutil.getSystemTime()+".html");
		ereport=new ExtentReports();
		ereport.attachReporter(spark);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		wutil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(futil.getDataFromProperty("DWSUrl"));
	}
	
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wpage=new WelcomePage(driver);
		wpage.getLoginLink().click();
		
		LoginPage lpage=new LoginPage(driver);
		lpage.getEmailTextField().sendKeys(futil.getDataFromProperty("DWSEmail"));
		lpage.getPasswordTextField().sendKeys(futil.getDataFromProperty("DWSPassword"));
		lpage.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout() {
		HomePage hpage=new HomePage(driver);
		hpage.getLogoutLink().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void reportBackup() {
		ereport.flush();
	}
}

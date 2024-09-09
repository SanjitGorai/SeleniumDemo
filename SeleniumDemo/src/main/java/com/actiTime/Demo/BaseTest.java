package com.actiTime.Demo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import com.actiTime.Demo.WebConstants;



public class BaseTest extends ReportUtils{

	public RemoteWebDriver driver;

	//sajit prasad gorai
	@BeforeSuite
	public void intializationReportConfig() {
		intializedReport();
	}
	@BeforeClass
	public void startReport() {
		createReport(this.getClass().getSimpleName());
	}
	@BeforeMethod
	public void launchWeb() {
		if(WebConstants.browser.contains("chrome")) {
			
			ChromeOptions optiom=new ChromeOptions();
			optiom.addArguments("--headless");
			driver = new ChromeDriver();	
		}
		else if(WebConstants.browser.contains("edge")) {
			
			driver = new EdgeDriver();
		}
		else if(WebConstants.browser.contains("firefox")){
			
			driver = new FirefoxDriver();
		}
		else {
	        throw new IllegalArgumentException("Invalid browser type: " + WebConstants.browser);
	    }

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

	}	

	@AfterMethod
	public void killBrowser() {
		driver.quit();

	}
	@AfterSuite
	public void killReport() {
		report.flush();

	}
	


}

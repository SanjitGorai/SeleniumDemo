package com.actiTime.Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventUtils  {

	RemoteWebDriver driver;
	ReportUtils reportUtils;

	public EventUtils(RemoteWebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void clickOnElement(WebElement ele) {  
		reportUtils=new ReportUtils();
		ele.click();
		reportUtils.logStatus("INFO", "user successfully click on particular element");
	}
	
	public void sendValue(WebElement ele,String element) {
		ele.sendKeys(element);
	}
	public void navigateToUrl(String url) {
		driver.get(url);
	}
	public String getData(String value) throws Exception {
		FileInputStream fs =new FileInputStream("C:\\Users\\SANJIT PRASAD GORAI\\eclipse-workspace\\SeleniumDemo\\credential.properties");
		Properties p = new Properties();
		p.load(fs);
		return p.getProperty(value);
	}
	
	public boolean waitUntillElementIsPresent(WebElement ele,int time) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOf(ele));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void scrollTo(int num) {
		driver.executeScript("window.scrollBy(0,"+num+")");
	}
	
	public void mouseHover(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
}

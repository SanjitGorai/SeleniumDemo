package com.actiTime.Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actiTime.pages.LoginPage;

public class EventUtils  {

	RemoteWebDriver driver;
	ReportUtils reportUtils;

	public EventUtils(RemoteWebDriver driver) {

		this.driver = driver;

	}

	public void clickOnElement(WebElement ele) {  
		reportUtils=new ReportUtils();
		try {
			ele.click();
		} catch (Exception e) {
			try {
				reportUtils.addScreenshot(getScreenShot("unable"));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		reportUtils.logStatus("INFO", "user successfully click on particular element");
	}

	public void sendValue(WebElement ele,String element) {
		ele.sendKeys(element);
	}
	public void navigateToUrl(String url) {
		driver.get(url);
	}
	public String getData(String value) throws Exception {
		FileInputStream fs =new FileInputStream("D:\\SeleniumDemo\\SeleniumDemo\\credential.properties");
		Properties p = new Properties();
		p.load(fs);
		return p.getProperty(value);
	} 

	public boolean waitUntillElementIsPresent(WebElement ele,int i) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(i));
			wait.until(ExpectedConditions.visibilityOf(ele));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void scrollToElement(WebElement ele,int num,int count) {
		EventUtils eventUtils= new EventUtils(driver);
		int scroll=0;
		while(scroll<count) {
			if(eventUtils.waitUntillElementIsPresent(ele, 10)) {
				break;
			}else {
				driver.executeScript("window.scrollBy(0,"+num+")");
				try {
					Thread.sleep(50000);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				scroll++;
			}
		}

	}

	public void mouseHover(WebElement ele) {
		Actions action = new Actions(driver);
		try {
			action.moveToElement(ele).perform();
		} catch (Exception e) {
			action.moveToElement(ele).perform();
		}
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}


	public String random() {
		Random random= new Random();
		int randomnumber =  random.nextInt(10000);
		return String.valueOf(randomnumber);

	}


	public void handleDropDown(String gender) {
		LoginPage loginPage=new LoginPage(driver);
		if(gender.equalsIgnoreCase("male")) {
			clickOnElement(loginPage.male);
		}else {
			clickOnElement(loginPage.female);
		}
	}

	public Set<String> getSessionID() {
		Set<String> session=driver.getWindowHandles();
		return session;
	}

	public void windowHandle(String session) {
		driver.switchTo().window(session);
	}

	public String pageTitle() {
		return driver.getTitle();
	}

	public String text(WebElement ele) {
		return ele.getText(); 
	}

	public void closeWindow() {
		driver.close();
	}

	public void refresh(){
		driver.navigate().refresh();
	}
	public String getDataFromexcel(int i,int j)throws Exception {
		DataFormatter data=new DataFormatter();
		FileInputStream fis=new FileInputStream("D:\\SeleniumDemo\\SeleniumDemo\\Book1.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheetAt = wb.getSheetAt(0);			
		String s = data.formatCellValue(sheetAt.getRow(i).getCell(j));
		return s;
	}
	
public String getScreenShot(String TestName) throws Exception {
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		String fileName=System.getProperty("user.dir")+"/ScreenShots/"+TestName+".png";
		File dest=new File(fileName);
		FileUtils.copyFile(src, dest);
		return fileName;
	}
	
}


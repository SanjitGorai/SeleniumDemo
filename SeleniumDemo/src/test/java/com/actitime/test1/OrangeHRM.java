package com.actitime.test1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actiTime.Demo.BaseTest;
import com.actiTime.Demo.EventUtils;
import com.actiTime.Demo.WebConstants;
import com.actiTime.pages.LoginPage;

public class OrangeHRM extends BaseTest {

	LoginPage loginPage;
	EventUtils eventUtils;

	@Test
	public void UserNameValidationValidation() throws Exception {
		try {
			loginPage = new LoginPage(driver);
			eventUtils = new EventUtils(driver);
			eventUtils.navigateToUrl(WebConstants.OrangeHRM);
			logStatus("INFO", "user successfully navigate to particular url");
			String User=eventUtils.getData("OrangeHRMUserName");
			String Pwd=eventUtils.getData("OrangeHRMPassword");		
			eventUtils.sendValue(loginPage.OrangeUsername, User);
			eventUtils.sendValue(loginPage.OrangePwd, Pwd);
			eventUtils.clickOnElement(loginPage.ClickOnSumbitHRM);
			String text = eventUtils.text(loginPage.PreUser);
			eventUtils.clickOnElement(loginPage.ClickonAdmin);
			eventUtils.clickOnElement(loginPage.ClickonAdd);
			eventUtils.clickOnElement(loginPage.ClickonUserRole);
			eventUtils.clickOnElement(loginPage.ClickonStutas);
			eventUtils.sendValue(loginPage.EnterEmpName, text);
			try {
				if(eventUtils.waitUntillElementIsPresent(loginPage.EnterEmpNameHidden, 40)) {
					eventUtils.mouseHover(loginPage.EnterEmpNameHidden);
					eventUtils.clickOnElement(loginPage.EnterEmpNameHidden);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			eventUtils.clickOnElement(loginPage.ClickonStutas2);
			eventUtils.clickOnElement(loginPage.ClickonEnaled);
			String NewUserName=eventUtils.getData("TypeNewUserName");
			String NewPwd=eventUtils.getData("Typepassword");
			String NewConPwd=eventUtils.getData("typeConPassword");
			String randomNum = eventUtils.random();
			eventUtils.sendValue(loginPage.TypeuserName, NewUserName+randomNum);
			
		//	eventUtils.sendValue(loginPage.TypePwd, "Sg@12345678");
//		    driver.findElement(By.xpath("//label[text()='Password']/../..//input[@class='oxd-input oxd-input--active']"))
//		    .sendKeys("Sg@12345");
		    
			eventUtils.sendValue(loginPage.TypeConfirmPwd, "Sg@1234");
			driver.findElement(By.xpath("//label[text()='Password']/../..//input[@class='oxd-input oxd-input--active']"))
		    .sendKeys("Sg@1234");
			eventUtils.clickOnElement(loginPage.ClickOnSave);
			eventUtils.sendValue(loginPage.SearceUserName,NewUserName+randomNum);
			eventUtils.clickOnElement(loginPage.ClickOnSearchUserName);
			if(eventUtils.waitUntillElementIsPresent(loginPage.ActualUserName, 10)) {
				logStatus("PASS", "User Name is finding Successfully");
			}
			else {
				logStatus("FAIL", "User Name is not finding Successfully");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}


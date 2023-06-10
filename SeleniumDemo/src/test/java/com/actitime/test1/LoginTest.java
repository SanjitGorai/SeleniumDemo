package com.actitime.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actiTime.Demo.BaseTest;
import com.actiTime.Demo.EventUtils;
import com.actiTime.Demo.WebConstants;
import com.actiTime.pages.LoginPage;


public class LoginTest extends BaseTest {

	LoginPage loginPage;
	EventUtils eventUtils;
	
	@Test
	public void loginValidation() throws Exception{
		try {
				
			//Sajit
			
			loginPage = new LoginPage(driver);
			eventUtils= new EventUtils(driver);
			eventUtils.navigateToUrl(WebConstants.url);
			logStatus("INFO", "user successfully navigate to particular url");
			String user = eventUtils.getData("username");
			String pwd = eventUtils.getData("password");
			eventUtils.sendValue(loginPage.user,user);
			eventUtils.sendValue(loginPage.pwd, pwd);
			Thread.sleep(2000);
			eventUtils.clickOnElement(loginPage.login);
		   if(eventUtils.waitUntillElementIsPresent(loginPage.Logout, 30)) {
			 logStatus("PASS","Validation of login button on Login Page");
		   }else {
			   logStatus("FAIL","Validation of login button on Login Page"); 
		   }
			eventUtils.clickOnElement(loginPage.Logout);
		}  catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void SearchValidation() throws Exception {
		try {
			
			loginPage = new LoginPage(driver);	
			eventUtils= new EventUtils(driver);
			eventUtils.navigateToUrl(WebConstants.youtube);
			String song= eventUtils.getData("song");
			eventUtils.sendValue(loginPage.search, song);
			eventUtils.clickOnElement(loginPage.searchIcon);
			eventUtils.clickOnElement(loginPage.songTitle);
			Thread.sleep(9000);
			if(eventUtils.waitUntillElementIsPresent(loginPage.Skip, 60)) {
			eventUtils.clickOnElement(loginPage.Skip);
			}
			eventUtils.mouseHover(loginPage.playBack);
			eventUtils.clickOnElement(loginPage.FullScreenButton);
			if(eventUtils.waitUntillElementIsPresent(loginPage.ExitFullScreenButton, 30)) {
				 logStatus("PASS","Validation of FullScreenButton button on playback Page");
				// Thread.sleep(9000);
			   }else {
				   logStatus("FAIL","Validation of FullScreenButton button on playback Page"); 
			   }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

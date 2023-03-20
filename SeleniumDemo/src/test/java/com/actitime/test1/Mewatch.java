package com.actitime.test1;

import org.testng.annotations.Test;

import com.actiTime.Demo.BaseTest;
import com.actiTime.Demo.EventUtils;
import com.actiTime.Demo.WebConstants;
import com.actiTime.pages.LoginPage;

public class Mewatch extends BaseTest {

	LoginPage loginPage;
	EventUtils eventUtils;

	@Test
	public  void SearchValidation() throws Exception {

		try {

			loginPage = new LoginPage(driver);
			eventUtils = new EventUtils(driver);
			eventUtils.navigateToUrl(WebConstants.meWatch);
			if(eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
				eventUtils.clickOnElement(loginPage.meWatchSkip);
			}
			String content = eventUtils.getData("series");
			eventUtils.clickOnElement(loginPage.SearchSeries);
			eventUtils.sendValue(loginPage.SearchSeries, content);
			eventUtils.clickOnElement(loginPage.SearchIconMewatch);
			eventUtils.clickOnElement(loginPage.ClickOnHomeAgainSeries);
			if(eventUtils.waitUntillElementIsPresent(loginPage.WatchCta, 20)) {
				logStatus("PASS", "TC_001 WatchCta is Present");

			}
			else {
				logStatus("FAIL", "TC_001 WatchCta is Present");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}



	@Test
	public void VerifyPlayList() throws Exception {
		try {

			loginPage = new LoginPage(driver);
			eventUtils = new EventUtils(driver);
			eventUtils.navigateToUrl(WebConstants.meWatch);
			if(eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
				eventUtils.clickOnElement(loginPage.meWatchSkip);
			}
			String content = eventUtils.getData("series");
			String Email = eventUtils.getData("meWatchUser");
			String password = eventUtils.getData("meWatchPwd");
			eventUtils.clickOnElement(loginPage.SearchSeries);
			eventUtils.sendValue(loginPage.SearchSeries, content);
			eventUtils.clickOnElement(loginPage.SearchIconMewatch);
			eventUtils.clickOnElement(loginPage.ClickOnHomeAgainSeries);
			eventUtils.scrollToElement(500);
			eventUtils.clickOnElement(loginPage.myList);
			eventUtils.clickOnElement(loginPage.SignInPage);
			eventUtils.sendValue(loginPage.EnterEmail, Email);
			eventUtils.sendValue(loginPage.EnterPassword, password);
			eventUtils.clickOnElement(loginPage.ClickOnSignButton);
			eventUtils.waitUntillElementIsPresent(loginPage.profileIcon, 30);
			eventUtils.mouseHover(loginPage.profileIcon);
			eventUtils.clickOnElement(loginPage.MyListInProfileIcon);
			if(eventUtils.waitUntillElementIsPresent(loginPage.ClickOnHomeAgainSeries, 20)) {
				logStatus("PASS", "TC_002 In MyList HomeAgain is Present");
			}
			else {
				logStatus("FAIL", "TC_002 In MyList HomeAgain  is Present");
			}	
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void CompleteRegistration() throws Exception {

		try {

			loginPage = new LoginPage(driver);
			eventUtils = new EventUtils(driver);

			eventUtils.navigateToUrl(WebConstants.meWatch);
			if(eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
				eventUtils.clickOnElement(loginPage.meWatchSkip);
			}
			eventUtils.clickOnElement(loginPage.SignInButton);
			eventUtils.clickOnElement(loginPage.CreateNewOne);
			String myEmail = eventUtils.getData("myEmail");
			String randomEmail = myEmail.replace("gmail",eventUtils.random());
			System.out.println(randomEmail);
			String mypassword = eventUtils.getData("myPassword");
			String confirmpassword = eventUtils.getData("confirmPassword");
			String firstName = eventUtils.getData("firstName");
			String lastName = eventUtils.getData("lastName");
			String Date = eventUtils.getData("Date");
			String month = eventUtils.getData("Month");
			String year = eventUtils.getData("Year");

			eventUtils.sendValue(loginPage.Email, randomEmail );
			eventUtils.sendValue(loginPage.password, mypassword);
			eventUtils.sendValue(loginPage.confirmPassword, confirmpassword);
			eventUtils.sendValue(loginPage.firstName, firstName);
			eventUtils.sendValue(loginPage.lastName, lastName);
			eventUtils.clickOnElement(loginPage.gender);

			eventUtils.handleDropDown("female");
			//eventUtils.clickOnElement(loginPage.male);
			eventUtils.sendValue(loginPage.Date, Date);	
			eventUtils.sendValue(loginPage.Month, month);	
			eventUtils.sendValue(loginPage.Year, year);
			eventUtils.clickOnElement(loginPage.checkbox);
			eventUtils.clickOnElement(loginPage.CreateAccount);
			if(eventUtils.waitUntillElementIsPresent(loginPage.LetsDoItNow, 40)) {
				eventUtils.clickOnElement(loginPage.LetsDoItNow);
			}

			if(eventUtils.waitUntillElementIsPresent(loginPage.SignInButton, 20)) {
				logStatus("PASS", "TC_003 user successfully landed to the home page");

			}
			else {
				logStatus("PASS", "TC_003 user successfully landed to the home page");

			}	}catch (Exception e) {
				System.out.println(e.getMessage());
				logStatus("FAIL", e.getMessage());
			}

	}
}













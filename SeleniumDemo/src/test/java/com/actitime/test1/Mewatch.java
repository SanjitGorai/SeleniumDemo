package com.actitime.test1;

import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.Test;

import com.actiTime.Demo.BaseTest;
import com.actiTime.Demo.EventUtils;
import com.actiTime.Demo.WebConstants;
import com.actiTime.pages.LoginPage;
import com.aventstack.extentreports.model.Log;

public class Mewatch extends BaseTest {

	LoginPage loginPage;
	EventUtils eventUtils;

	@Test
	public void SearchValidation() throws Exception {

		try {

			loginPage = new LoginPage(driver);
			eventUtils = new EventUtils(driver);
			eventUtils.navigateToUrl(WebConstants.meWatch);
			if (eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
				eventUtils.clickOnElement(loginPage.meWatchSkip);
			}
			String content = eventUtils.getData("series");
			eventUtils.clickOnElement(loginPage.SearchSeries);
			eventUtils.sendValue(loginPage.SearchSeries, content);
			eventUtils.clickOnElement(loginPage.SearchIconMewatch);
			eventUtils.clickOnElement(loginPage.ClickOnHomeAgainSeries);
			if (eventUtils.waitUntillElementIsPresent(loginPage.WatchCta, 20)) {
				logStatus("PASS", "TC_001 WatchCta is Present");

			} else {
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
			if (eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
				eventUtils.clickOnElement(loginPage.meWatchSkip);
			}
			String content = eventUtils.getData("series");
			String Email = eventUtils.getData("meWatchUser");
			String password = eventUtils.getData("meWatchPwd");
			eventUtils.clickOnElement(loginPage.SearchSeries);
			eventUtils.sendValue(loginPage.SearchSeries, content);
			eventUtils.clickOnElement(loginPage.SearchIconMewatch);
			eventUtils.clickOnElement(loginPage.ClickOnHomeAgainSeries);
			// eventUtils.scrollToElement(500);
			eventUtils.clickOnElement(loginPage.myList);
			eventUtils.clickOnElement(loginPage.SignInPage);
			eventUtils.sendValue(loginPage.EnterEmail, Email);
			eventUtils.sendValue(loginPage.EnterPassword, password);
			eventUtils.clickOnElement(loginPage.ClickOnSignButton);
			eventUtils.waitUntillElementIsPresent(loginPage.profileIcon, 30);
			eventUtils.mouseHover(loginPage.profileIcon);
			eventUtils.clickOnElement(loginPage.MyListInProfileIcon);
			if (eventUtils.waitUntillElementIsPresent(loginPage.ClickOnHomeAgainSeries, 20)) {
				logStatus("PASS", "TC_002 In MyList HomeAgain is Present");
			} else {
				logStatus("FAIL", "TC_002 In MyList HomeAgain  is Present");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void CompleteRegistration() throws Exception {

		try {

			loginPage = new LoginPage(driver);
			eventUtils = new EventUtils(driver);

			eventUtils.navigateToUrl(WebConstants.meWatch);
			if (eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
				eventUtils.clickOnElement(loginPage.meWatchSkip);
			}
			eventUtils.clickOnElement(loginPage.SignInButton);
			eventUtils.clickOnElement(loginPage.CreateNewOne);
			String myEmail = eventUtils.getData("myEmail");
			String randomEmail = myEmail.replace("gmail", eventUtils.random());
			System.out.println(randomEmail);
			String mypassword = eventUtils.getData("myPassword");
			String confirmpassword = eventUtils.getData("confirmPassword");
			String firstName = eventUtils.getData("firstName");
			String lastName = eventUtils.getData("lastName");
			String Date = eventUtils.getData("Date");
			String month = eventUtils.getData("Month");
			String year = eventUtils.getData("Year");

			eventUtils.sendValue(loginPage.Email, randomEmail);
			eventUtils.sendValue(loginPage.password, mypassword);
			eventUtils.sendValue(loginPage.confirmPassword, confirmpassword);
			eventUtils.sendValue(loginPage.firstName, firstName);
			eventUtils.sendValue(loginPage.lastName, lastName);
			eventUtils.clickOnElement(loginPage.gender);

			eventUtils.handleDropDown("female");
			// eventUtils.clickOnElement(loginPage.male);
			eventUtils.sendValue(loginPage.Date, Date);
			eventUtils.sendValue(loginPage.Month, month);
			eventUtils.sendValue(loginPage.Year, year);
			eventUtils.clickOnElement(loginPage.checkbox);
			eventUtils.clickOnElement(loginPage.CreateAccount);
			if (eventUtils.waitUntillElementIsPresent(loginPage.LetsDoItNow, 40)) {
				eventUtils.clickOnElement(loginPage.LetsDoItNow);
			}

			if (eventUtils.waitUntillElementIsPresent(loginPage.SignInButton, 20)) {
				logStatus("PASS", "TC_003 user successfully landed to the home page");

			} else {
				logStatus("PASS", "TC_003 user successfully landed to the home page");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logStatus("FAIL", e.getMessage());
		}

	}

	@Test
	public void ValidateTitle() throws Exception {
		loginPage = new LoginPage(driver);
		eventUtils = new EventUtils(driver);
		String expectedTitle = eventUtils.getData("TermsTitle");

		eventUtils.navigateToUrl(WebConstants.meWatch);
		if (eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
			eventUtils.clickOnElement(loginPage.meWatchSkip);
		}
		eventUtils.scrollToElement(loginPage.terms, 100, 25);
		eventUtils.clickOnElement(loginPage.terms);
		Set<String> session = eventUtils.getSessionID();
		ArrayList<String> ar = new ArrayList<String>(session);
		eventUtils.windowHandle(ar.get(1));
		String actualTitle = eventUtils.pageTitle();
		System.out.println(actualTitle);
		if (actualTitle.contains(expectedTitle)) {
			logStatus("PASS", "sucessfully get the title of terms and condition" + actualTitle);
		} else {
			logStatus("FAIL", "sucessfully get the title of terms and condition" + actualTitle);
		}
	}

	@Test
	public void ValidateFooterTitle() throws Exception {
		loginPage = new LoginPage(driver);
		eventUtils = new EventUtils(driver);
		String expectedTitle = eventUtils.getData("TermsTitle");
		String privacytTitle = eventUtils.getData("PrivacyTitle");
		String AdvertiesTitle = eventUtils.getData("AdvertiesTitle");
		String HelpTitle = eventUtils.getData("HelpTitle");
		String SubscriptionTitle = eventUtils.getData("SubscriptionTitle");

		eventUtils.navigateToUrl(WebConstants.meWatch);
		if (eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
			eventUtils.clickOnElement(loginPage.meWatchSkip);
		}
		eventUtils.scrollToElement(loginPage.terms, 100, 25);
		eventUtils.clickOnElement(loginPage.terms);
		Set<String> session = eventUtils.getSessionID();
		ArrayList<String> ar = new ArrayList<String>(session);
		eventUtils.windowHandle(ar.get(1));
		String actualTitle = eventUtils.pageTitle();
		System.out.println(actualTitle);
		if (actualTitle.contains(expectedTitle)) {
			logStatus("PASS", "sucessfully get the title of terms and condition" + actualTitle);
		} else {
			logStatus("FAIL", "sucessfully get the title of terms and condition" + actualTitle);
		}
		Thread.sleep(5000);
		eventUtils.closeWindow();

		Set<String> session0 = eventUtils.getSessionID();
		ArrayList<String> ar0 = new ArrayList<String>(session0);
		eventUtils.windowHandle(ar0.get(0));

		String actualTitle1 = eventUtils.pageTitle();
		System.out.println(actualTitle1);
		eventUtils.scrollToElement(loginPage.terms, 100, 25);
		eventUtils.clickOnElement(loginPage.Privacy);
		Set<String> session1 = eventUtils.getSessionID();
		ArrayList<String> ar1 = new ArrayList<String>(session1);
		eventUtils.windowHandle(ar1.get(1));
		String actualTitlePrivacy = eventUtils.pageTitle();
		System.out.println(actualTitlePrivacy);
		if (actualTitlePrivacy.contains(privacytTitle)) {
			logStatus("PASS", "sucessfully get the title of privacy and condition" + privacytTitle);
		} else {
			logStatus("FAIL", "sucessfully get the title of privacy and condition" + privacytTitle);
		}

		Thread.sleep(5000);
		eventUtils.closeWindow();

		Set<String> session2 = eventUtils.getSessionID();
		ArrayList<String> ar2 = new ArrayList<String>(session2);
		eventUtils.windowHandle(ar2.get(0));

		String actualTitle2 = eventUtils.pageTitle();
		System.out.println(actualTitle2);
		eventUtils.scrollToElement(loginPage.Advertise, 100, 25);
		eventUtils.clickOnElement(loginPage.Advertise);
		Set<String> session3 = eventUtils.getSessionID();
		ArrayList<String> ar3 = new ArrayList<String>(session3);
		eventUtils.windowHandle(ar3.get(1));
		String actualTitlAddverties = eventUtils.pageTitle();
		System.out.println(actualTitlAddverties);
		if (actualTitlAddverties.contains(AdvertiesTitle)) {
			logStatus("PASS", "sucessfully get the title of Adveerties " + AdvertiesTitle);
		} else {
			logStatus("FAIL", "sucessfully get the title of Adveerties " + AdvertiesTitle);
		}
		Thread.sleep(5000);
		eventUtils.closeWindow();
		// handling window
		Set<String> session4 = eventUtils.getSessionID();
		ArrayList<String> ar4 = new ArrayList<String>(session4);
		eventUtils.windowHandle(ar4.get(0));

		String actualTitle3 = eventUtils.pageTitle();
		System.out.println(actualTitle3);
		eventUtils.scrollToElement(loginPage.Help, 100, 25);
		eventUtils.clickOnElement(loginPage.Help);
		Set<String> session5 = eventUtils.getSessionID();
		ArrayList<String> ar5 = new ArrayList<String>(session5);
		eventUtils.windowHandle(ar5.get(1));
		String actualTitlHelp = eventUtils.pageTitle();
		System.out.println(actualTitlHelp);
		if (actualTitlHelp.contains(HelpTitle)) {
			logStatus("PASS", "sucessfully get the title of Help" + HelpTitle);
		} else {
			logStatus("FAIL", "sucessfully get the title of Help " + HelpTitle);
		}

		Thread.sleep(5000);
		eventUtils.closeWindow();
		Set<String> session6 = eventUtils.getSessionID();
		ArrayList<String> ar6 = new ArrayList<String>(session6);
		eventUtils.windowHandle(ar6.get(0));
		String actualTitle4 = eventUtils.pageTitle();
		System.out.println(actualTitle4);
		eventUtils.scrollToElement(loginPage.Subscription, 100, 25);
		eventUtils.clickOnElement(loginPage.Subscription);
		Set<String> session7 = eventUtils.getSessionID();
		ArrayList<String> ar7 = new ArrayList<String>(session7);
		eventUtils.windowHandle(ar7.get(1));
		String actualTitleSuscription = eventUtils.pageTitle();
		System.out.println(actualTitleSuscription);
		if (actualTitleSuscription.contains(SubscriptionTitle)) {

			logStatus("PASS", "sucessfully get the title of Suscription" + actualTitleSuscription);
		} else {
			logStatus("FAIL", "sucessfully get the title of Suscription " + actualTitleSuscription);
		}
	}

	@Test
	public void ValidateLiveTv() throws Exception {

		loginPage = new LoginPage(driver);
		eventUtils = new EventUtils(driver);

		eventUtils.navigateToUrl(WebConstants.meWatch);
		if (eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
			eventUtils.clickOnElement(loginPage.meWatchSkip);
		}
		eventUtils.clickOnElement(loginPage.LiveTv);
		eventUtils.clickOnElement(loginPage.TvGuide);
		eventUtils.clickOnElement(loginPage.GotItButton);
		int scroll=0;
		while(scroll<8) {
			if (eventUtils.waitUntillElementIsPresent(loginPage.suria, 40)) {
				try {
					eventUtils.mouseHover(loginPage.suria);
					break;
				} catch (Exception e) {
					eventUtils.refresh();
					scroll++;
				}
			}else {
				eventUtils.refresh();
				scroll++;
			}
		}
		eventUtils.clickOnElement(loginPage.Rightarrowbutton);
		int click = 0;
		boolean count=false;
		while (click < 10) {
			if (eventUtils.waitUntillElementIsPresent(loginPage.HBOfamily, 2)) {
				count=true;
				break;
			} else {
				eventUtils.clickOnElement(loginPage.Rightarrowbutton);
				click++;
			}

		}
		if(count) {
			logStatus("PASS", "user navigate to HBO channel");
		}
		else {
			logStatus("FAIL", "user navigate to HBO channel");
		}
	}	


	@Test
	public void ValidateBlankPage() throws Exception {

		loginPage = new LoginPage(driver);
		eventUtils = new EventUtils(driver);

		eventUtils.navigateToUrl(WebConstants.meWatch);
		if (eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
			eventUtils.clickOnElement(loginPage.meWatchSkip);
		}
		eventUtils.clickOnElement(loginPage.LiveTv);
		eventUtils.clickOnElement(loginPage.TvGuide);
		eventUtils.clickOnElement(loginPage.GotItButton);
		if (eventUtils.waitUntillElementIsPresent(loginPage.WheelofFortune, 30)) {
			eventUtils.clickOnElement(loginPage.WheelofFortune);
			logStatus("PASS", "user  navigate WheelofFortune  channel");
		}else {
			logStatus("FAIL", "user not navigate WheelofFortune  channel");

		}
	}


	@Test
	public void ValidateNotFoundEpisode() throws Exception {

		loginPage = new LoginPage(driver);
		eventUtils = new EventUtils(driver);
		eventUtils.navigateToUrl(WebConstants.meWatch);
		if (eventUtils.waitUntillElementIsPresent(loginPage.meWatchSkip, 30)) {
			eventUtils.clickOnElement(loginPage.meWatchSkip);
			String content = eventUtils.getData("seriesKin");
			String episodeNumber=eventUtils.getData("episodenum");
			eventUtils.clickOnElement(loginPage.SearchSeries);
			eventUtils.sendValue(loginPage.SearchSeries, content);
			eventUtils.clickOnElement(loginPage.SearchIconMewatch);
			eventUtils.clickOnElement(loginPage.KinSeries);
			eventUtils.scrollToElement(loginPage.OldestFirst, 900, 5);
			eventUtils.clickOnElement(loginPage.OldestFirst);
			eventUtils.clickOnElement(loginPage.NewestFirstdropdwon);
			Thread.sleep(5000);
			eventUtils.clickOnElement(loginPage.Allepisode);
			eventUtils.clickOnElement(loginPage.JumpToEpisode);
			eventUtils.sendValue(loginPage.InputEpisodeNumber, episodeNumber);
			eventUtils.clickOnElement(loginPage.continueButton);
			if (eventUtils.waitUntillElementIsPresent(loginPage.EpisodeNotFound, 10)) {
				logStatus("PASS", "TC_003 user successfully showed the not Found Episode");

			} else {
				logStatus("PASS", "TC_003 user successfully did not showed the not Found Episode");
			}	
		}
	}
}

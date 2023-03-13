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
}

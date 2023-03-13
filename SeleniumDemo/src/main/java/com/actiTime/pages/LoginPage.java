package com.actiTime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.Demo.BaseTest;

public class LoginPage extends BaseTest{

	@FindBy(xpath="//input[@id='username']")
	public WebElement user;

	@FindBy(xpath="//input[@name='pwd']")
	public WebElement pwd;

	@FindBy(xpath="//div[text()='Login ']")
	public WebElement login;

	@FindBy(xpath="//a[@id='logoutLink']")
	public WebElement Logout;               

	@FindBy(xpath="//input[@id='search']")
	public WebElement search;  


	@FindBy(xpath="(//yt-icon[@class='style-scope ytd-searchbox'])[2]")
	public WebElement searchIcon;  


	@FindBy(xpath="//yt-formatted-string[contains(@aria-label,'Show Me The Thumka (Song) Tu Jhoothi Main Makkaar')]")
	public WebElement songTitle; 


	@FindBy(xpath="//div[text()='Skip Ads']")
	public WebElement Skip; 

	//button[@title='Full screen (f)']


	@FindBy(xpath="//button[@title='Full screen (f)']")
	public WebElement FullScreenButton; 

	@FindBy(xpath="(//button[@class='ytp-fullscreen-button ytp-button'])[1]")
	public WebElement ExitFullScreenButton; 



	@FindBy(xpath="//input[@aria-label='Catalogue Search']")
	public WebElement SearchSeries;


	@FindBy(xpath="//button[@class='header-search__icon']")
	public WebElement SearchIconMewatch;


	@FindBy(xpath="//div[text()='Home Again']")
	public WebElement ClickOnHomeAgainSeries;


	@FindBy(xpath="//span[text()='Watch']")
	public WebElement WatchCta;


	@FindBy(xpath="(//button[@class='ab-message-button'])[1]")
	public WebElement meWatchSkip;


	@FindBy(xpath="(//Video[@class='video-stream html5-main-video'])[1]")
	public WebElement playBack;

	public LoginPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

package com.actiTime.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.Demo.BaseTest;

public class LoginPage extends BaseTest {

	@FindBy(xpath = "//input[@id='username']")
	public WebElement user;

	@FindBy(xpath = "//input[@name='pwd']")
	public WebElement pwd;

	@FindBy(xpath = "//div[text()='Login ']")
	public WebElement login;

	@FindBy(xpath = "//a[@id='logoutLink']")
	public WebElement Logout;

	@FindBy(xpath = "//input[@id='search']")
	public WebElement search;

	@FindBy(xpath = "(//yt-icon[@class='style-scope ytd-searchbox'])[2]")
	public WebElement searchIcon;

	@FindBy(xpath = "//yt-formatted-string[contains(@aria-label,'Show Me The Thumka (Song) Tu Jhoothi Main Makkaar')]")
	public WebElement songTitle;

	@FindBy(xpath = "//div[text()='Skip Ads']")
	public WebElement Skip;

	// button[@title='Full screen (f)']

	@FindBy(xpath = "//button[@title='Full screen (f)']")
	public WebElement FullScreenButton;

	@FindBy(xpath = "(//button[@class='ytp-fullscreen-button ytp-button'])[1]")
	public WebElement ExitFullScreenButton;

	@FindBy(xpath = "//input[@aria-label='Catalogue Search']")
	public WebElement SearchSeries;

	@FindBy(xpath = "//button[@class='header-search__icon']")
	public WebElement SearchIconMewatch;

	@FindBy(xpath = "//div[text()='Home Again']")
	public WebElement ClickOnHomeAgainSeries;

	@FindBy(xpath = "//span[text()='Watch']")
	public WebElement WatchCta;

	@FindBy(xpath = "(//button[@class='ab-message-button'])[1]")
	public WebElement meWatchSkip;

	@FindBy(xpath = "(//Video[@class='video-stream html5-main-video'])[1]")
	public WebElement playBack;

	@FindBy(xpath = "(//button[contains(@class,'cta-toggle-btn dh1-hero__sec-btn')])[1]")
	public WebElement myList;

	@FindBy(xpath = "//a[@title='Home']")
	public WebElement HomePage;

	@FindBy(xpath = "(//button[@type='button'])[14]")
	public WebElement SignInPage;

	@FindBy(xpath = "//input[@type='email']")
	public WebElement EnterEmail;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement EnterPassword;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	public WebElement ClickOnSignButton;

	@FindBy(xpath = "(//span[@class='profile-icon__circle'])[1]")
	public WebElement profileIcon;

	@FindBy(xpath = "(//span[text()='My List'])[1]")
	public WebElement MyListInProfileIcon;

	// (//button[text()='Sign In'])[1]
	@FindBy(xpath = "(//button[text()='Sign In'])[1]")
	public WebElement SignInButton;

	@FindBy(xpath = "//button[text()='Create one now']")
	public WebElement CreateNewOne;

	@FindBy(xpath = "//button[@class='cta-btn cta-btn--dark cta-btn--primary cta-btn--primary-dark truncate']")
	public WebElement GotItButton;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='confirmPassword']")
	public WebElement confirmPassword;

	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement lastName;

	@FindBy(xpath = "(//button[@type='button'])[3]")

	public WebElement gender;

	// div[@class='date-of-birth-input__content']

	@FindBy(xpath = "//div[@class='date-of-birth-input__content']")
	public WebElement DateOfBirth;

	@FindBy(xpath = "(//li[@class='select__item select__item--active select__item--item-position-left'])[1]")
	public WebElement female;

	@FindBy(xpath = "(//li[@class='select__item select__item--active select__item--item-position-left'])[2]")
	public WebElement male;

	@FindBy(xpath = "(//span[@class='checkbox__box'])[4]")
	public WebElement checkbox;

	@FindBy(xpath = "//span[text()='Create Account']")
	public WebElement CreateAccount;

	@FindBy(xpath = "//button[contains(text(),'No, I will do it later')]")
	public WebElement LetsDoItNow;

	@FindBy(xpath = "//input[@name='day']")
	public WebElement Date;

	@FindBy(xpath = "//input[@name='month']")
	public WebElement Month;

	@FindBy(xpath = "//input[@name='year']")
	public WebElement Year;

	@FindBy(xpath = "(//span[@class='profile-icon__circle'])[1]")
	public WebElement ProfileIcon;

	@FindBy(xpath = "(//button[@class='cta-btn cta-btn--dark cta-btn--secondary cta-btn--secondary-dark account-entry__action-btn truncate'])[1]")
	public WebElement ManagemeconnectAccount;

	@FindBy(xpath = "(//button[text()='Sign In'])[1]")
	public WebElement signInHomepage;

	@FindBy(xpath = "(//input[@type='email'])[2]")
	public WebElement entereMail1;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement enterPassword1;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement clickonsignIn2;

	@FindBy(xpath = "(//span[@class='sign-in-form__text'])[3]")
	public WebElement ContiniueWithGoogle;

	@FindBy(xpath = "//input[@type='email']")
	public WebElement EnterMailId;


	@FindBy(xpath = "//input[@type='password']")
	public WebElement EnterPasswordNew;


	@FindBy(xpath = "(//button[@jsname='LgbsSe'])[2]")
	public WebElement NextButton;

	@FindBy(xpath = "//span[contains(text(),'Terms')]")
	public WebElement terms;
	
	@FindBy(xpath = "//span[text()='Privacy Policy']")
	public WebElement Privacy;
	
	@FindBy(xpath = "//span[text()='Advertise']")
	public WebElement Advertise;
	
	@FindBy(xpath = "//span[text()='Help']")
	public WebElement Help;
	
	@FindBy(xpath = "//span[text()='Subscription Plans']")
	public WebElement Subscription;
	
	//Subscription Plans
	//span[text()='Help']
	//span[text()='Advertise']
	
	//span[text()='Privacy Policy']







	public LoginPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

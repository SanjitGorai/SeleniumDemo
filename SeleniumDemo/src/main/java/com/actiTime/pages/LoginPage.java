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

	@FindBy(xpath = "//a[text()='Live TV']")
	public WebElement LiveTv;

	@FindBy(xpath = "//div[@class='scrollable channel-carousel__scrollable']")
	public WebElement suria;

	@FindBy(xpath = "//button[@class='arrow arrow--right arrow--visible']")
	public WebElement Rightarrowbutton;



	@FindBy(xpath = "//div[@class='ed1-img__overlay']")
	public WebElement TvGuide;

	@FindBy(xpath = "(//span[text()='HBO Family'])[2]")
	public WebElement HBOfamily;

	@FindBy(xpath = "//div[@id='1f36da4']")
	public WebElement blank;

	@FindBy(xpath = "//div[@id='1f36da4']//div[text()='Wheel Of Fortune S39 - EP 7599']")
	public WebElement WheelofFortune;
	
	@FindBy(name  = "username")
	public WebElement OrangeUsername;
	
	@FindBy(name  = "password")
	public WebElement OrangePwd;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement ClickOnSumbitHRM;
	
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	public WebElement PreUser;
	
	@FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[1]")
	public WebElement ClickonAdmin;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
	public WebElement ClickonAdd;
	
	@FindBy(xpath = "(//div[text()='-- Select --'])[1]")
	public WebElement ClickonUserRole;
	
	@FindBy(xpath = "(//span[text()='Admin'])[2]")
	public WebElement ClickonStutas;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement EnterEmpName;
	
	@FindBy(xpath = "//div[@class='oxd-autocomplete-dropdown --positon-bottom']")
	public WebElement EnterEmpNameHidden;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	public WebElement ClickonStutas2;
	
	@FindBy(xpath = "//span[text()='Enabled']")
	public WebElement ClickonEnaled;
	
	@FindBy(xpath = "//label[text()='Username']/../..//input[@class='oxd-input oxd-input--active']")
	public WebElement TypeuserName;
	
	@FindBy(xpath = "//label[text()='Password']/../..//input[@class='oxd-input oxd-input--active']")
	public WebElement TypePwd;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	public WebElement ClickOnSave;
	
	
	@FindBy(xpath = "//label[text()='Confirm Password']/../..//input[@class='oxd-input oxd-input--active']")
	public WebElement TypeConfirmPwd;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement SearceUserName;
	
	@FindBy(xpath = "//button[text()=' Search ']")
	public WebElement ClickOnSearchUserName;
	
	@FindBy(xpath = "(//div[@class='oxd-table-cell oxd-padding-cell'])[2]")
	public WebElement ActualUserName;
	
	
	
	

	public LoginPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

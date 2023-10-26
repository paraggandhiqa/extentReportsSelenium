package com.api.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTests {

	WebDriver driver;

	@FindBy(name = "username")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginButton;

	@FindBy(id = "logInPanelHeading")
	WebElement titleText;

	@FindBy(id = "forgotPasswordLink")
	WebElement forgetPasswordLink;

	@FindBy(xpath = "//*[@id='social-icons']/a[1]/img")
	WebElement linkedInIcon;
	
	@FindBy(xpath = "//span//h6")
	WebElement dashBoardTextElement;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String strUserName) {
		System.out.println("I am into strUserName");
		userName.sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {
		System.out.println("I am into strPassword");
		password.sendKeys(strPassword);
	}

	public void clickLogin() {
		loginButton.click();
	}

	public void login(String strUserName, String strPassword) {
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.clickLogin();
	}
	
	public String getDashboardText() {
		return this.dashBoardTextElement.getText();
	}

}

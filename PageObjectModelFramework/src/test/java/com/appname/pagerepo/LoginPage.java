package com.appname.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(id = "username")
	private WebElement usernameTextbox;

	@FindBy(name = "pwd")
	private WebElement passwordTextbox;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Login(String un, String pwd) {
		usernameTextbox.sendKeys(un);
		passwordTextbox.sendKeys(pwd);
		loginButton.click();
	}

}

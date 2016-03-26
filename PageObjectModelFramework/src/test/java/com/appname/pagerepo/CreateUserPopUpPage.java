package com.appname.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPopUpPage {
	
	WebDriver driver;

	@FindBy(id = "userDataLightBox_firstNameField")
	private WebElement firstNameTextbox;

	@FindBy(id = "userDataLightBox_lastNameField")
	private WebElement lastNameTextbox;

	@FindBy(id = "userDataLightBox_usernameField")
	private WebElement userNameTextbox;

	@FindBy(id = "userDataLightBox_emailField")
	private WebElement emailTextbox;

	@FindBy(id = "userDataLightBox_passwordField")
	private WebElement pwdTextbox;

	@FindBy(id = "userDataLightBox_passwordCopyField")
	private WebElement retypePwdTextbox;

	@FindBy(id = "userDataLightBox_commitBtn")
	private WebElement createUserButton;
	
	public CreateUserPopUpPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void createUser(String fn, String ln, String email, String un, String pwd) {
		firstNameTextbox.sendKeys(fn);
		lastNameTextbox.sendKeys(ln);
		emailTextbox.sendKeys(email);
		userNameTextbox.sendKeys(un);
		pwdTextbox.sendKeys(pwd);
		retypePwdTextbox.sendKeys(pwd);
		createUserButton.click();
	}
}

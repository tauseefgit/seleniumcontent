package com.appname.pagerepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimesJobRegPage {
	
	
	WebDriver driver;
	@FindBy(id="emailAdd")
	private WebElement emailTextbox;
	
	@FindBy(id="passwordField")
	private WebElement passwordTextBox;
	
	@FindBy(id="retypePassword")
	private WebElement confirmPasswordTextbox;
	
	@FindBy(id="mobNumber")
	private WebElement mobileNoTextbox;
	
	
	public TimesJobRegPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public TimesJobRegPage enterEmail(String emailId)
	{
		emailTextbox.sendKeys(emailId, Keys.TAB);
		return this;
	}
	public TimesJobRegPage enterPassword(String password)
	{
		passwordTextBox.sendKeys(password, Keys.TAB);
		return this;
	}
	
	public TimesJobRegPage enterConfirmPassword(String password)
	{
		confirmPasswordTextbox.sendKeys(password, Keys.TAB);
		return this;
	}
	
	
}

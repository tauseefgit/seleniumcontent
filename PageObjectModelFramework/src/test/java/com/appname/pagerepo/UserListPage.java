package com.appname.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {

	WebDriver driver;

	@FindBy(id="ext-gen7")
	private WebElement addUserButton;

	public UserListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickAddUser() {
		addUserButton.click();
	}

}

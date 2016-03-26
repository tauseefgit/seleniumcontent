package com.appname.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(xpath = "//div[text()='TIME-TRACK']")
	private WebElement timeTrackTab;

	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement usersTab;

	@FindBy(id = "logoutLink")
	private WebElement logoutLink;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickTimeTrack() {
		timeTrackTab.click();
	}

	public void clickUsers() {
		usersTab.click();
	}

	public void clickLogout() {
		logoutLink.click();
	}
}

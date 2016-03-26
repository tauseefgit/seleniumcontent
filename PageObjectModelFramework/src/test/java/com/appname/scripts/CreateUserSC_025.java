package com.appname.scripts;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appname.pagerepo.CreateUserPopUpPage;
import com.appname.pagerepo.HomePage;
import com.appname.pagerepo.LoginPage;
import com.appname.pagerepo.UserListPage;
import com.appname.testconfig.TestConfiguration;

public class CreateUserSC_025 extends TestConfiguration{
  @Test
  public void createUserTestTC02() {
	  
	  LoginPage l=new LoginPage(driver);
	  l.Login("admin","manager");
	  HomePage hm=new HomePage(driver);
	  hm.clickUsers();
	  UserListPage ul=new UserListPage(driver);
	  ul.clickAddUser();
	  CreateUserPopUpPage user=new CreateUserPopUpPage(driver);
	  user.createUser("Test", "Admin", "test.admin@test.com", "admin123", "admin123");
	  
	  boolean actual=driver.findElement(By.xpath("//span[text()='Admin, Test']")).isDisplayed();
	  Assert.assertTrue(actual);
	  
	  hm.clickLogout();
	  
  }
}

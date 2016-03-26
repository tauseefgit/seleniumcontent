package com.appname.scripts;

import org.testng.annotations.Test;

import com.appname.pagerepo.LoginPage;
import com.appname.testconfig.TestConfiguration;

public class LoginTestSC_001 extends TestConfiguration {
  @Test
  public void loginTestTC_001() {
	  LoginPage l=new LoginPage(driver);
	  l.Login("admin","manager");
	  
  }
  

}

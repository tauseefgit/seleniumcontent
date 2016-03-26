package com.appname.functionaltests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appname.pagerepo.TimesJobRegPage;
import com.appname.testconfig.TestConfiguration;

public class SC_001 extends TestConfiguration{
  @Test
  public void testTC_01() {
	  
	  TimesJobRegPage t=new TimesJobRegPage(driver);
	  t.enterEmail("tauseef.nav.com");
	  String actual=driver.findElement(By.id("availmsg2")).getText();
	  String expected="Please enter a valid email address";
	  Assert.assertEquals(actual, expected);
  }
}

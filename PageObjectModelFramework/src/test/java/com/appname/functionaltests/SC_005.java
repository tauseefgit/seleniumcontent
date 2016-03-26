package com.appname.functionaltests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appname.pagerepo.TimesJobRegPage;
import com.appname.testconfig.TestConfiguration;

public class SC_005 extends TestConfiguration{
  @Test
  public void testTC_024() {
	  TimesJobRegPage t=new TimesJobRegPage(driver);
	  t.enterEmail("resthesh.q@gmail.com").enterPassword("Test@123").enterConfirmPassword("Test12");
	  String actual=driver.findElement(By.id("repassword_error")).getText();
	  String expected="Passwords do not match";
	  Assert.assertEquals(actual, expected);
	  
  }
}

package com.sai.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sai.Pageobjects.Loginpageobjects;

public class LoginTestCase extends BaseClass {
	
	@Test
	public void LoginTest() throws IOException, InterruptedException
	{
		Loginpageobjects lp=new Loginpageobjects(driver);
		lp.setUsername(Username);
		logger.info("username entered");
		Thread.sleep(5000);
		lp.setPassword(password);
		logger.info("password entered");
		Thread.sleep(5000);
		lp.setLogin();
		logger.info("loginclicked");
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Welcome To Manager's Page of Guru99 Bank###"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			getScreencapture(driver, "LoginTest");
			Assert.assertTrue(false);
		}
	}

}

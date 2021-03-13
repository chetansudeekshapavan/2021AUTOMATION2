package com.sai.Testcases;

import org.testng.annotations.Test;

import com.sai.Pageobjects.Loginpageobjects;
import com.sai.Pageobjects.Registrationpageobjects;

public class RegistrationTestCase extends BaseClass{
	
	@Test
	public void Registration() throws InterruptedException
	{
		Loginpageobjects lp=new Loginpageobjects(driver);
		lp.setUsername(Username);
		logger.info("username entered");
		Thread.sleep(5000);
		lp.setPassword(password);
		logger.info("password entered");
		Thread.sleep(5000);
		lp.setLogin();
		Thread.sleep(5000);
		Registrationpageobjects rp=new Registrationpageobjects(driver);
		rp.setNewcust();
		Thread.sleep(5000);
		rp.setCustname("pavansaisudeeksha");
		Thread.sleep(5000);
		rp.setdobday("24");
		rp.setdobmon("08");
		rp.setdobyear("1986");
		Thread.sleep(5000);
		rp.setaddr("db1406");
		rp.setcity("chandanager");
		rp.setstat("Telengana");
		Thread.sleep(5000);
		rp.setpin("522647");
		rp.setcustmob("8328610590");
		Thread.sleep(5000);
		rp.setemail(getRandomemail()+"@gmail.com");
		Thread.sleep(5000);
		rp.setpwd("sudeeksha");
		Thread.sleep(5000);
		rp.setsub();
		
	}

}

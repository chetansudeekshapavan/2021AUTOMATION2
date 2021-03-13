package com.sai.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobjects {
	
	public WebDriver ldriver;
	
	public Loginpageobjects(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.NAME,using="uid")
	WebElement username;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	@FindBy(how=How.XPATH,using="//body[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")
	WebElement loginclick;
	@FindBy(how=How.XPATH,using="//body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	WebElement custlogout;
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void setLogin()
	{
		loginclick.click();
	}
	
	public void setLogout()
	{
		custlogout.click();
	}

}

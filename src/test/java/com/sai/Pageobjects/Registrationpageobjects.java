package com.sai.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registrationpageobjects {
	
	public WebDriver driver;
	public Registrationpageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
	WebElement newcustmer;
	@FindBy(how=How.NAME,using="name")
	WebElement custname;
	@FindBy(how=How.NAME,using="dob")
	WebElement custdob;
	@FindBy(how=How.NAME,using="addr")
	WebElement custaddr;
	@FindBy(how=How.NAME,using="city")
	WebElement custcity;
	@FindBy(how=How.NAME,using="state")
	WebElement custstat;
	@FindBy(how=How.NAME,using="pinno")
	WebElement custpin;
	@FindBy(how=How.NAME,using="telephoneno")
	WebElement custmno;
	@FindBy(how=How.NAME,using="emailid")
	WebElement custemail;
	@FindBy(how=How.NAME,using="password")
	WebElement custpassword;
	@FindBy(how=How.NAME,using="sub")
	WebElement custsub;
	
	public void setNewcust()
	{
		newcustmer.click();
	}
	public void setCustname(String cusname)
	{
		custname.sendKeys(cusname);
	}
	public void setdobday(String day)
	{
		custdob.sendKeys(day);
	}
	public void setdobmon(String mon)
	{
		custdob.sendKeys(mon);
	}
	public void setdobyear(String year)
	{
		custdob.sendKeys(year);
	}
	public void setaddr(String cusaddr)
	{
		custaddr.sendKeys(cusaddr);
	}
	public void setcity(String cuscity)
	{
		custcity.sendKeys(cuscity);
	}
	public void setstat(String cusstate)
	{
		custstat.sendKeys(cusstate);
	}
	public void setpin(String cuspin)
	{
		custpin.sendKeys(cuspin);
	}
	public void setcustmob(String custmob)
	{
		custmno.sendKeys(custmob);
	}
	public void setemail(String custemil)
	{
		custemail.sendKeys(custemil);
	}
	public void setpwd(String custpwd)
	{
		custpassword.sendKeys(custpwd);
	}
	public void setsub()
	{
		custsub.click();
	}
	

}

package com.sai.Testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sai.Pageobjects.Loginpageobjects;
import com.sai.Testutilities.XLUtils;

public class Login_DDT extends BaseClass {
	
	@Test(dataProvider="LoginTest")
	public void LoginddtTest(String sai,String sudeeksha) throws InterruptedException
	{
		Loginpageobjects lp=new Loginpageobjects(driver);
		lp.setUsername(sai);
		lp.setPassword(sudeeksha);
		lp.setLogin();
		if(getSwitch()==true)
		{
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
			lp.setLogout();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
			
			}
		
		
	}
	
	
	public boolean  getSwitch()
	{
		try
		{
		driver.switchTo().alert().accept();
		return true;
		}catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
	@DataProvider(name="LoginTest")
	public String [][] getData() throws IOException
	{
		String path="/2021AUTOMATION2/src/test/java/com/sai/Testdata/LoginDataTest.xlsx";
		
		int rowcount=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1", 1);
		String logindata [][]=new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata [i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j);
			}
		}
		return logindata;
	}

}

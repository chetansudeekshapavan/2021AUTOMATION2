package com.sai.Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sai.Testutilities.ReadConfig;

public class BaseClass {
	
	ReadConfig rc=new ReadConfig();
	
	public static WebDriver driver;
	
	public  String baseURL=rc.getUrl();
	public  String Username=rc.getUsername();
	public  String password=rc.getPassword();
	
	public static Logger logger;
	
	
	@BeforeClass
	public void First() throws InterruptedException
	{
		logger=Logger.getLogger("/2021AUTOMATION2/log4j.properties");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver",rc.getChropath());
		driver=new ChromeDriver();
		driver.get(baseURL);
		logger.info("url entered");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
	
	public void getScreencapture(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tar=new File(System.getProperty("user.dir")+ "/Screenshots/" +tname+ ".png");
		FileUtils.copyFile(src, tar);
	}
	
	
	public static String getRandomemail()
	{
		String ranemail=RandomStringUtils.randomAlphanumeric(8);
		return ranemail;
	}

}

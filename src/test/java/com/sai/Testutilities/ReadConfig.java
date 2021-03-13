package com.sai.Testutilities;

import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig()
	{
		String path="/2021AUTOMATION2/Properties/Config.Properties";
		try {
			FileInputStream fis=new FileInputStream(path);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	public String getUrl()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
		String username=pro.getProperty("Username");
		return username;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	
	public String getChropath()
	{
		String chropath=pro.getProperty("Chropath");
		return chropath;
	}

}

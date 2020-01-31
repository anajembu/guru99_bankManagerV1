package com.guru99_bankManager.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	public ReadConfig()
	{
		File src = new File("./configuration/config.properties");

		try {
			FileInputStream fileInputStream = new FileInputStream(src);
			properties = new Properties();
			properties.load(fileInputStream);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=properties.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
	String username=properties.getProperty("username");
	return username;
	}
	
	public String getPassword()
	{
	String password=properties.getProperty("password");
	return password;
	}
	
	public String getChromePath()
	{
	String chromepath=properties.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=properties.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=properties.getProperty("firefoxpath");
	return firefoxpath;
	}

	
}





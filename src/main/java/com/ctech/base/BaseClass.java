package com.ctech.base;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ctech.factory.BrowserFactory;

public class BaseClass 
{
	public WebDriver driver ;
	
	@BeforeClass
	
	public void setupApplication()
	{
	driver = BrowserFactory.choseBrowser("firefox", "https://freelance-learn-automation.vercel.app/login");
	System.out.println("before calss was Executed");
	}

	@AfterClass
	public void teardownApplication()
	{
		driver.quit();
		System.out.println("AFter Class Was executed");
	}
}

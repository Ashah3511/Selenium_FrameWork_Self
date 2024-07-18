package com.ctect.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.ctech.base.BaseClass;

public class login_test_01  extends BaseClass
{
	
	@Test
	public  void login()
	{
		driver.findElement(By.name("email1")).sendKeys("admin@email.com");
		driver.findElement(By.name("password1")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@class=\"submit-btn\"]")).click();
		System.out.println("Last line of Excel");
	
	}

}

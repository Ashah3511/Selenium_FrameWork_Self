package com.ctech.factory;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver driver;
	
	public static WebDriver choseBrowser(String browserName,String  appurl)
	{
		
		
		if(browserName.equalsIgnoreCase("chrome")|| browserName.equalsIgnoreCase("google Chrome")||browserName.equalsIgnoreCase("CHROME"))
		{
			driver = new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("firefox")|| browserName.equalsIgnoreCase("FIRE FOX")||browserName.equalsIgnoreCase("fx")) 
		{
			driver = new FirefoxDriver();
			
		}
		else if (browserName.equalsIgnoreCase("MicrosoftEdge")|| browserName.equalsIgnoreCase("edge")||browserName.equalsIgnoreCase("me")) 
		{
			driver= new EdgeDriver();
		}
				
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(appurl);		
		return driver;
	}

}

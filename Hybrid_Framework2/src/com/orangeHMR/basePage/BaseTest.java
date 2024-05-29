package com.orangeHMR.basePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangeHMR.PageObject.HomePage;
import com.orangeHMR.PageObject.LoginPage;
import com.orangeHMR.PageObject.LogoutPage;

public class BaseTest implements Application_Constants 
{
	public WebDriver driver;
	 LoginPage lp;
	Properties pro;
	FileInputStream fis;
	LogoutPage lg;
	public HomePage HP;
	@BeforeClass
	public void Basic() throws IOException
	{
		 
		  pro= new Properties();
		 fis= new FileInputStream("./Property/ApplicationData.properties");
		 pro.load(fis);
		 System.setProperty(chrome_key, chrome_value);
			driver= new ChromeDriver();
			driver.get(pro.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);			 
			HP = new HomePage(driver);
			    
		
	}
	@BeforeMethod
	public void Login()
	{
		lp =new LoginPage(driver);
		 lp.EnterUsn().sendKeys(pro.getProperty("usn1"));
		 lp.EnterPsw().sendKeys(pro.getProperty("psw1"));
		 lp.Clicklgn().click();  
		
		
		 
	}
	@AfterMethod
	public void logout(ITestResult result) 
	{
		if(result.FAILURE==result.getStatus())
		{
			CaptureDefect.Defect(driver,result.getName());
		}
		 lg=new LogoutPage(driver);
		 lg.Clklogo().click();
		 lg.Clklog().click();
		
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}

	
}

package com.orangeHMR.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage 
{
	@FindBy(xpath="//img[@alt='profile picture' and @class='oxd-userdropdown-img']")
	private WebElement lolo;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public LogoutPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement Clklogo()
	{
		return lolo;
	}
	public WebElement Clklog()
	{
		return logout;
	}
}

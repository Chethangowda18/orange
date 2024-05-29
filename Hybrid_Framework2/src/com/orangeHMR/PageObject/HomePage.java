package com.orangeHMR.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="(//a[@class='oxd-main-menu-item'])[2]")
	private WebElement pim;
	
	@FindBy(xpath="(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")
	private WebElement add;
	
	@FindBy(name="firstName")
	private WebElement fn;
	
	@FindBy(name="middleName")
	private WebElement mn;
	
	@FindBy(name="lastName")
	private WebElement ln;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save;

	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public WebElement Clkpim()
	{
		return pim;
	}
	public WebElement Clkadd()
	{
		return add;
	}
	public WebElement Clkfn()
	{
		return fn;
	}public WebElement Clkmn()
	{
		return mn;
	}public WebElement Clkln()
	{
		return ln;
	}
	public WebElement Clksave()
	{
		return save;
	}

}

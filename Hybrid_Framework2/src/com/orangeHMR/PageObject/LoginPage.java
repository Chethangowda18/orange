package com.orangeHMR.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name="username")
	private WebElement usn;
	
	@FindBy(name="password")
	private WebElement psw;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement lgn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement EnterUsn()
	{
		
		return usn;
	}
	public WebElement EnterPsw()
	{
		
		return psw;
	}
	public WebElement Clicklgn()
	{
		
		return lgn;
	}

}

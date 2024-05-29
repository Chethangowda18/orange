package com.orangeHMR.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHMR.basePage.BaseTest;
import com.orangeHMR.basePage.ReadExcel;

public class TestCase1 extends BaseTest
{

	@Test
	public void Testcase01() throws IOException
	{
		
		HP.Clkpim().click();
		HP.Clkadd().click();
		HP.Clkfn().sendKeys(ReadExcel.ReadData("Sheet1", 1, 0));
		HP.Clkmn().sendKeys(ReadExcel.ReadData("Sheet1", 1, 1));
		HP.Clkln().sendKeys(ReadExcel.ReadData("Sheet1", 1,2));
		HP.Clksave().click();
		Assert.fail();
	}

}

package com.orangeHMR.basePage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements Application_Constants 
{
	public static String ReadData(String Sheet,int row, int cell) throws IOException
	{
		FileInputStream fis = new FileInputStream(Excel_value) ;
		Workbook book = WorkbookFactory.create(fis);
		Cell cel = book.getSheet(Sheet).getRow(row).getCell(cell);
		String value = cel.getStringCellValue().toString();
		return value;
	}
	

}

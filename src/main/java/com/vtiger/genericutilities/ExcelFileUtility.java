package com.vtiger.genericutilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
public String readDataFromExcel(String SheetName,int rowNum,int cellNum) throws Throwable
{
	FileInputStream fise=new FileInputStream(Iconstatutility.excelfilepath);
	Workbook wb=WorkbookFactory.create(fise);
	return wb.getSheet(SheetName).getRow(0).getCell(0).getStringCellValue();
}
}

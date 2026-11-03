package com.demowebshop.generic_utilities;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

	public class ExcleUtility {
		public String readDataFromSpecificCell(String sheetName,int rowNum, int cellNum) throws FileNotFoundException, IOException{
			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(FrameWorkConstants.excelFilepath));
			String celldata = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
			workbook.close();
			return celldata;
			
			@DataProvider(name="RegisterDetails") 
			public Object getRegisterData() {
			XSSFWorkbook workbook1 = new XSSFWorkbook{
				new FileInputStream(FrameWorkConstants.excelFilepath);
			XSSFSheet sheet = workbook.getSheet("RegisterUser");
			int rows = sheet.getLastRowNum();
			short columns = sheet.getRow(0).getLastCellNum();
			
			Object[][] data = new Object [rows][columns];
			DataFormatter formatter = new DataFormatter();
			for(int i=1; i<=rows; i++)
			{
				for(int j=1; j<=columns; j++ ) {
					data[i][j]=formatter.formatCellValue(sheet.getRow(i).getCell(j));
				}
			}
			
			}
			}
			
		}

	}


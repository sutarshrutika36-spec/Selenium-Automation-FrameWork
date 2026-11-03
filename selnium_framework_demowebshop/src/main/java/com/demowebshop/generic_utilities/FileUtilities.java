package com.demowebshop.generic_utilities;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class FileUtilities {
		public String readDataFromSpecificCell(String sheetName,int rowNum, int cellNum) throws FileNotFoundException, IOException{
			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(FrameWorkConstants.excelFilepath));
			String celldata = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
			workbook.close();
			return celldata;
			
			
		}

		public String readkeyValueFromPropertyFile(String string) {
			// TODO Auto-generated method stub
			return null;
		}

	}


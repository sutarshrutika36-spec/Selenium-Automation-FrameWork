
	package com.practice;

	import java.io.File;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;



	public class ReadDataFromExcel {

		public static void main(String[] args) throws FileNotFoundException,IOException {
			//step1:- create an object of file class(java.io package) and handle "FileNotFoundExecption"
			File file= new File("C:\\Users\\Mithila\\OneDrive\\Desktop\\html.selenium\\UserRegister1.xlsx");
			
			//step2 :- create the object of FileInputStream(java.io)

			FileInputStream fis = new FileInputStream(file);
			//Step3:- create the object of XSSworkbooks class(from Apache  POI)
			//and handle IOException
			//helps to open a workbook in excel file
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
//			//call getSheet(String sheetName) to navigate into a Perticular sheet
			XSSFSheet sheet = workbook.getSheet("UserDetail1");
//			
//	         //call getRow(int rowName) to navigate into a row of specific no
			 XSSFRow firstRow = sheet.getRow(0);
			 XSSFRow secondRow = sheet.getRow(1);
			 XSSFRow thirdRow = sheet.getRow(2);
			 XSSFRow fourthRow = sheet.getRow(3);
			 
//			
//			//call getCell(int cellNum) to navigate into a specific cell of the 
			 XSSFCell firstCell = firstRow.getCell(0);
//			
//			//converting the object to String
			String firstCellData = firstCell.getStringCellValue();
			
//			
//			//printing the data
			System.out.println(firstCellData);
			//workbook.close();
			
			//convert The XSSFcell object to string  
			String fristCellData  =firstCell.getStringCellValue();
			String secondCellData =firstRow.getCell(1).getStringCellValue();
			String thirdCellData  =firstRow.getCell(2).getStringCellValue();
			String fourthCellData =firstRow.getCell(3).getStringCellValue();

			
			//2nd row data
			String firstCellData1  =secondRow.getCell(0).toString();
			String secondCellData1 =secondRow.getCell(1).getStringCellValue();
			String thirdCellData1  =secondRow.getCell(2).toString();
			String fourthCellData1 =secondRow.getCell(3).getStringCellValue();

			//3rd row data
			String firstCellData2  = thirdRow.getCell(0).toString();
			String secondCellData2 = thirdRow.getCell(1).getStringCellValue();
			String thirdCellData2  = thirdRow.getCell(2).toString();
			String fourthCellData2 = thirdRow.getCell(3).getStringCellValue();
			
			//4th row data
			String firstCellData3  = fourthRow.getCell(0).toString();
			String secondCellData3 = fourthRow.getCell(1).getStringCellValue();
			String thirdCellData3  = fourthRow.getCell(2).toString();
			String fourthCellData3 = fourthRow.getCell(3).getStringCellValue();


			//printing the data
			System.out.print(fristCellData);
			System.out.print("-->" + firstCellData1);
			System.out.print(" ,"+ firstCellData2);
			System.out.println(" ,"+ firstCellData3);
		
			System.out.print(secondCellData);
			System.out.print("-->" +secondCellData1);
			System.out.print(" ,"+ secondCellData2);
			System.out.println(" ,"+ secondCellData3);
			
			System.out.print(thirdCellData);
			System.out.print("-->" +thirdCellData1);
			System.out.print(" ,"+ thirdCellData2);
			System.out.println(" ,"+ thirdCellData3);
			
			System.out.print(fourthCellData);
			System.out.print("-->" +fourthCellData1);
			System.out.print(" ,"+ fourthCellData2);
			System.out.println(" ,"+ fourthCellData3);
			
			workbook.close();

			
			
			
		}

	}
}

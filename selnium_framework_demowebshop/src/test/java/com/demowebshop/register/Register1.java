package com.demowebshop.register;


	import java.io.FileInputStream;

	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import org.testng.annotations.Test;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import org.testng.annotations.Test;


	public class Register1 {
		@Test
		public void RegisterNewUser1() throws FileNotFoundException, IOException {

//		public static void main(String[] args) throws FileNotFoundException, IOException  {
			//read the data from properties file (optimized way)
			Properties property = new Properties();
			property.load(new  FileInputStream("./src/test/resources/com/demowebshop/testdata/common_data/Login.properties"));
			
			String browser = property.getProperty("browser");
			String url = property.getProperty("applicationUrl");
			//Read the data from Excel File
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Downloads\\register_user.xlsx");
					XSSFWorkbook workbook= new XSSFWorkbook(fis);
				     XSSFSheet sheet = workbook.getSheet("register_user");
				     XSSFRow firstRow = sheet.getRow(2);
				     String FirstName=firstRow.getCell(1).getStringCellValue();
				     String LastName=firstRow.getCell(2).getStringCellValue();
				     String Gender=firstRow.getCell(3).getStringCellValue();
				     String Email=firstRow.getCell(4).getStringCellValue();
				     String Password=firstRow.getCell(5).getStringCellValue();
				     workbook.close();
				     
//		 try{}--this will not get any data so we don't use try catch to handle exception 		     
//			  }catch (Exception e) {
//			    e.printStackTrace();
//		}
			
			
		
			
			//launch browser
			WebDriver driver = null;
			if (browser.contains("chrome")) {
				driver= new ChromeDriver();
				
			} else if (browser.contains("edge")){
				driver= new EdgeDriver();
				
			} else if (browser.contains("firefox")) {
				driver= new FirefoxDriver();
				
			}else {
				System.out.println("Enter Vaild Browser");
				
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//navigate to DemoWebshop
		driver.get(url);
		//click on register link
		driver.findElement(By.linkText("Register")).click();{
				
		//Select gender
//		driver.findElement(By.id("gender-female")).click();
		if (Gender.contains("Male")) {
			driver.findElement(By.id("gender-female")).click();
			
		} else {
			driver.findElement(By.id("gender-female")).click();

		}
				
		//enter fist name
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
				
		//enter last name
		driver.findElement(By.id("LastName")).sendKeys(LastName);
				
		//enter Email
		driver.findElement(By.id("Email")).sendKeys(Email);
				
		//enter password
		driver.findElement(By.id("Password")).sendKeys(Password);
		//confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Password);
		//click on register
		driver.findElement(By.id("register-button")).click();
				
		//verify if registration is complete
		WebElement successmessage = driver.findElement(By.cssSelector("[class='result']"));
		if (successmessage.isDisplayed()) {
			System.out.println(" True");
					
				} else {
					System.out.println("False");

				}
				

			} {

			}
			
			
			
	         
		}

	}
		@Test
		public void RegisterNewUser() throws FileNotFoundException, IOException {

//		public static void main(String[] args) throws FileNotFoundException, IOException  {
			//read the data from properties file (optimized way)
			Properties property = new Properties();
			property.load(new  FileInputStream("./src/test/resources/com/demowebshop/testdata/common_data/Login.properties"));
			
			String browser = property.getProperty("browser");
			String url = property.getProperty("applicationUrl");
			//Read the data from Excel File
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Downloads\\register_user.xlsx");
					XSSFWorkbook workbook= new XSSFWorkbook(fis);
				     XSSFSheet sheet = workbook.getSheet("register_user");
				     XSSFRow firstRow = sheet.getRow(2);
				     String FirstName=firstRow.getCell(1).getStringCellValue();
				     String LastName=firstRow.getCell(2).getStringCellValue();
				     String Gender=firstRow.getCell(3).getStringCellValue();
				     String Email=firstRow.getCell(4).getStringCellValue();
				     String Password=firstRow.getCell(5).getStringCellValue();
				     workbook.close();
				     
//		 try{}--this will not get any data so we don't use try catch to handle exception 		     
//			  }catch (Exception e) {
//			    e.printStackTrace();
//		}
			
			
		
			
			//launch browser
			WebDriver driver = null;
			if (browser.contains("chrome")) {
				driver= new ChromeDriver();
				
			} else if (browser.contains("edge")){
				driver= new EdgeDriver();
				
			} else if (browser.contains("firefox")) {
				driver= new FireflinkDriver();
				
			}else {
				System.out.println("Enter Vaild Browser");
				
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//navigate to DemoWebshop
		driver.get(url);
		//click on register link
		driver.findElement(By.linkText("Register")).click();{
				
		//Select gender
//		driver.findElement(By.id("gender-female")).click();
		if (Gender.contains("Male")) {
			driver.findElement(By.id("gender-female")).click();
			
		} else {
			driver.findElement(By.id("gender-female")).click();

		}
				
		//enter fist name
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
				
		//enter last name
		driver.findElement(By.id("LastName")).sendKeys(LastName);
				
		//enter Email
		driver.findElement(By.id("Email")).sendKeys(Email);
				
		//enter password
		driver.findElement(By.id("Password")).sendKeys(Password);
		//confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys(Password);
		//click on register
		driver.findElement(By.id("register-button")).click();
				
		//verify if registration is complete
		WebElement successmessage = driver.findElement(By.cssSelector("[class='result']"));
		if (successmessage.isDisplayed()) {
			System.out.println(" True");
					
				} else {
					System.out.println("False");

				}
				

			} {

			}
			
			
			
	         
		}

	}


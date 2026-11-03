package com.practice;

	import java.io.File;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;


	public class ReadDataFromProperties {
		public static void main(String[] args) throws IOException  {
			//1 create object of  file class and handle fileinputstreamException
			File file = new File("./src/test/resources/com/DemoWebShop/TestData/CommonData/Login.properties");
			
	       //2 create object of fileinputstream and handle IOException
			FileInputStream fis = new FileInputStream(file);
			
			//3 create object of properties class
			Properties property = new Properties();
			
			//4 call load() to load the FIS in the properties object
			property.load(fis);
			
			//5 read the values using key from the properties file
			String writtenbrowser = property.getProperty("browser");
			String url = property.getProperty("applicationUrl");
			System.out.println(writtenbrowser);
			System.out.println(url);
			
			
		}

	}
}

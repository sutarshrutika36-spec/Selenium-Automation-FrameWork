package com.demowebshop.generic_utilities;

	import java.time.LocalDateTime;

	import java.time.format.DateTimeFormatter;
	import java.util.Random;

	import org.openqa.selenium.WebDriver;

	public class javaUtility {
		public javaUtility(WebDriver driver) {
			// TODO Auto-generated constructor stub
		}

		public String fetchTimeStamp() {
			return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));	
		}
		
		//for random data 
		public int getRandomNumber() {
//			Random random = new Random();
//			return random.nextInt(10000);
		
			return  new Random().nextInt(10000);
			
		}
		

	}
}

package com.practice;

import java.util.EventObject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.office.CTOLEObject;

public class LearningDataProvider {
 //Creating  Data provider method
	@DataProvider(name="loginCreds")
	public Object[][] getData(){
		Object[][] data= new
				Object[][]{{"user1","pass1"},
					{"user2","pass2"},
					{"user3","pass3"}
				};
		return data;
				}
	
	@Test(dataProvider = "loginCreds")
	public void testMethod(String username, String password) {
		System.out.println("The username is: " +username);
		System.out.println("The password9 is: " +password);
		System.out.println("---------------------------------------------------------------------------------" );
	}
	
}

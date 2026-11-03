package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
@Test
public void StringAssertion()
{
	String actual = "Hello World!!!";
	String Excepted = "Hello World!!!";
	//Hard Assertion
	Assert.assertEquals(actual, Excepted );
	System.out.println("Pass");
}
@Test
public void booleanAssert()
{
	int a = 10;
	int b = 5;
	int sum=a+b;
	boolean result = sum==10;
	Assert.assertTrue(result);
}
}

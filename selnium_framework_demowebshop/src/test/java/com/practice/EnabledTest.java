package com.practice;

import org.testng.annotations.Test;

public class EnabledTest {
@Test(enabled = false)
public void method1()
{
	System.out.println("executing method 1");
}
@Test(enabled = true)
public void method2()
{
	System.out.println("executing method 2");
}
}

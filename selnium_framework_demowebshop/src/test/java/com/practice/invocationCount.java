package com.practice;

import org.testng.annotations.Test;

public class invocationCount {
@Test(priority = 1,invocationCount = 20)
public void register()
{
	System.out.println("new user Registered");
}
@Test(priority = 1,invocationCount = 20)
public void login()
{
	System.out.println("new user logged in");
}
}

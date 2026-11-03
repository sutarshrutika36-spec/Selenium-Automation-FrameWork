package com.practice;

import org.testng.annotations.Test;

public class AsserTest {
	@Test
public void  method()
{
	int a=10;
	int b=15;
	int sum=a+b;
	if(sum==15) {
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
/*Even thought the script should fail according to requirement but
 * Testing marks it as passed as the method has completed its execution and has not
 * failed in between thus testNG assertion is necessary*/

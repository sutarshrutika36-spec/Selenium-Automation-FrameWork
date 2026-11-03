package com.practice;

import org.testng.annotations.Test;

public class AlwaysRun {
@Test
public void method1() {
	System.out.println("--Executing Method1--");
}
@Test(alwaysRun = true,dependsOnMethods = "method1")
public void method2() {
	System.out.println("--Executing Method2--");
}
}

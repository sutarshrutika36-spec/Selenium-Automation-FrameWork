package com.practice;

	import org.testng.annotations.Test;

	public class TestNGPractice {
		@Test
		public void registerTest() {
			System.out.println("new user register");
		}
		@Test
		public void loginTest() {
			System.out.println("user logged in succeccfully!!");
		}
		@Test
		public void addProductTest() {
			System.out.println("Product Added to the Cart");
		}
		@Test
		public void paymentTest() {
			System.out.println("payment succeccfull!!");
		}
		

	}
}

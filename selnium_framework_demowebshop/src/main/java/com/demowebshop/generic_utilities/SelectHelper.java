package com.demowebshop.generic_utilities;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class SelectHelper {
		//Selection
		Select select;
		public void selectAnOption(WebElement selectElement, String value) {
			select = new Select(selectElement);
			select.selectByValue(value);	
		}
		public void selectAnOption(WebElement selectElement, int index) {
			select = new Select(selectElement);
			select.selectByIndex(index);	
		}
		public void selectAnOption(String visibleText, WebElement selectElement) {
			select = new Select(selectElement);
			select.selectByVisibleText(visibleText);;	
		}
		
		//Deselection
		public void deselectAnOption(WebElement deselectElement, String value) {
			select = new Select(deselectElement);
			select.deselectByValue(value);;	
		}
		public void deselectAnOption(WebElement deselectElement, int index) {
			select = new Select(deselectElement);
			select.deselectByIndex(index);;	
		}
		public void deselectAnOption(String visibleText, WebElement deselectElement) {
			select = new Select(deselectElement);
			select.deSelectByContainsVisibleText(visibleText);	
		}
		public void deselectAnOption(int value , String visisibletext , WebElement deselectElement ,String ContainvisibleText) {
			select = new Select(deselectElement);
			select.deselectAll();	
		}
		public void deselectAnOption(String ContainvisibleText,String visisibletext, int value,WebElement deselectElement) {
			select = new Select(deselectElement);
			select.deSelectByContainsVisibleText(visisibletext);;	
		}

	}


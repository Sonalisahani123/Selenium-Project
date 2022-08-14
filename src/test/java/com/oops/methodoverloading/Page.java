package com.oops.methodoverloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	WebDriver  driver;
		
	
	public Page(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//abstract methods without body
	public abstract  String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	public abstract WebElement getElement(By locator);
	
	//public abstract void waitForElementPresent(By locator);
	
	//public abstract void waitForPageTitle(String title);
	

}

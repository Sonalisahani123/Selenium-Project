package com.oops.methodoverloading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class WaitClass {
	
	 public static void explicitWaitClick(WebDriver driver, WebElement ele)
	 {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	 }
	 
	 
	 public  static void explicitWaitClick(WebDriver driver, String xpath)
	 {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		 Assert.assertFalse(false);
		 
	 }
	 
	 public static void implicitWait(WebDriver driver, long time)
	 {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 }
	 

}

package com.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CommonWebUtility {
	static WebDriver driver;
	
	//1.click action
	public static void clickingOnWebElement(WebElement element,long waitTimeInseconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInseconds));
		WebElement elements = null;
		elements =wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
		
	}
	
	//2.send keys---- on text field
	public static void  sendKeysOnWebElement(WebElement element, String text)
	{
		element.click();
		element.clear();
		element.sendKeys(text);
	}
	
	//3.selecting  dropdownlist
	public  static void  selectByVisibleText(WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	//4.accepting alert from UI
	public  static void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	//5.MouseHovering from one element to other element
	public static void mouseHoverAndClickElement(WebElement element)
	{
		Actions actions =new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	
	
	//6.window Handles
	public static String getCurrentWindowId()
	{
		return driver.getWindowHandle();
	}
	
	//can create javascriptexecutor

	
@Test
public void test()
{
	
}
	
}




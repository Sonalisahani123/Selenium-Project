package com.oops.methodoverloading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameSwitchClass {
	
	//switch frame by Id
	public void switchFrame(WebDriver driver,int id)
	{
		driver.switchTo().frame(id);
	}
	
	//by name
	public void switchFrame(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);
	}
	
	//by webelement
	public void switchFrame(WebDriver driver, WebElement ele)
	{
		driver.switchTo().frame(ele);
	}

}

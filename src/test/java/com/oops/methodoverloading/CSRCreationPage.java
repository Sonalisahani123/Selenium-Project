package com.oops.methodoverloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CSRCreationPage extends BaseClass {

    private static String ddTitle="title";
	private  static  String txtfirstname="firstname";
	private static String txtlastname="lastname";
	//all the  form fields here 
	
	public  static void selectTitle(String title)
	{
		WebElement element =driver.findElement(By.id(ddTitle));
		Select select =new Select(element);
		select.selectByVisibleText(title);
	}
	
	public  static void selectTitle(int index)
	{
		WebElement element =driver.findElement(By.id(ddTitle));
		Select select =new Select(element);
		select.selectByIndex(index);	
	}
	

}

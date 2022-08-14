package com.oops.methodoverloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseWaitInTestClass extends WaitClass {
      //WaitClass wait =new WaitClass();
	static  WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		WaitClass.implicitWait(driver, 20);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Try for Free')]"));
		WaitClass.explicitWaitClick(driver, element );
		//String xpath = driver.findElement(By.xpath("//a[contains(text(),'Try for Free')]"));

	}

}

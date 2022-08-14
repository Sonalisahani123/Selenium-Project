package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownByUsingGenericMethod {
	   static WebDriver driver;
	   

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 WebElement employees=driver.findElement(By.name("NoOfEmployees"));
		    Thread.sleep(5000);
		 selectOptionFromDropDown(employees,"11 - 15");
		
		 WebElement industry=driver.findElement(By.id("Form_submitForm_Industry"));
		 selectOptionFromDropDown(industry,"Aerospace");
		 WebElement country=driver.findElement(By.id("Form_submitForm_Country"));
		 selectOptionFromDropDown(country,"Algeria");
		 
		 driver.close();
		 driver.quit();
		 
		 
	}
	 public static void  selectOptionFromDropDown(WebElement ele,String value){
		   Select select=new Select(ele);
		   ele.click();
		   List<WebElement> options=select.getOptions();
		   System.out.println("Options:"+options);
		   for(WebElement option:options)
		   {
			   System.out.println("option"+option);
			   if(option.equals(value)){
				   System.out.println("is value taken");
				   option.click();
				   System.out.println("success");
		              break;
			   }
		   
			   }
		 
	 }

}

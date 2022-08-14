package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdownSelect {

	public static void main(String[] args) {
		WebDriver driver;
		 
		//Setting the properties for chromedriver
		WebDriverManager.chromedriver().setup();
		//Initialize the chromedriver for webdriver reference
		driver=new ChromeDriver();
 
		//Launching application
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
 
		//Setting implicit wait to load all web elements in application
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Maximize the window
		driver.manage().window().maximize();
 
		//Clicking the dropdown
		driver.findElement(By.xpath("//button[@data-toggle='dropdown']")).click();
 
		//Collecting all the elements present in the dropdown
		List<WebElement> allDropDownValues=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li/a/label"));
 
		//Finding the count of all elements
		int dropDownCount= allDropDownValues.size();
		
		//Printing count of all items
		System.out.println("Total items present in the dropdown : "+dropDownCount);
 
		//For loop to go each and every element in the dropdown
		for(int i=0;i<dropDownCount;i++)
		{
			 //if condition to check specific element "Java"
			if(allDropDownValues.get(i).getText().contains("Java"))
			{
				
				//Clicking the desired element
				allDropDownValues.get(i).click();
				//Stop continuing the loop as we already found the desired element
				break;
			}
 
 
 
		}
 
	}


	}



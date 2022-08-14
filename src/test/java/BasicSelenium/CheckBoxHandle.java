package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHandle {
	WebDriver driver;
	
	
	@Test
	 public void select_onecheckbox()
	 {
		 // using click() we can check or uncheck
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		//click on check box
		driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		//verify the checkbox selected or not
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		if(checkbox.isSelected())
		{
			System.out.println("checkbox is selected");
		}else {
			System.out.println("checkbox is not selected");
		}
		
	 }
	
	@Test
	public void select_all_checkbox()
	{
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		
		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 int size = allcheckboxes.size();
		 System.out.println(size);
		 for(int i=0; i<size; i++)
				 {
			 allcheckboxes.get(i).click();
		 } 
	}

	@Test
	public void  dynamic_checkbox()
	{
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		driver.manage().window().maximize();
		
		List<WebElement> hobbies =  driver.findElements(By.xpath("//input[@type='checkbox'  and  @name ='Hobby']"));
		 int size =hobbies.size();
		 for(int i=0;i<size;i++)
		 {
			 //capture all the element
			 WebElement element = hobbies.get(i);
			 //print  all the element details
			 String hobby = element.getAttribute("value");
			// System.out.println(hobby);
			 //select one check box 
			 if(hobby.contains("Dancing"))
			 {
				 element.click();
				 break;
			 }
		 }
		
		
	}
}

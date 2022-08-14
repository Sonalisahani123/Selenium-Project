package InterviewAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleCheckboxSelect {
	 WebDriver driver;
	
	@BeforeTest
   public void setUp()
   {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://itera-qa.azurewebsites.net/home/automation");
	   driver.manage().window().maximize();
	   
   }
	
	
	@Test(enabled=false)
	public void selectSpecificCheckbox()
	{
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
	}

	@Test(enabled= false)
	public void selectAllCheckboxes()
	{
		List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	    System.out.println("avialable checkboxs:"+ checkboxs.size());
	    //1.normal for loop
	    for(int i=0;i<checkboxs.size();i++)
	    {
	    	checkboxs.get(i).click();
	    }
	  
	   //2.for-each loop
	    for(WebElement checkbox:checkboxs)
	    {
	    	checkbox.click();
	    }
	}
	
	
	@Test
	public void selectMultipleCheckboxByChoice() throws InterruptedException
	{
		//Monday sunday
		List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for(WebElement chbox:checkboxs)
		{
			String checkboxName=chbox.getAttribute("id");
			//System.out.println("checkboxName is:"+ checkboxName);
			if(checkboxName.equals("monday") || checkboxName.equals("wednesday") || checkboxName.equals("saturday"))
			{
				chbox.click();
				System.out.println("checkboxName is:"+ checkboxName);
				Thread.sleep(5000);
			}
		}
	}
	
	@Test
	public void selectLast2CheckBox() throws InterruptedException
	{
		List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		int totalCheckBoxs=checkboxs.size();
		Thread.sleep(2000);
		for(int i=totalCheckBoxs-2;i<totalCheckBoxs;i++)
		{
			checkboxs.get(i).click();
		}
	}
	
	@Test
	public void selectfirst2CheckBox() throws InterruptedException
	{
		List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		int totalCheckBoxs=checkboxs.size();
		Thread.sleep(2000);
		for(int i=0;i<totalCheckBoxs;i++)
		{   if(i<2)
			checkboxs.get(i).click();
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		//driver.quit();
	}
}

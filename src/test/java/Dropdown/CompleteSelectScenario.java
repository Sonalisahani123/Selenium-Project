package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompleteSelectScenario {
	WebDriver driver;
	
	@Test
	 public void select_dropdown_usingMehtod() throws InterruptedException
	 {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		//take the xpath for complete country
		WebElement country=driver.findElement(By.id("input-country"));
		//create the select class object by passing the country webelement
		Select select =new Select(country);
		select.selectByIndex(2);
		Thread.sleep(5000);
		select.selectByValue("4");
		Thread.sleep(2000);
		select.selectByVisibleText("Albania");
		
		//driver.close();
		 
	 }
	
	
	@Test
     public void select_all_dropdown()
     {
    	 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         String url = "https://www.tutorialspoint.com/tutor_connect/index.php";
         driver.get(url);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         Select s = new Select(driver.findElement(By.xpath("//select[@name=’selType’]")));
         // getting the list of options in the dropdown with getOptions()
         List <WebElement> op = s.getOptions();
         int size = op.size();
         for(int i =0; i<size ; i++){
            String options = op.get(i).getText();
            System.out.println(options);
         }
         driver.close();
      }
     }


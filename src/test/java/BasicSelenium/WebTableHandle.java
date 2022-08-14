package BasicSelenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class WebTableHandle {
	
	      @Test
	      public void verifyTable() throws InterruptedException {
		
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://seleniumpractise.blogspot.com/2021/08");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     List<WebElement> allHeaders=driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
	     System.out.println(allHeaders.size());
	     Assert.assertEquals(allHeaders.size(), 5);
	     
	     //print the headers text
	    boolean status=false;
	     for(WebElement header:allHeaders)
	     {
	    	String value=header.getText();
	    	System.out.println(value);
	    	if(value.contains("Country"))
	    	{
	    		status=true;
	    		break;
	    	}
	    	
	     }
	     
	     //get all the table details and check the data
	    List<WebElement> noOfrows= driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr"));
	     System.out.println("total rows count:"+ noOfrows.size());
	     Assert.assertEquals(noOfrows.size(),7);
	     List<WebElement> noOfColumns= driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));
	     boolean tableDataStatus=false;
	     for(int i=0;i<noOfColumns.size();i++)
	     {
	    	 WebElement element=noOfColumns.get(i);
	    	 String value=element.getText();
	    	 if(value.contains("Selenium"))
	    	  {
	    		  tableDataStatus=true;
	    		  break;
	    	  }
	    			 
	     }
	      
			/*
			 * for(WebElement ele:noOfColumns) { String value=ele.getText();
			 * System.out.println(value); if(value.contains("Selenium")) {
			 * tableDataStatus=true; break; } }
			 */
	     Assert.assertTrue(tableDataStatus);
	     
	     driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]//a")).click();
         Thread.sleep(5000);


      
}
}

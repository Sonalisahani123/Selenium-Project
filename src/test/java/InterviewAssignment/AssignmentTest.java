package InterviewAssignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTest {
	
	@Test
  public void test1() throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://techctice.com/internships/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.findElement(By.xpath("//a[@href='https://techctice.com/best-digital-marketing-internship-in-bhubaneswar/'][normalize-space()='Know More']")).click(); 
	  String main_window=driver.getWindowHandle();
	  Set<String>windowHandles=driver.getWindowHandles();
		System.out.println("multipleWindows:"+ windowHandles);
		for(String windowHandle:windowHandles)
		{
			if(!windowHandle.equals(main_window))
			{
				driver.switchTo().window(windowHandle);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='your-fname']")).sendKeys("sonali");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='your-phone']")).sendKeys("8951968472");
				driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys("sonali.sahani93@gmail.com");
				//driver.findElement(By.xpath("//input[@value='CALL ME NOW']")).click();
				
				Thread.sleep(2000);
				//driver.close();
			}
			
  }

  }
	
	
	
	@Test
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://techctice.com/internships/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,2000)");
		  driver.findElement(By.xpath("//a[@class='qlwapp-toggle']"));
		
	}
	
	
	
	
}

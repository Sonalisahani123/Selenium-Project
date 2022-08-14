package InterviewAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class SeleniumExceptionsCheck {
	WebDriver driver;
	
	
	@Test(enabled=false)
	public void noSuchElementExceptionCheck()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.findElement(By.name("qaa")).sendKeys("abc");
		
	}
	
	@Test
	
	public void staleElementReferenceCheck() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.xpath("//*[@id=\"menu-primary-items\"]/li[5]/a"));
		link.click();
		driver.navigate().back();
		Thread.sleep(5000);
		try {
			link.click();
		}
		catch(StaleElementReferenceException e)
		{
			 link=driver.findElement(By.xpath("//*[@id=\"menu-primary-items\"]/li[5]/a"));
			 link.click();
		}
		
	}
	
	@Test
	public void checktheExceptionWorkFlow()
	{
		try {
			int arry[] = {1,2,3,4,5};
			
			for(int i=0;i<=arry.length; i++)
			{
				System.out.println(arry[i]);
			}
			System.out.println("********************");
			
		}
		catch(Exception e)
		{
			System.out.println("print  second e");
			try {
			Integer myInt = new Integer(" 123  ");
			System.out.println(myInt);
			}
			catch(NumberFormatException e3)
			{
				e3.printStackTrace();
			}
		}
		
	}
	
	

}

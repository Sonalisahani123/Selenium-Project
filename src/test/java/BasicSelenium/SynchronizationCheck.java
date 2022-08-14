package BasicSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationCheck {
	
	WebDriver driver;
	
	
	@Test
	public void implicitywaitCheck()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(20));
	}

	@Test
	public void  explicitywaitCheck()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("");
	    driver.manage().window().maximize();
	    
	    String url="www.facebook.com";
	    driver.get(url);
	    driver.navigate().to(url);
	    driver.navigate().back();
	    
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(20));
	    WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'COMPOSE')]")));
	    element.click();
	    
	    WebDriverWait wait1  = new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeSelected(By.xpath("lkfjdlf")));
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("fjdlkfdjf")));
	    
	}
	
	
	@Test
	public void  fluentWaitCheck()
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("");
	    driver.manage().window().maximize();
	    
	    //Declare and initialise a fluent wait
	    FluentWait wait = new FluentWait(driver);
	  //Specify the timout of the wait
	    wait.withTimeout(Duration.ofMillis(5000));
	  //Sepcify polling time
	    wait.pollingEvery(Duration.ofMillis(250));
	    
	  //Specify what exceptions to ignore
	    wait.ignoring(NoSuchElementException.class);
	    
	  //This is how we specify the condition to wait on.
	  //This is what we will explore more in this chapter
	  wait.until(ExpectedConditions.alertIsPresent());
	    
	  
	  FluentWait wait1 = new FluentWait(driver);
	  wait1.withTimeout(Duration.ofSeconds(20));
	  wait1.pollingEvery(Duration.ofMillis(5000));
	  wait1.ignoring(NoSuchElementException.class);
	  wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	  
	  
	  
	  
	}
}

package JavaScriptExecutor;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorScenarios {
	WebDriver driver;
	
	@Test
	public void flash_element()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.crmpro.com/index.html");
		driver.manage().window().maximize();
		
		WebElement usernmae=driver.findElement(By.xpath("//input[@placeholder='Username']"));
				usernmae.sendKeys("sonalika");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Saibaba@1");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@value='Login']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		//get title of the page
		String script ="return document.title;";
		String title= (String) js.executeScript(script);
		System.out.println("Title : "+ title);
		
		
		//high light login button 
		 js.executeScript("arguments[0].style.backgroundColor='5px solid greeen'",usernmae);
		 
		 //high light login border
		 js.executeScript("arguments[0].style.border='5px solid red'",loginbtn);
	}

	
	
	@Test
   public void test2()
     {
	// TODO Auto-generated method stub
			 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			/*driver.get("https://www.google.com/");
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("alert('Hello')");*/
			
			//Enter the text by using JavascriptExecutor
			
			driver.get("http://www.facebook.com/");
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('email').value='abcd@gmail.com'");
			
			WebElement element=driver.findElement(By.id("email"));
			//js.executeScript("arguments[0].value='abcd@gmail.com'", element);
			
			String text=(String) js.executeScript("return document.getElementById('email').value='abcd@gmail.com'");
			System.out.println(text);
			driver.quit();

		}

	
	
}


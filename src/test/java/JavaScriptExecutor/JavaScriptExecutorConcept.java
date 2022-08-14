package JavaScriptExecutor;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("https://www.crmpro.com/");
		  driver.findElement(By.name("username")).sendKeys("sonalika");
		  driver.findElement(By.name("password")).sendKeys("Saibaba@1");
		   // driver.findElement(By.xpath("//input[@type='submit']")).click();
		  WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		    flash(loginBtn,driver);
		    drawBorder(loginBtn,driver);//draw border
		    
		    
		    //Take Screenshot
		    //File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    //FileUtils.copyFile(src, new File(F:\\Naveen\\Selenium\\src\\main\\java\\com\\basic\\selenium\\element.png));
		    
		    
		    
		    
		    
		   
	}
	
	//high light login element by using JavaScriptExecutor		  
       public static void flash(WebElement element,WebDriver driver)
		  
		  {
			  JavascriptExecutor js=(JavascriptExecutor)driver;
			  String bgColor=element.getCssValue("backgroungcolor");
			  for(int i=0;i<100;i++)
			  {
				  changeColor("rgb(0,200,0)",element,driver);
				  changeColor(bgColor,element,driver);
			  }
			  
			  
		  }
		  
		  
		  public static void changeColor(String color,WebElement element,WebDriver driver)
		  {
			  JavascriptExecutor js=(JavascriptExecutor)driver;
			  js.executeScript("arguments[0].style.backgroundColor= '"+color+"'", element);
			  try{
				  Thread.sleep(30);
			  }catch(Exception e){
				  
			  }
			  
		  }

		
		
		public static void drawBorder(WebElement element,WebDriver driver)
		{
			 JavascriptExecutor  js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].style.border='3px solid red'", element);
			 
	}
}



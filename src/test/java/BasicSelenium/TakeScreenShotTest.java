package BasicSelenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotTest {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		
		//1.Take the SS of full page
		
		  TakesScreenshot ts=(TakesScreenshot)driver; 
		  File screenShotFile=ts.getScreenshotAs(OutputType.FILE); 
		  FileUtils.copyFile(screenShotFile, new File(".//screenshots/screen.png"));
		  
		 
		
		/* 2.Take screenshot by Time wise */
		 Date currentDate=new Date(); 
		 System.out.println(currentDate); 
		 String screenshotFileName=currentDate.toString().replace(" ", "-").replace(":","-"); 
		 System.out.println(screenshotFileName); 
		 TakesScreenshot ts1=(TakesScreenshot) driver; 
		 File f=ts1.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f, new File("//screenshot/"+screenshotFileName +".png"));
		 
		
			/* 3.Take screenshot for perticular web element */
	     
	     
	     driver.get("https://www.facebook.com/");
	     WebElement element=driver.findElement(By.xpath("//button[@id='u_0_h_yw']"));
	     File fs=element.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(fs, new File("E:\\ScreenShot\\login.jpg"));
	     driver.close();
	    
	     
		
		

	}

}

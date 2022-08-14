package Calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalendar {
	    static WebDriver driver;
	    
	    public static void main(String args[]){
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	
        String targetdate="28-Feb-2021";
        //change the string format to date format
        SimpleDateFormat targetdateformat=new SimpleDateFormat("dd-MMM-yyyy");//if u will mention small m then it will take as minute
        
       try {
		Date  formatedtargetDate=targetdateformat.parse(targetdate);
		
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	    }
	    
	
       public void searchFlightDetails() throws InterruptedException
       {
    	   driver.get("https://www.cleartrip.com/");
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	   
    	   //click round trip
    	   driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]")).click();
    	   
    	   driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
    	   driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("Mumbai, IN - Chatrapati Shivaji Airport (BOM)");
    	   
    	   
    	   
       }
	
	
}
		


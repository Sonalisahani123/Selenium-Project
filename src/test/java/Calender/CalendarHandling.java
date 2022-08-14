package Calender;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarHandling {
	
	WebDriver driver;
	
	@Test
	public void handleCalandarFrom_devbqp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		WebDriverWait wait =new  WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYear);
     	String month = monthYear.split(" ")[0];
    	System.out.println(month);
     	String year = monthYear.split(" ")[1];
     	System.out.println(year);
     	while(!(month.equals("November")&& year.equals("2023")))
     	{
     		driver.findElement(By.xpath("//a[@title='Next']")).click();
     		monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
     		month = monthYear.split(" ")[0];
     		year = monthYear.split(" ")[1];
     		
     		
     	}
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='25']")).click();
     	
     	
		
     	//driver.close();
		
		
	}

}

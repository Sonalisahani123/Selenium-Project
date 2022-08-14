package Dropdown;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdownCheck {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		   driver.get("https://www.bing.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		   Thread.sleep(5000);
		   
		  List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		  
		  
		  System.out.println(list);
		  
		//*[text()='download']/ancestor::ul[@class='sa_drw']
		  
		  System.out.println("size of auto suggested options:"+ list.size());
		   for(WebElement listitem:list){
			   if(listitem.getText().contains("download"))
			   {
				   listitem.click();
				   break;
			   }
		   }
		   

	}

}

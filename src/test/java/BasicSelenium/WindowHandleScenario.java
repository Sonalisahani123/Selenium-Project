package BasicSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleScenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[contains(text(),'Try For Free')]")).click();
        //after click it will open another window,and those 2 window will store it in set<String>
          Thread.sleep(4000); 
           Set<String> windows= driver.getWindowHandles();
           System.out.println("Windows:" + windows);
          Iterator<String> itr= windows.iterator();
           String parentWindow=itr.next();
           System.out.println("Parent Window:"+parentWindow);
           String childWindow=itr.next();
           System.out.println("childwindow:" + childWindow);
           driver.switchTo().window(childWindow);
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("sonali");
           driver.switchTo().window(parentWindow);
        
		
	}

}

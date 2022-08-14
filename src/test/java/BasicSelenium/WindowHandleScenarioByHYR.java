package BasicSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleScenarioByHYR {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		String main_window=driver.getWindowHandle();
		System.out.println("main window"+main_window);
		//main_window.get
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String>windowHandles=driver.getWindowHandles();
		System.out.println("multipleWindows:"+ windowHandles);
		for(String windowHandle:windowHandles)
		{
			if(!windowHandle.equals(main_window))
			{
				driver.switchTo().window(windowHandle);
				driver.findElement(By.id("firstName")).sendKeys("sonali");
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(main_window);
		driver.findElement(By.id("name")).sendKeys("sahani");
		Thread.sleep(2000);
		
		
		
	}

}

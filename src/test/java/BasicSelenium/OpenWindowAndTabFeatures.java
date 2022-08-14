package BasicSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWindowAndTabFeatures {
	
	
	@Test
	public void switch_tab()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//selenium - 4 Feature, open the new tab
		
		driver.switchTo().newWindow(WindowType.TAB);// open new blank tab
		System.out.println("after switching title is:" + driver.getTitle());
		driver.get("https://www.facebook.com/");
		System.out.println("after switching title is:" + driver.getTitle());
		
		driver.close();
		System.out.println("after closing the tab title is:" + driver.getTitle());
		
	}
	
	@Test
	public void switch_tab_with_WindowHandle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//selenium - 4 Feature, open the new tab
		
		driver.switchTo().newWindow(WindowType.TAB);// open new blank tab
		Set<String> handles =  driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(handles);
		
		String parentWindowId = ls.get(0);
		String  childWindowId = ls.get(1);
		System.out.println("parent Window:" + parentWindowId);
		System.out.println("childWindow:" + childWindowId);
		
		System.out.println("after switching title is:" + driver.getTitle());
		driver.get("https://www.facebook.com/");
		System.out.println("after switching title is:" + driver.getTitle());
		
		driver.close();// close the tab
		driver.switchTo().window(parentWindowId);
		
		System.out.println("after closing the tab title is:" + driver.getTitle());
		
	}
	
	@Test
	public void switch_window_with_WindowHandle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//selenium - 4 Feature, open the new tab
		
		driver.switchTo().newWindow(WindowType.WINDOW);// open new blank tab
		Set<String> handles =  driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(handles);
		
		String parentWindowId = ls.get(0);
		String  childWindowId = ls.get(1);
		System.out.println("parent Window:" + parentWindowId);
		System.out.println("childWindow:" + childWindowId);
		
		System.out.println("after switching title is:" + driver.getTitle());
		driver.get("https://www.facebook.com/");
		System.out.println("after switching title is:" + driver.getTitle());
		
		//driver.close();// close the tab
		driver.switchTo().window(parentWindowId);
		
		System.out.println("after closing the tab title is:" + driver.getTitle());
		
	}
	
	

}
	



package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckAllCommands {

	public static void main(String[] args) throws InterruptedException {
	   
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	
		//driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		driver.get("https://www.google.com/");
		
		//System.out.println(driver.getCurrentUrl());
		
		//driver.navigate().t
		
		//navigate commands
		driver.navigate().to("www.javatpoint.com");
		
		
		

	}

}

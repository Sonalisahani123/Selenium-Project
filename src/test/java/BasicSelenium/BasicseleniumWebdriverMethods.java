package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicseleniumWebdriverMethods {

	public static void main(String[] args) {
		//launch the chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		System.out.println(driver.getTitle());
		String cU=driver.getCurrentUrl();
		System.out.println(cU);
		System.out.println(driver.getPageSource());
		
		

	}

}

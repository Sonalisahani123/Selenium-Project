package BasicSelenium;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingWebPageTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//if you want to window scroll  complete page from top do down
		/*
		 * window.scrollBy(0,700) need to check coordinator for scrollBy()
		 * 0-Horizontal
		 * 700-vertical
		 */
		
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		
		
		/*
		 * if you want to scroll in table
		 * document.querySelector(".tableFixHead").scrollTop=5000
		 */
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
	}

}

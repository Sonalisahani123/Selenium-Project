package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameHandlingTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20)));
		//driver.manage().timeouts().implicitlyWait(Duration.ofDays(0))
		
		/*
		 * driver.switchTo().frame(0); driver.switchTo().frame(null);
		 * driver.switchTo().frame(null);
		 */
		
		/*Assert.assertEquals(false, false);
		Assert.assertEquals(null, null);
		*/
		
		

	}

}

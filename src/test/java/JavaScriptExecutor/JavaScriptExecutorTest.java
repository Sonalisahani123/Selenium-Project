package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorTest {
	
	WebDriver driver;
	@Test
	public void highlight_element_check()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		WebElement element = driver.findElement(By.xpath("//input[@id='email']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", element);
	    element.sendKeys("sonali.sahani93@gmail.com");
	
	}
	

}

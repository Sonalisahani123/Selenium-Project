package JavaScriptExecutor;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		/*driver.get("https://www.google.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("alert('Hello')");*/
		
		//Enter the text by using JavascriptExecutor
		
		driver.get("http://www.facebook.com/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='abcd@gmail.com'");
		
		WebElement element=driver.findElement(By.id("email"));
		//js.executeScript("arguments[0].value='abcd@gmail.com'", element);
		
		String text=(String) js.executeScript("return document.getElementById('email').value='abcd@gmail.com'");
		System.out.println(text);
		driver.quit();

	}

}

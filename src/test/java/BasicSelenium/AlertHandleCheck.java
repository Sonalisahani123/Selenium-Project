package BasicSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//prompt alert
        Alert promptalert=driver.switchTo().alert();
        System.out.println("name of the  prompt alert:"+ promptalert.getText());
        promptalert.accept();
        Thread.sleep(20);
        Alert alert=driver.switchTo().alert();
        System.out.println("name of the alert:" + alert.getText());
        alert.accept();
        //driver.close();
       
        
        
        
        
	}

}

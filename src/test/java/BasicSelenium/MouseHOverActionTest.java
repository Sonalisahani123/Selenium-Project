package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHOverActionTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		//take the element to which you want to mouse hover
		WebElement eleToMouseHover=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		//create the Actions class object
		Actions act=new Actions(driver);
		act.moveToElement(eleToMouseHover).perform();
		
		
		
		

	}

}

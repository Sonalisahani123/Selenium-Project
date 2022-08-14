package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//id 
		WebElement searchBox=driver.findElement(By.id("search_query_top"));
		searchBox.sendKeys("T-shirts");
		//name
		driver.findElement(By.name("submit_search")).click();
		
		//link text
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		//partial link text
		//driver.findElement(By.partialLinkText("Chiffon Dress")).click();
		
	}
	

}

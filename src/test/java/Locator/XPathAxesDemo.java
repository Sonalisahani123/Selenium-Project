package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathAxesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		//self
		String text=driver.findElement(By.xpath("//a[contains(text(),'Indigo Paints')]/self::a")).getText();
		System.out.println(text);
		
		//parent
		String text2=driver.findElement(By.xpath("//a[contains(text(),'Indigo Paints')]/parent::td")).getText();
		System.out.println(text2);
		
		//child
		text=driver.findElement(By.xpath("//a[contains(text(),'Indigo Paints')]/ancestor::tr/child::td")).getText();
		System.out.println(text);
				
		//Ancestor
		 text=driver.findElement(By.xpath("//a[contains(text(),'Indigo Paints')]/ancestor::tr")).getText();
		 System.out.println(text);
		 
		 //Decendent.
		  text=driver.findElement(By.xpath("(//a[contains(text(),'Indigo Paints')]/ancestor::tr/descendant::td)[1]")).getText();
		  System.out.println(text);
		  
		  
		  
		  driver.close();
      
	}

}

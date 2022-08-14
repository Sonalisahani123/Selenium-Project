package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
public static void main(String[] args) throws InterruptedException {
	
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.opencart.com/index.php?route=account/register");
	   driver.manage().window().maximize();
	   //select dropdown byusing methods
	   WebElement cntryelement=driver.findElement(By.id("input-country"));
	   Select selectCountry=new Select(cntryelement);
	    selectCountry.selectByVisibleText("India");
	    Thread.sleep(2000);
	    selectCountry.selectByIndex(5);
	    //selectCountry.selectByValue("Andorra");
	    
	    //Without using methods
		/*
		 * List<WebElement>countries=selectCountry.getOptions(); for(WebElement
		 * country:countries){ if(country.equals("India")) { country.click(); break; } }
		 */
	    //driver.close();
}

}

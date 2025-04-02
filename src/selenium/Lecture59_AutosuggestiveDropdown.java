package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture59_AutosuggestiveDropdown {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("autosuggest")).sendKeys("IND");
	Thread.sleep(2000);
List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	
	Thread.sleep(2000);
	
	for(WebElement element:options) {
		
		System.out.println(element.getText());
		if(element.getText().equalsIgnoreCase("India")) {
			element.click();
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}

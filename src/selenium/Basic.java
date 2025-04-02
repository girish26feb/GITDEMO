package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

public static void main(String[] args) {
	
System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");
	
WebDriver driver =new ChromeDriver();
 driver.get("https://rahulshettyacademy.com/");
	
 System.out.println(driver.getTitle());
 driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
}

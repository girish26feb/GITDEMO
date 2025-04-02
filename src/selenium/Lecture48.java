package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture48 {

public static void main(String[] args) {
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		// Initially generally preferred get method to load properly
		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

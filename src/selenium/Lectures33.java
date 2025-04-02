package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Lectures33 {

public static void main(String[] args) {
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("girishkhandekar01@gmail.com");

		driver.findElement(By.name("inputPassword")).sendKeys("12345");

		driver.findElement(By.className("signInBtn")).click();
		
		//By Linktext
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//BY xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
		
		
		
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

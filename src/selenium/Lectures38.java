package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Lectures38 {

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
		
		//by indexing xpath if we used common attribute
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("girish@mail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
	
	   // by indexing css -hidden element hence here 3 inxpath was 2.
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("css@mail.com");
	
	//traversing 
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345678");
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

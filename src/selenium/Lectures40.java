package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Lectures40 {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");	
	
	driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul");

	driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
	
	driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	
	Thread.sleep(2000);
	
	
	System.out.println(driver.findElement(By.xpath("//p")).getText());
	
    Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in."); 
    
    //42
    
    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
    
    driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

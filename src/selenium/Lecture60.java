package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lecture60 {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Thread.sleep(2000);
	
	
	
	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	
	//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	
	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	
	
	//size of all checkboxes present in page.
	Thread.sleep(1000);
	
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Lectures39 {

public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("girishkhandekar01@gmail.com");

		driver.findElement(By.name("inputPassword")).sendKeys("12345");

		driver.findElement(By.className("signInBtn")).click();

		// By Linktext
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);

		// BY xpath
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");

		// by indexing xpath if we used common attribute

		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("girish@mail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		// by indexing css -hidden element hence here 3 inxpath was 2.
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("css@mail.com");

		// traversing
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345678");
		
	//	*******************************************************************************************************************//

		// Lecture 39-Regular expression and login

		driver.findElement(By.xpath("//div/button[2]")).click();

		System.out.println(driver.findElement(By.className("infoMsg")).getText());

		// Then try to click on "Go to login"

		driver.findElement(By.xpath("//div/button[1]")).click();
		Thread.sleep(1000);

		// put the correct username and password     ---------- css regular expression
		
		driver.findElement(By.cssSelector("input[id*='input']")).sendKeys("rahul");

		
		//passord -Xpath regular expression
		driver.findElement(By.xpath("//input[contains(@name,'input')]")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

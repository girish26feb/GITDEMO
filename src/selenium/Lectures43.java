package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Lectures43 {

public static  void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");	
	
	String password11=Lectures43.Getpassword(driver);
	
	driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul");

	driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(password11);
	
	driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
	
	Thread.sleep(2000);
	
	
	System.out.println(driver.findElement(By.xpath("//p")).getText());
	
    Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in."); 
    
    //42
    
    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
    
    driver.close();
}
	
	
	public static String Getpassword (WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();

		String abc = driver.findElement(By.className("infoMsg")).getText();

		// //Please use temporary password 'rahulshettyacademy' to Login.
		String[] array1 = abc.split("'");

		// rahulshettyacademy' to Login.

		String[] array2 = array1[1].split("'");

		String password = array2[0];

		return password;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


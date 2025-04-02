package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture53 {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	
	driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
	
	Thread.sleep(2000);
	int i=1;
	
	for ( i=1;i<5;i++) {
		
		
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		
		}
	Thread.sleep(2000);
	
	//validations
	
	System.out.println(driver.findElement(By.xpath("//div[text()='1 Adult']")).getText());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}

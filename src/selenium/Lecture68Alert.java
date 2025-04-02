package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture68Alert {

public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		


		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Girish");

		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
	
	
	//2nd popup
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

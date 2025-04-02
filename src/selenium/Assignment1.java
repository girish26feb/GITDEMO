package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

public static void main(String[] args) throws InterruptedException {
	
//	1.Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

		Thread.sleep(1000);

		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

		// Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected(),
		// "yes first checkbox checked it");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

//2-How to get the Count of number of check boxes present in the page

		List<WebElement> options = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

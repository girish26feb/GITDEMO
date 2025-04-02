package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle89_90 {

	
public static void main(String[] args) {

		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		String parentid = it.next();

		String childid = it.next();

		driver.switchTo().window(childid);

		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());

		String abc = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();

		String abc1 = abc.split("at")[1].trim().split(" ")[0];

		System.out.println(abc1);

		driver.switchTo().window(parentid);
		
		driver.findElement(By.xpath("//input[@id ='username']")).sendKeys(abc1);
		
		
		
		
		
		
		
		
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

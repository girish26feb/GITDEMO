package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHanling91_92 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

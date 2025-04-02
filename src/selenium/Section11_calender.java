package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Section11_calender {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		String monthnumber ="September";
		String date="25";
		String year="2024";
		
		String [] Expectedarray= {"9",date,year};
		
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup__input")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();

		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//abbr[text()='" + monthnumber + "']")).click();

		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		
		//Comparison output -for date selection
		List<WebElement> output=  driver.findElements(By.xpath("//input[contains(@class,'react-date-picker__inputGroup__input')]"));
		
		for (int i=0;i<output.size();i++) {
			output.get(i).getAttribute("value");
			
			Assert.assertEquals(output.get(i).getAttribute("value"),Expectedarray[i] );
			
			
		}
		System.out.println("done");
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

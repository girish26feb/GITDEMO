package section14;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilteringWebtable {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//1st 
		List<WebElement> webelements = driver.findElements(By.xpath("//tr/td[1]"));
		
		//2nd
		List<WebElement>webelement2=webelements.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(webelements.size(),webelement2.size());
		System.out.println("Test passed");
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

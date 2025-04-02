package Section15LatestFeature4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators02 {

	public static void main(String[] args) {


		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
	/*	//below locator
		WebElement gender=driver.findElement(By.cssSelector("[for='exampleFormControlSelect1']"));
		System.out.println(driver.findElement(with(By.tagName("option")).below(gender)).getText());*/
		
		
		//left of 
		WebElement icecream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecream)).click();
		
		//toRightof
		WebElement radio1 = driver.findElement(By.cssSelector("[id='inlineRadio1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio1)).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		

		
		
		
	//	WebDriverWait w =new WebDriverWait(driver,5);
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(2000);
		
		String[] itemtobeselected = { "Brocolli", "Cauliflower", "Cucumber", "Beetroot" };
        additem(driver, itemtobeselected);
		
			}
		public static void additem(WebDriver driver, String []itemtobeselected) {
			int j=0;
		
			List<String> itemlist = Arrays.asList(itemtobeselected);

			List<WebElement> products = driver.findElements(By.xpath("//div/h4[@class='product-name']"));

			for (int i = 0; i < products.size(); i++) {

				String[] product11 = products.get(i).getText().split("-");

				String product = product11[0].trim();

				if(itemlist.contains(product)) {
					
					//div[@class='product-action']/button
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					j++;
					if(j==4) {
						break;
					}
				}
		}	
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		
		
	
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		}	
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

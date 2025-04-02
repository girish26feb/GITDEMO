package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Chapter8FunctionalTest {
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

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

package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section11_LimitingWebdriver {
public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");

		int a = driver.findElements(By.tagName("a")).size();

		System.out.println(a);

		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));// Limitimg

		System.out.println(footer.findElements(By.tagName("a")).size());

		WebElement footercolumn1 = footer.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul")); // Again
																												// Limiting

		System.out.println(footercolumn1.findElements(By.tagName("a")).size());

		// Added for loop to get all link open in separate window

		for (int i = 1; i < footercolumn1.findElements(By.tagName("a")).size(); i++) {

			String clickandopen = Keys.chord(Keys.CONTROL, Keys.ENTER);

			footercolumn1.findElements(By.tagName("a")).get(i).sendKeys(clickandopen);
			Thread.sleep(2000);
		}
		
		//To handles multiple windows and print title of page
		Set<String> abc = driver.getWindowHandles();
		Iterator itr = abc.iterator();
		
		while(itr.hasNext()) {
			driver.switchTo().window((String) itr.next());
			System.out.println(driver.getTitle());
		}
	
	
	
	
	
}}

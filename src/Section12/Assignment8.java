package Section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("#autocomplete")).click();
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("IND");

		Thread.sleep(1000);

		// selecting element from Auto suggestive dropdown

		List<WebElement> Elements = driver.findElements(By.xpath("//li[contains(@class,'ui-menu-item')]"));

		for (WebElement e : Elements) {
			if (e.getText().equalsIgnoreCase("INDIA")) {

				e.click();
			}

		}
		System.out.println("pass the test");

	}

}

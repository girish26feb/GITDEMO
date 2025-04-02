package section14;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebtableSorting {

	public static void main(String[] args) {
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// step1-click on column
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();

		// step2 -capture all webelement into list
		List<WebElement> weblements = driver.findElements(By.xpath("//tr/td[1]"));

		// step3-capture the text of all webelements in original form
		List<String> original = weblements.stream().map(s -> s.getText()).collect(Collectors.toList());

		// step4-sort on original list
		List<String> sorted = original.stream().sorted().collect(Collectors.toList());

		// step5-compare original vs sorted
		Assert.assertTrue(original.equals(sorted));
		System.out.println("pass the test");

	}

}

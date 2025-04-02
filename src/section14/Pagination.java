package section14;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// step1-click on column
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();

		// step2 -capture all webelement into list--copy from previous Lecture ---5
		// webelement
		List<WebElement> webelements = driver.findElements(By.xpath("//tr/td[1]"));

		// customization starts-filter Rice
		List<String> price;
		do {
			List<WebElement> webelements11 = driver.findElements(By.xpath("//tr/td[1]"));
		 price = webelements11.stream().filter(s -> s.getText().contains("Rice")).map(s -> getpriceveggie(s))
				.collect(Collectors.toList());
		price.forEach(p -> System.out.println(p));
		
		if (price.size() < 1) {
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}}while (price.size() < 1);

	}

	private static String getpriceveggie(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
	
		


package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section11_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement abc = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
		

		abc.click();// 1

		Thread.sleep(2000);
		// 2 -Grab the label of selected checkbox
		String variable = driver.findElement(By.id("checkBoxOption3")).getText();
		System.out.println("print variable");
		System.out.println(variable);

		// 3-select option
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		Select select = new Select(dropdown);
		select.selectByVisibleText("Option3");

		// 4-Enter text in editbox
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Option3");

		// 5-click alert and verify the text contain option3
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

		Thread.sleep(1000);

		String alertmess = driver.switchTo().alert().getText();
		System.out.println(alertmess);

		if (alertmess.contains("Option3")) {
			System.out.println("option3 is available -Verified");
		}
		

	}

}

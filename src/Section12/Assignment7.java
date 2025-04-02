package Section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1st scenarion-No of rows
		
		List<WebElement> rowcount = driver.findElements(By.cssSelector(".table-display tr"));

		int Z = rowcount.size();
		System.out.println(Z);
		
		
		//scemario2-No of column
		List<WebElement> Columncount = driver.findElements(By.cssSelector(".table-display tr:nth-child(2) td"));

		int Zz = Columncount.size();
		System.out.println(Zz);
		
		//scenario3-2nd row content
		List<WebElement> rowcontent = driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));

		String s = "";

		for (int i = 0; i < rowcontent.size(); i++) {
			s = s+" "+rowcontent.get(i).getText();
			

		}
		System.out.println(s);
		
		
		
		

	}

}

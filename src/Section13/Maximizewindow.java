package Section13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximizewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");

	}

}

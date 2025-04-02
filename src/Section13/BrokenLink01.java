package Section13;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink01 {

	public static void main(String[] args) throws IOException, IOException {
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String URL = driver.findElement(By.cssSelector("a[href='https://rahulshettyacademy.com/brokenlink']"))
				.getAttribute("href");

		// step2-java method
		HttpURLConnection conn = (HttpURLConnection) new URL(URL).openConnection();

		conn.setRequestMethod("HEAD");
		conn.connect();
		int code = conn.getResponseCode();
		System.out.println(code);
		
		
		
		
		
		
		
		
		

	}

}

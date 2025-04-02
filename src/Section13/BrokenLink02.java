package Section13;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLink02 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException,IOException {
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert s=new SoftAssert();
		List<WebElement> webelements = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for (WebElement wb : webelements) {
			String URL = wb.getAttribute("href");

			HttpURLConnection con = (HttpURLConnection) new URL(URL).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int Z = con.getResponseCode();
			System.out.println(Z);
			if(Z>400) {
				s.assertTrue(false, "The broken link is:"+URL+""+"Responsecode is:"+Z);
			}}
s.assertAll();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}



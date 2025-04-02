package Section15LatestFeature4;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingMultipleTabwindow {

	public static void main(String[] args) {
		
		
		//Navigate to "https://rahulshettyacademy.com/angularpractice/" and fill the name field with the first course name available at https://rahulshettyacademy.com
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		//open new window
		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parenid=it.next();
		String childid=it.next();
		
		driver.switchTo().window(childid);
		driver.get("https://rahulshettyacademy.com/");
		
		String course1=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		//switch to parent
		driver.switchTo().window(parenid);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(course1);
		
		System.out.println("testpass");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

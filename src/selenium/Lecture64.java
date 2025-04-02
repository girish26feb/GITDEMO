package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lecture64 {
	
	//63=Select current date from calender

public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/search.aspx");
		/*Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[text()=' Pune (PNQ)']")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[text()=' Mumbai (BOM)'])[2]")).click();
	
	    driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();*/
	
// new code to check enabled or not	
	    
	//System.out.println(driver.findElement(By.xpath("//input[@id='custom_date_picker_id_2'][1]")).isEnabled());    
	    
	
		
driver.findElement(By.xpath("//label[@for='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']")).click();
	    
	if (driver.findElement(By.xpath("//div[@id='marketDate_2']")).getAttribute("style").contains("1"))   {
		
		System.out.println("it's enabled");
		Assert.assertTrue(true);
		
	} 
	    
	    
	    
	    
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

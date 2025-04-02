package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture56 {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://book.spicejet.com/");
	
	
	Thread.sleep(2000);
	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[text()=' Pune (PNQ)']")).click();
	
	//1st window close then only second appear.
	//whereever dynamic dropdown came then we have to use indexing

	
	//driver.findElement(By.xpath("(//a[text()=' Mumbai (BOM)'])[2]")).click();
	
driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[text()=' Mumbai (BOM)']")).click();	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}

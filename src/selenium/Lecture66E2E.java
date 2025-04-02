package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lecture66E2E {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/search.aspx");

		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"))
				.click();

		driver.findElement(By.xpath("//a[text()=' Pune (PNQ)']")).click();

		driver.findElement(By.xpath("(//a[text()=' Mumbai (BOM)'])[2]")).click();
	
	//present calender date
	
		Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
	
	Thread.sleep(2000);
	
	//we have to check return date disabled
/*
		if (driver.findElement(By.xpath("//div[@id='marketDate_2']")).getAttribute("style").contains("0.5")) {
			System.out.println("is disabled");
			Assert.assertTrue(true);
		}
	*/
	
	driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
	
	
	
	
	
	
	
	
	
	
}}

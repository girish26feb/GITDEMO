package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Assignment5_Frame {
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver,chrome.driver", "D:\\seleniummaterial\\chromedriver-win64\\.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

		System.out.println(driver.findElements(By.tagName("frame")).size());

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));

		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}

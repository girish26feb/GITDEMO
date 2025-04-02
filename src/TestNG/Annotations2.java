package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations2 {

	@BeforeSuite
	public void bfsuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void AFsuite() {
		System.out.println("After suite");
	}
	
	@Test
	public void method11() {
		System.out.println("Method11");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

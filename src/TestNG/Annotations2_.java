package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations2_ {

	@Test
	public void method12() {
		System.out.println("Method12");
	}
	
	@Test
	public void method13() {
		System.out.println("Method13");
	}
	
	@Test
	public void method14() {
		System.out.println("Method14");
	}
	@BeforeMethod
	public void BFmethod() {
		System.out.println("Beforemethod");
	}
	@AfterMethod
	public void AFmethod() {
		System.out.println("Aftermethod");
	}
	@BeforeClass
	public void BFclass() {
		System.out.println("Beforeclass");
	}
	@AfterClass
	public void AFclass() {
		System.out.println("Afterclass");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

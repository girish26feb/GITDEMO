package TestNG;

import org.testng.annotations.Test;

public class HelperAttribute {

@Test(enabled=false)
public void Method11(){
	System.out.println("method11");
}	
	
	
@Test
public void Method12(){
	System.out.println("method12");
}	
	
@Test(dependsOnMethods= {"Method14"})
public void Method13(){
	System.out.println("method13");
}	
	
@Test(timeOut=4000)
public void Method14(){
	System.out.println("method14");
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

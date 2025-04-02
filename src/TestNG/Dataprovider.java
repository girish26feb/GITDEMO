package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	

@Test(dataProvider="getdata")	
public void method11(String username,String password) {
	
System.out.println(username);	
System.out.println(password);	
}	
	
	
@Test	
public void method12() {
	
System.out.println("Method12");	
}	
		
@DataProvider
public Object[][] getdata() {
	
Object[][]data =new Object [3][2];	
	
//1st set of data
data[0][0]="username1";
data[0][1]="password1";	
	
data[1][0]="username2";
data[1][1]="password2";	

data[2][0]="username3";
data[2][1]="password3";	
	
return data;	
}
}

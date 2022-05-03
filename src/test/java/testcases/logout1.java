package testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.logout2;

public class logout1 extends TestBase{

	logout2 logout;

	@BeforeTest
	public void setup() throws MalformedURLException {
		setUp();
		logout=new logout2(driver);
	}
	

	@Test(priority = 1)
	public void logout() throws InterruptedException {
		logout.logout();
		
		
	}
	
	
	
}

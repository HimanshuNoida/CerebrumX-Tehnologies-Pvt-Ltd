package testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.Common_login;

public class Commonlogin extends TestBase {
	static Common_login ccommonlogin;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		setUp();
		ccommonlogin = new Common_login(driver);
		
		
	}
	@Test
	public static  void signin() {
		Common_login.ussername_signin();
		
		
	}

}

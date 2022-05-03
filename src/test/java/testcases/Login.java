package testcases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.loginscreen;

public class Login extends TestBase {

	loginscreen login;
	
	@BeforeTest
	public  void init() throws MalformedURLException {
		setUp();
		login=new loginscreen(driver);
	}
	
	
	@Test
	public void loginTest() throws InterruptedException {
	
			System.out.println("Yh");
			login.login();
			System.out.println("q");
		  // Extentlistner.extentTest.get().log(Status.INFO,"Login succesfull");
		}

	
	
	@AfterTest
	public void quitDriver() {
		quit();
		
	}

}

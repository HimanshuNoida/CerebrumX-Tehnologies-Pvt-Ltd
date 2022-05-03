package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;

import screens.Afterloginscreen;
import screens.Common_login;
import screens.loginscreen;
import screens.logout2;

public class Afterscreenlogin extends TestBase {

	Afterloginscreen afterscreen;
	logout2 logout;
	loginscreen login;
	
	@Test
	public void setup() {
		setup();
		afterscreen = new Afterloginscreen(driver);
		login=new loginscreen(driver);
		logout=new logout2(driver);
		
	}

	@Test(priority = 1)
	public void Consent() throws InterruptedException {

		afterscreen.Addconsent();
    	
		Thread.sleep(5000);
		Commonlogin.signin();
		
		Common_login.approve();
		Thread.sleep(2000);
	//	WebElement toastView = driver.findElement(MobileBy.xpath("//android.widget.Toast[1]"));

	//	String text = toastView.getAttribute("toastView");
	//	System.out.println(text);
		
	
	}
	@Test(priority = 2,enabled=true)
	public void logout() throws InterruptedException {
		Thread.sleep(4000);
		logout.logout();
		Thread.sleep(7000);
		
		login.login();
		
		Thread.sleep(6000);
		
		
	}
	
	
	@Test(priority = 3,enabled=true)
	public void addconsent() throws InterruptedException {
		afterscreen.consentlink();
	}
	
	@Test(priority = 4,enabled=true)
	public void revoke() throws InterruptedException {

		afterscreen.revokeconsent();

	}
	
	
	
	
	
	@Test(priority = 5,enabled=false)
	public void verifyConsent() throws InterruptedException {
		Thread.sleep(4000);
		afterscreen.Verifyconsent();
		Thread.sleep(4000);
		 Commonlogin.signin();
		Thread.sleep(4000);
	WebElement checkbox1=driver.findElement(By.className("android.widget.CheckBox"));
	
	 WebElement checkbox2=checkbox1.findElement(By.className("android.view.ViewGroup"));
	 checkbox2.findElement(By.className("android.view.ViewGroup")).click();
		Common_login.approve();
	 
		

	}
	
	
	
	
	
	
	

	
	
	
	

	
	

	}
	
	
	



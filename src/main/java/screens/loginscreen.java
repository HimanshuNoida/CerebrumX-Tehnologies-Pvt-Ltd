package screens;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


import base.ScreenBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginscreen extends ScreenBase {

	@AndroidFindBy(xpath = "*//*[@text='Email']")
	public WebElement username;

	@AndroidFindBy(xpath = "*//*[@text='Password']")
	public WebElement password;

	@AndroidFindBy(xpath = "*//*[@text='Sign In']")
	public WebElement sign;


	public loginscreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	
	public Afterloginscreen login() throws InterruptedException {
		Thread.sleep(3000);
		String loginusername = "jitender.tanwar@cerebrumx.ai";
		String loginpassword = "Welcome#321";
		username.sendKeys(loginusername);
		password.sendKeys(loginpassword);
		sign.click();
		
		return new Afterloginscreen(driver);
//		Extentlistner.extentTest.get().log(Status.INFO, "Enter the username"+" "+loginusername);
//		Extentlistner.extentTest.get().log(Status.INFO, "Enter the password"+" "+loginpassword);
//		Extentlistner.extentTest.get().log(Status.INFO, "Click sigin");
//		Extentlistner.extentTest.get().log(Status.INFO, "Login succesfull");
		

	}

}

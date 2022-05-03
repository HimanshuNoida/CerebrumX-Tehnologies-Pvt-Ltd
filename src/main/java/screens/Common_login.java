package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.ScreenBase;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Common_login extends ScreenBase {
	
	
	@AndroidFindBy(xpath="*//*[@text='Email']")
	public static  WebElement ussername; 
	
	
	@AndroidFindBy(xpath="*//*[@text='Password']")
	public static WebElement password; 
	
	@AndroidFindBy(xpath ="*//*[@text='SIGN IN']")
	public static WebElement sign;
	
	@AndroidFindBy(xpath ="*//*[@text='APPROVE']")
	public static WebElement approve;

	

	@AndroidFindBy(className="android.widget.TextView")
	public WebElement OOEM;


	@AndroidFindBy(className="android.widget.TextView")
	public WebElement Honda;
	
	

	@AndroidFindBy(className="android.widget.ImageView")
	public WebElement ImangeView;
	
	
	//following-sibling setting up data
	//following-sibling login  jitender
	//following-sibling would like to access
   //following -sibling 
//following sibling
	
	
		
	
	
	
	public Common_login(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	public static  void ussername_signin() {
	//	Extentlistner.extentTest.get().log(Status.INFO, "Login by the OEM Provider");
		ussername.sendKeys("12345@sgmail.com");
	//	Extentlistner.extentTest.get().log(Status.INFO, "Enter the username"+" "+"12345@sgmail.com");
		password.sendKeys("12345");
//		Extentlistner.extentTest.get().log(Status.INFO, "Enter the password"+" "+"12345");
		sign.click();
//		Extentlistner.extentTest.get().log(Status.INFO, "click the signin");
		String Honda=driver.findElement(By.className("android.widget.TextView")).getText();
		System.out.println("The logo is getting displayed");
		WebElement image=driver.findElement(By.xpath("//android.widget.ImageView[@class='android.widget.ImageView']"));
		System.out.println("image is getting displayed");
	/*	String settingdata=driver.findElement(By.xpath("//android.widget.ImageView[@class='android.widget.ImageView']']"+"/following-sibling::android.widget.TextView")).getText();
	    System.out.println(settingdata);
	    String userdata=driver.findElement(By.xpath("(//android.widget.TextView[@class='android.widget.TextView']"+"/following-sibling::android.widget.TextView)[3]")).getText();
	    System.out.println(settingdata);
	    String userddata=driver.findElement(By.xpath("//android.widget.TextView[@class='android.widget.TextView']"+"/following-sibling::android.widget.TextView")).getText();
	    System.out.println(settingdata);
	    String text=  driver.findElement(By.xpath("(//android.widget.TextView)[6]")).getText();
	  System.out.println(text);
	  */
		approve();
		
		
	  
	    
	}
	
public static void approve() {
	approve.click();
}
	
	
}

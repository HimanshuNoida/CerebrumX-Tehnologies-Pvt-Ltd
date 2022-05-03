package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class logout2 extends ScreenBase {

	@AndroidFindBy(className = "android.widget.TextView")
	public WebElement logout;
	
	
	public logout2(io.appium.java_client.AppiumDriver<MobileElement> driver) {
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	

	
	public  void logout() throws InterruptedException {
		
		logout.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("*//*[@text='Logout']")).click();
//		Extentlistner.extentTest.get().log(Status.INFO,"logou successfull performed");
    }
}
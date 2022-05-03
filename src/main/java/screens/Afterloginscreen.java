package screens;

import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.ScreenBase;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class Afterloginscreen extends ScreenBase{

	public static String vehcile_registration_number2 = "HR1qa1";
	@AndroidFindBy(xpath = "*//*[@text='HR1qa1']")
	public WebElement vehcile_registration_number1;

	String compareconsent;

	@AndroidFindBy(xpath = "*//*[@text='CONSENT']")
	public WebElement conssentlink;

	
	@AndroidFindBy(xpath = "*//*[@text='Vehicle Profile']")
	public String cconsents;
	
	
	String consents="Vehicle Profile";
	
	
	@AndroidFindBy(xpath = "*//*[@text='ADD CONSENT']")
	public WebElement addconssentlink;

	@AndroidFindBy(className = "android.widget.Button")
	public WebElement After_addconssentlink;

	@AndroidFindBy(xpath = "*//*[@text='OFF']")
	public WebElement Consent_ON_OFF;

	@AndroidFindBy(xpath = "*//*[@text='ON']")
	public WebElement Consent_ON;

	@AndroidFindBy(xpath = "*//*[@text='UPDATE CONSENT']")
	public WebElement updateCosnent;

	@AndroidFindBy(xpath = "*//*[@text='Model Number']")
	public WebElement modelnumber;

	@AndroidFindBy(xpath = "*//*[@text='Please select...']")
	public WebElement OemLink;

	@AndroidFindBy(xpath = "*//*[@text='Vehicle Registration Number']")
	public static  WebElement vehcile_registration_number;

	@AndroidFindBy(xpath = "*//*[@text='Vehicle Profile']")
	public WebElement Vehicle_Profile;

	@AndroidFindBy(xpath = "*//*[@text='Fleet Management']")
	public WebElement fleetManagement;

	String text2 = "Insurance";

	@AndroidFindBy(xpath = "*//*[@text='REVOKE CONSENT']")
	public WebElement revokeconsnet;

	@AndroidFindBy(xpath = "*//*[@text='Select Vehicle']")
	public static WebElement selectVehicle;

	@AndroidFindBy(xpath = "*//*[@text='REVOKE CONSENT']")
	public static WebElement revokeConsent;

	
	
	public Afterloginscreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	

	public Common_login Addconsent() throws InterruptedException {

		System.out.println("12");
		String mmodelnumber = "DLQQ1s21421";
		String OEM = "OEM";
		Thread.sleep(3000);

		conssentlink.click();
	//	Extentlistner.extentTest.get().log(Status.INFO, "click the consent link");
		Thread.sleep(5000);
		addconssentlink.click();
		Thread.sleep(5000);
	//	Extentlistner.extentTest.get().log(Status.INFO, "click the Addconsent link");
		modelnumber.click();

		Thread.sleep(3000);
		modelnumber.sendKeys(mmodelnumber);
//		Extentlistner.extentTest.get().log(Status.INFO, "Enter the Model number"+" "+mmodelnumber);
		hideKeyboard();
		Thread.sleep(4000);
		OemLink.click();
		Thread.sleep(3000);
		OemLink.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("*//*[@text='" + OEM + "']")).click();
	//	Extentlistner.extentTest.get().log(Status.INFO, "input the OEM "+" "+OEM);
		Thread.sleep(5000);
		vehcile_registration_number.click();
		vehcile_registration_number.sendKeys(vehcile_registration_number2);
	//	Extentlistner.extentTest.get().log(Status.INFO, "input the vehicle registration  "+" "+vehcile_registration_number2);
		hideKeyboard();
		Thread.sleep(5000);
		WebElement scroll = driver.findElement(By.xpath("(//android.widget.ScrollView)[2]"));
		List<WebElement> scroll3 = scroll.findElements(By.className("android.widget.ScrollView"));
		int x = scroll3.size();
		System.out.println(x);

		WebElement scroll2 = driver.findElement(By.className("android.widget.ScrollView"));
		WebElement scroll1 = scroll2.findElement(By.className("android.widget.ScrollView"));
		WebElement scroll14 = scroll1.findElement(By.className("android.view.ViewGroup"));
		List<WebElement> scroll5 = scroll14.findElements(By.className("android.widget.TextView"));
		int size1 = scroll5.size();
		System.out.println(size1);
		Thread.sleep(3000);
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
			try {

				for (int u = 0; u <= 1; u++) {
					String text = scroll5.get(u).getText();
					if (text.equals(text2)) {
						int q = 1;
						scroll5.get(q).click();
	//					Extentlistner.extentTest.get().log(Status.INFO, "click the"+ " "+text2+" category");
						break;
					}

				}
				if (Consent_ON_OFF.isDisplayed()) {
					break;

				}
			} catch (Exception e) {
				System.out.println("element not found");
			}

		}

	driver.findElement(By.xpath("*//*[@text='"+consents+"']/following-sibling::android.widget.Switch")).click();;
//	Extentlistner.extentTest.get().log(Status.INFO, "click the"+" "+consents );
	Thread.sleep(5000);
	TouchAction t6=new TouchAction(driver);
	TouchAction action1=new TouchAction((MobileDriver)driver);
	action1.tap(PointOption.point(527,1869)).perform();
	Thread.sleep(9000);
		
		
		return new Common_login(driver);
	}

	

	public Common_login revokeconsent() throws InterruptedException {
		
	
	
		revokeconsnet.click();
//		Extentlistner.extentTest.get().log(Status.INFO, "click revoke" );
		// String revoke="Up12q1256";
		Thread.sleep(3000);
		selectVehicle.click();
		
		Thread.sleep(6000);
		// selectVehicle.sendKeys(vehcile_registration_number2);

		Thread.sleep(3000);

		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ vehcile_registration_number2 + "\").instance(0))");
		// scroll(By.xpath("*//*[@text='Up12q1256']"), driver);

		Thread.sleep(5000);

		vehcile_registration_number1.click();
//		Extentlistner.extentTest.get().log(Status.INFO, "Select vehcile registration number  "+vehcile_registration_number2 );
		Thread.sleep(5000);

		Thread.sleep(4000);
		TouchAction t7 = new TouchAction(driver);
		TouchAction action2 = new TouchAction((MobileDriver) driver);
		action2.tap(PointOption.point(523, 1006)).perform();
//		Extentlistner.extentTest.get().log(Status.INFO, "click submit" );
		return new Common_login(driver);
	}

	public Common_login Verifyconsent() throws InterruptedException {
		Thread.sleep(5000);
		updateCosnent.click();
		Thread.sleep(3000);
		selectVehicle.click();
		Thread.sleep(3000);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ vehcile_registration_number2 + "\").instance(0))");

		Thread.sleep(50000);
		vehcile_registration_number1.click();
		Thread.sleep(5000);
		WebElement scroll2 = driver.findElement(By.className("android.widget.ScrollView"));
		WebElement scroll1 = scroll2.findElement(By.className("android.widget.ScrollView"));
		WebElement scroll14 = scroll1.findElement(By.className("android.view.ViewGroup"));
		List<WebElement> scroll5 = scroll14.findElements(By.className("android.widget.TextView"));
		int size1 = scroll5.size();
		System.out.println(size1);
		Thread.sleep(3000);
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
			try {

				for (int u = 0; u <= 1; u++) {
					String text = scroll5.get(u).getText();
					if (text.equals(text2)) {
						int q = 1;
						scroll5.get(q).click();
		//				Extentlistner.extentTest.get().log(Status.INFO, "click the"+ " "+text2);
						break;
					}

				}
				if (Consent_ON_OFF.isDisplayed()) {
					break;

				}
			} catch (Exception e) {
				System.out.println("element not found");
			}

		}

	driver.findElement(By.xpath("*//*[@text='"+consents+"']/following-sibling::android.widget.Switch")).click();;
//	Extentlistner.extentTest.get().log(Status.INFO, "click the"+" "+consents );
		Thread.sleep(3000);
/*
		System.out.println("compareconsnent=" + compareconsent);

		String compareconsent1 = driver.findElement(By.xpath("*//*[@text='ON']")).getText();
		Thread.sleep(3000);
		Assert.assertEquals(compareconsent, compareconsent1, "The consent is at ON state");
*/
		
		Thread.sleep(4000);
		TouchAction t7 = new TouchAction(driver);
		TouchAction action2 = new TouchAction((MobileDriver) driver);
		action2.tap(PointOption.point(510, 1959)).perform();
//		Extentlistner.extentTest.get().log(Status.INFO, "Consent re-aaded now after revoked performed" );
	   
	   
		return new Common_login(driver);

	}

	public void consentlink() throws InterruptedException {
		Thread.sleep(5000);
		conssentlink.click();

	}

	public Common_login close() {

		WebElement close = driver.findElement(By.className("android.widget.FrameLayout"));
		WebElement close1 = close.findElement(By.className("androidx.viewpager.widget.ViewPager"));
		WebElement close4 = close1.findElement(By.className("android.widget.FrameLayout"));
		WebElement close5 = close4.findElement(By.className("android.view.ViewGroup"));
		List<WebElement> close6 = close5.findElements(By.className("android.widget.Button"));
		int size = close6.size();
		System.out.println("size=" + size);
		for (int y = 1; y <= size; y++) {
			if (y == 1) {

				WebElement close8 = close6.get(y);
				close8.findElement(By.className("android.widget.TextView")).click();
			}
		}
		return new Common_login(driver);

	}

	public Common_login verifyAfterrevoke() throws InterruptedException {
		Thread.sleep(5000);
		updateCosnent.click();
		Thread.sleep(3000);
		selectVehicle.click();
		Thread.sleep(3000);
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ vehcile_registration_number2 + "\").instance(0))");

		Thread.sleep(5000);
		vehcile_registration_number1.click();
		Thread.sleep(5000);
		WebElement scroll = driver.findElement(By.className("android.widget.ScrollView"));
		WebElement scroll1 = scroll.findElement(By.className("android.widget.ScrollView"));
		WebElement scroll14 = scroll1.findElement(By.className("android.view.ViewGroup"));
		List<WebElement> scroll15 = scroll14.findElements(By.className("android.widget.TextView"));

		int size = scroll15.size();
		System.out.println(size);
		Thread.sleep(3000);

		for (int i = 0; i < 20; i++) {
			System.out.println(i);
			try {

				scroll15.get(0).click();
				;
				System.out.println(Consent_ON_OFF.getText());
				if (Consent_ON_OFF.isDisplayed()) {
					break;
				}

			} catch (Exception e) {
				System.out.println("element not found");
			}

		}

		String compareconsent1 = driver.findElement(By.xpath("*//*[@text='ON']")).getText();
		Assert.assertEquals(compareconsent, compareconsent1, "The consent of registration number is at OFF state");
		return new Common_login(driver);
	}

	public void addconsent() throws InterruptedException {
		Consent_ON.click();
	}

}
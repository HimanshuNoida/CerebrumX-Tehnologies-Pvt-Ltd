package screens;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Dashboard extends ScreenBase {

	@AndroidFindBy(xpath = "*//*[@text='DASHBOARD']")
	public static WebElement dashboard;

	public Dashboard(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void dashboard() throws InterruptedException {
		Thread.sleep(4000);
	dashboard.click();
	Thread.sleep(3000);
		registtra();
	}

	public void registtra() throws InterruptedException {
		Thread.sleep(4000);
		WebElement registrationnumber = driver.findElement(By.className("androidx.recyclerview.widget.RecyclerView"));
		WebElement registrationnumber1 = registrationnumber.findElement(By.className("android.widget.FrameLayout"));

		WebElement registrationnumber4 = registrationnumber1.findElement(By.className("android.widget.ScrollView"));
		WebElement registrationnumber5 = registrationnumber4
				.findElement(By.xpath("//android.widget.ScrollView[contains(@class,'android')]"));// ---
		WebElement registrationnumber6 = registrationnumber5.findElement(By.className("android.view.ViewGroup"));
		List<WebElement> text = registrationnumber6.findElements(By.className("android.widget.TextView"));
		// System.out.println(text);

		// List<WebElement>
		// WebElement
		// registrationnumber6=registrationnumber5.findElement(By.className("android.view.ViewGroup"));//---

		// List<WebElement>
		// registrationnumber7=registrationnumber5.findElements(By.className("android.view.ViewGroup"));
		int size = text.size();
		WebElement q;
		System.out.println(size);
		for (int y = 0; y <= size - 1; y++) {
			String text1 = text.get(y).getText();
			System.out.println(text1);

		}
		/*
	for (WebElement webElement : x) {
		

			
			WebElement y=webElement.findElement(By.xpath("//android.view.ViewGroup[contains(@class,'android')]"));
	List<WebElement>text2=	y.findElements(By.className("android.widget.TextView"));
		System.out.println(text2);
		int z=text2.size();
		for(int i=0;i<=z-1;i++) {
			String teext=text2.get(i).getText();
			Thread.sleep(3000);	
			if(text.contains(Afterloginscreen.vehcile_registration_number)) {
				int l=i++;
				text2.get(l).click();
				
				break;
			}
		//	System.out.println(teext);
		}
	
		}
	*/
		
		
		
		List<MobileElement> x = driver.findElements(By.xpath(
				"*//*[@text='vin420']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup"));
		int c = x.size();
		int o=0;
		int j=0;
		int p=0;
		String reg="DLQa121212";
		 int u = 0;
	for (WebElement webElement1 : x) {
  Thread.sleep(4000);
    
    u=u+1;
		if(o==1) {
			break;
		}
		System.out.println("u="+u);
		
		if(u==8) {
			scrollUp(1, driver);
			x = driver.findElements(By.xpath(
					"*//*[@text='vin420']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup"));
		}
			WebElement y=webElement1.findElement(By.className("android.view.ViewGroup"));
		
		
		List<WebElement>text2=y.findElements(By.className("android.widget.TextView"));
	
		System.out.println(text2);
		int z=text2.size();
		for(int i=0;i<=z-1;i++) {
			String teext=text2.get(i).getText();
			Thread.sleep(3000);	
			System.out.println(teext);
			System.out.println("hi");
			Thread.sleep(3000);	
			String teext3;
			System.out.println("hi");
			
			if(teext.equalsIgnoreCase("UP1234123")) {
			     i++;
				WebElement t=text2.get(i);
				
				Thread.sleep(3000);	
				t.click();
				 o=1;
				break;
				
				
			}
			
		
	//		System.out.println(teext);
		}
		
	}
		
	
			
		/*
		 * 	System.out.println("hi");
		((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ Afterloginscreen.vehcile_registration_number2 + "\").instance(0))");
		 * 
		 * 
		 * 
		 
		 * 
		 * for(int y=0;y<=1-1;y++) {
		 * 
		 * WebElement s=text.get(y); System.out.println(s); System.out.println("y="+y);
		 * WebElement textxt= s.findElement(By.className("android.view.ViewGroup"));
		 * WebElement Text=textxt.findElement(By.className("android.view.ViewGroup"));
		 * List<WebElement>textxta=
		 * driver.findElements(By.className("android.widget.TextView")); int w=
		 * textxta.size(); for(int c=0;c<=w-1;c++) {
		 * 
		 * System.out.println( textxta.get(c).getText()); break; } } //
		 * System.out.println(textxta); } }
		 * 
		 * /* WebElement
		 * registrationnumber6=registrationnumber5.findElement(By.className(
		 * "android.widget.ScrollView")); WebElement
		 * registrationnumber7=registrationnumber5.findElement(By.className(
		 * "android.view.ViewGroup"));
		 * List<WebElement>registrationnumber8=registrationnumber7.findElements(By.
		 * className("android.view.ViewGroup"));
		 * 
		 * //System.out.println(registrationnumber8); WebElement
		 * registrationnumber8=registrationnumber7.findElement(By.className(
		 * "android.view.ViewGroup")); List<WebElement>
		 * registrationnumber9=registrationnumber8.findElement(By.className(
		 * "android.widget.TextView")); List<WebElement>
		 * registrationnumber9=registrationnumber9.findElements(By.className(
		 * "android.widget.TextView")); int r=registrationnumber8.size(); for(int
		 * i=0;i<=r-1;i++) { String text=registrationnumber8.get(i).getText();
		 * System.out.println(text);
		 * 
		 * }
		 */
		// }

	}
public static  void scrollUp(int howManySwipes,AppiumDriver<MobileElement> driver) {
		
		org.openqa.selenium.Dimension size=driver.manage().window().getSize();
		//calculate coordinates for vertical size
		int startVerticalY=(int)(size.height*0.8);
		int endverticalY=(int)(size.height*0.21);
		int startverticalx=(int)(size.width/2.1);
		try {
			for(int i=1;i<=howManySwipes;i++) {
				new TouchAction(driver).press(PointOption.point(startverticalx,startVerticalY))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(startverticalx,endverticalY)).release().perform();
			}
		}catch (Exception e) {
			// TODO: handle exception
			
			
		}
		
	}

}
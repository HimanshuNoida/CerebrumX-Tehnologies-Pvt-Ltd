package base;

import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utilities.AppiumServer;
import utilities.CommonUtils;

public class TestBase {

	public AppiumDriver<MobileElement> driver;
	public static String loadPropertyFile = "Android_cerebrumx_properties";
	public static Logger log = Logger.getLogger(TestBase.class);

	public void setUp() throws MalformedURLException  {
		if (driver == null) {
			PropertyConfigurator
					.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\log4j.properties");
			if (loadPropertyFile.startsWith("Android_")) {
				AppiumServer.start();
				log.info("Appium server started");
				CommonUtils.loadAndroidConfProp(loadPropertyFile);
				log.info(loadPropertyFile+" properties file loaded !!!" );
				CommonUtils.setAndroidCapabilities();
				
					driver=CommonUtils.getAndroidDriver();
			
					
			
			} else if (loadPropertyFile.startsWith("IOS_")) {

			}
		}

	}

	public void quit() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		log.info("Test case execution completed");
		AppiumServer.stop();
		log.info("Appium server stopped !!!");
	}
}

package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import screens.Dashboard;

public class Dasboard extends TestBase{
	Dashboard dash;
	   
	@BeforeTest
	public void setup() {
		setup();
		dash=new Dashboard(driver);
	
	}
	
	@Test
	public void dasgboard() throws InterruptedException {
		dash.dashboard();
	}

}

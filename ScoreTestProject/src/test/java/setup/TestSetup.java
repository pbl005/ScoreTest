package setup;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import io.appium.java_client.AppiumDriver;

public class TestSetup {
	
	public static AppiumDriver driver;
	
	public TestSetup(AppiumDriver driver) {
		TestSetup.driver = driver;
	}
	
	@BeforeSuite
	public void setUp() throws MalformedURLException, InterruptedException {
        DeviceSetup.prepareDevice();
    }
	
	@AfterSuite
	public void tearDown() {
		driver.close();
	}
	
	
}

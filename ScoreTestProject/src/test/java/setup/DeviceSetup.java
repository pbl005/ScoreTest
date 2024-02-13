package setup;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;


//Class initializes Appium driver
public class DeviceSetup extends TestSetup {
	
	public DeviceSetup(AppiumDriver driver) {
		super(driver);
	}

	//Set desired capabilities for ios device
	static AppiumDriver prepareDevice() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        
        dc.setCapability("platformName", "iOS");
		dc.setCapability("deviceName", "iphone 15");
		dc.setCapability("platformVersion", "17.2.1");
		dc.setCapability("udid", "00118120-005C8D600268200B");
		dc.setCapability("appPackage", "iphone.thescore.com");
		dc.setCapability("automationName", "XCUITest");
        dc.setCapability("platformName", "10.2");
        dc.setCapability("appium-version", "1.7.2");
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
       
        driver = new IOSDriver(url, dc);
        
        return driver;
   }
}

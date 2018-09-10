package hindu;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class StartUpComponents {
	
	WebDriver driver = null;
	DesiredCapabilities caps;
	
	
	public StartUpComponents() {
		initCapabilities();
		initDriver(getCapabilities());
	}
	
	
	private void initCapabilities() {
		//Set Desired Capabilities
				caps = new DesiredCapabilities();
//				caps.setCapability("platformName",DesiredCapabilities.android());
				caps.setCapability("newCommandTimeout","60");
				caps.setCapability("platformName","Android");
				caps.setCapability("plateformVersion","8.1");
				caps.setCapability("deviceName","emulator-5554");
				caps.setCapability("app","/home/dipak/Android/Sdk/platform-tools/THSigned.apk");
				caps.setCapability("appPackage","com.mobstac.thehindu");
				//caps.setCapability("appActivity","com.mobstac.thehindu.activity.InitialSetupActivity");
				//caps.setCapability("browserName", "");
				caps.setCapability(CapabilityType.BROWSER_NAME,"");
				caps.setCapability("deviceOrientation","Portrait");
				//caps.setCapability("appWaitActivity","SplashActivity");
				
//				caps.setCapability("automationName","UiAutomator2");
				
				
	}
	
	
	
	private void initDriver(DesiredCapabilities caps) {
		try {
			driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public DesiredCapabilities getCapabilities() {
		return caps;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	

}

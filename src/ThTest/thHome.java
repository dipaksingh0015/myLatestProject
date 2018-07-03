package thHome;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class thHome {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = null;
		
		//Set Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("plateformName","Android");
		caps.setCapability("plateformVersion","8.1");
		caps.setCapability("deviceName","emulator-5554");
		caps.setCapability("app","/home/dipak/Android/Sdk/platform-tools/THSigned.apk");
		caps.setCapability("appPackage","com.mobstac.thehindu");
		caps.setCapability("appActivity","com.mobstac.thehindu.activity.InitialSetupActivity");
		caps.setCapability("browserName", "");
		//caps.setCapability(CapabilityType.BROWSER_NAME,"");
		caps.setCapability("deviceOrientation","Portrait");
		caps.setCapability("appWaitActivity","SplashActivity");
		
		
	try {
		  driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}



package ThTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class thHome {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = null;
		
		//Set Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("plateformName", "Android");
		caps.setCapability("plateformVersion", "8.1");
		caps.setCapability("deviceName", "Nexus5X");
		caps.setCapability("appPackage", "");
		caps.setCapability("appActivity", "");
		caps.setCapability("browserName", "");
		caps.setCapability("deviceOrientation", "Portrait");
		
		try {
		  driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), caps);
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}

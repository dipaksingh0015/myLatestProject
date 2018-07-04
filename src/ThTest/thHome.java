package thHome;

import java.net.MalformedURLException;
import java.net.URL;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class thHome {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = null;
		
		//Set Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setCapability("platformName",DesiredCapabilities.android());
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
		
		
	try {
		  driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Thread.sleep(5000);
		
		driver.findElement(By.id("com.mobstac.thehindu:id/button_feed_save")).click();
		driver.findElement(By.id("com.mobstac.thehindu:id/button_feed_save")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.mobstac.thehindu:id/home_layout")).click();
		driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner")).click();
		driver.findElement(By.id("com.mobstac.thehindu:id/action_speak")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("com.mobstac.thehindu:id/action_speak")).click();
		driver.findElement(By.id("com.mobstac.thehindu:id/action_bookmarks")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.mobstac.thehindu:id/action_bookmarks")).click();
		driver.findElement(By.id("com.mobstac.thehindu:id/action_textsize")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.mobstac.thehindu:id/action_textsize")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.mobstac.thehindu:id/action_share_article")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/contentPanel")).click();
		driver.findElement(By.id("android.widget.ImageButton")).click();
		
		
		
		
	}

}



package testNG;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/*import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homeScreenTest {
	 WebDriver driver;
//	 AndroidDriver driver;
	 
	 
  @Test
  public void homeScreen() throws InterruptedException {
	  
	        driver.findElement(By.id("com.mobstac.thehindu:id/button_feed_save")).click();
			driver.findElement(By.id("com.mobstac.thehindu:id/button_feed_save")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.mobstac.thehindu:id/home_layout")).click();
			Thread.sleep(3000);
            boolean isElementPresent = driver.findElements(By.id("com.mobstac.thehindu:id/adParentLayout")).size() != 0;
            Assert.assertTrue(isElementPresent, "element is present");
            System.out.println("Ads is present on home screen");
            
  }
            
 
@Test
public void articleDetails() throws InterruptedException {
	
	driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner")).click();
	//driver.findElement(By.id("com.mobstac.thehindu:id/textview_banner")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.mobstac.thehindu:id/article_layout")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.mobstac.thehindu:id/action_speak")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("com.mobstac.thehindu:id/action_speak")).click();
	driver.findElement(By.id("com.mobstac.thehindu:id/action_bookmarks")).click();
	Thread.sleep(2000);
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
  
  @Test
  public void scrollPage () throws InterruptedException {
	  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	 
		
		//Set Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
	   //caps.setCapability("platformName",DesiredCapabilities.android());
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
//		 driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		 driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}

package hindu;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ThTestNg {
	WebDriver driver = null;
//	AndroidDriver driver;
	DesiredCapabilities caps;
	
@BeforeTest

public void SetUp() {
	
			caps = new DesiredCapabilities();
            caps.setCapability("newCommandTimeout","60");
			caps.setCapability("platformName","Android");
			caps.setCapability("plateformVersion","8.1");
			caps.setCapability("deviceName","emulator-5554");
//			caps.setCapability("deviceName", "ZY223HQPPM");
			caps.setCapability("app","/home/dipak/Android/TH_Signed.apk");
			caps.setCapability("appPackage","com.mobstac.thehindu");
//			caps.setCapability("appActivity","com.mobstac.thehindu.activity.InitialSetupActivity");			
			caps.setCapability(CapabilityType.BROWSER_NAME,"");
			caps.setCapability("deviceOrientation","Portrait");
			
			try {
				  driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				} catch(MalformedURLException e) {
					e.printStackTrace();
				}
			
   }

@Test

public void HomeScreen() throws InterruptedException {
	driver.findElement(By.id("com.mobstac.thehindu:id/button_feed_save")).click();
	driver.findElement(By.id("com.mobstac.thehindu:id/button_feed_save")).click();
	Thread.sleep(6000);		
	driver.findElement(By.id("com.mobstac.thehindu:id/home_layout")).click();
	
   }

@test

public void FirstArticleClick() throws InterruptedException {
	WebDriverWait wait= new WebDriverWait(driver,50);
	

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.mobstac.thehindu:id/imageview_banner")));
	driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner")).click();
	
	driver.findElement(By.id("com.mobstac.thehindu:id/article_layout")).click();
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
	driver.findElement(By.id("com.mobstac.thehindu:id/action_comment")).click();
	Thread.sleep(5000);
	driver.findElement(By.className("android.widget.ImageButton")).click();
	
	driver.findElement(By.id("com.mobstac.thehindu:id/action_share_article")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("android:id/button2")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("android.widget.ImageButton")).click();
	
}

@test

public void verifyFirstWidget() {
	/*MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
			"new UiScrollable(new UiSelector().resourceId(\"com.mobstac.thehindu:id/textview_widget_title")
			).getChildByText("new UiSelector().className(\"android.widget.TextView\"), \"News In Quotes\")");
	
element.click();*/
	
	String text = "News In Quotes";
	driver.findElement(MobileBy
	                    .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
	                            + "new UiSelector().text(\""+text+"\"));"));
	
 }


}

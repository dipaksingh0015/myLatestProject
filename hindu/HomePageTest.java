package hindu;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;



public class HomePageTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		DesiredCapabilities caps;
		
		//Set Desired Capabilities
		caps = new DesiredCapabilities();
//		caps.setCapability("platformName",DesiredCapabilities.android());
		caps.setCapability("newCommandTimeout","60");
		caps.setCapability("platformName","Android");
//		caps.setCapability("plateformVersion","7.0");
		caps.setCapability("plateformVersion","8.1");
		caps.setCapability("deviceName","emulator-5554");
//		caps.setCapability("deviceName", "ZY223HQPPM");
		caps.setCapability("app","/home/dipak/Android/TH_Signed.apk");
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
				
			
			
			driver.findElement(By.id("com.mobstac.thehindu:id/button_feed_save")).click();
			driver.findElement(By.id("com.mobstac.thehindu:id/button_feed_save")).click();
			Thread.sleep(6000);		
			
			driver.findElement(By.id("com.mobstac.thehindu:id/home_layout")).click();
//			Thread.sleep(6000);
			
			String text = "News In Quotes";
			driver.findElement(MobileBy
			                    .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
			                            + "new UiSelector().text(\""+text+"\"));"));
			
			
			/*driver.findElement(By.xpath("//android.widget.TextView[@text='National']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("com.mobstac.thehindu:id/textview_article_list_header")).click();*/
			
//			driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner")).click();
			
			WebDriverWait wait= new WebDriverWait(driver,50);
			
//			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner"))));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.mobstac.thehindu:id/imageview_banner")));
			driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner")).click();
			
//		    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("com.mobstac.thehindu:id/textview_banner"))));
			
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner"))).click().perform();
			
//			driver.findElement(By.id("com.mobstac.thehindu:id/textview_banner")).click();
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
			Thread.sleep(2000);
			driver.findElement(By.id("android.widget.ImageButton")).click();
			Thread.sleep(5000);
			
		
			
			
		}
}
		

		



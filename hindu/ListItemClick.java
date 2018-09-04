package hindu;

//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListItemClick {
	
private WebDriver driver;
	
	public ListItemClick(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
//	public void listItemClick() {
//		System.out.println("Size :: Started");
//		List profile = driver.findElements(By.xpath("//android.view.ViewGroup"));
//		System.out.println("Size :: "+profile.size());
//	}
	
	
	
	public void listItemClick() {
		System.out.println("Size :: Started");
		
		WebDriverWait wait= new WebDriverWait(driver,20,100);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner"))));
		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner"))).click().perform();
		driver.findElement(By.id("com.mobstac.thehindu:id/imageview_banner")).click();
		
		System.out.println("Size :: DONE");
		
	}

}

package hindu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewClickAction {
	
	private WebDriver driver;
	
	public ViewClickAction(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clickAction(String viewResId) {
		driver.findElement(By.id(viewResId)).click();
		
		System.out.println("Clicked Res Id is :: "+ viewResId);
	}
	
	
	public void clickActionWithDelay(String viewResId) {
		driver.findElement(By.id(viewResId)).click();
		
		System.out.println("Clicked Delay Res Id is :: "+ viewResId);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void clickActionWithDelay(String viewResId, long delayTime) {
		driver.findElement(By.id(viewResId)).click();
		
		System.out.println("Clicked Delay Res Id is :: "+ viewResId);
		try {
			Thread.sleep(delayTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

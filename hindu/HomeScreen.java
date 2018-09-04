package hindu;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class HomeScreen {
	
	
	
  public static void main(String[] args) throws Exception {
	  
	  	// Initializing 
	  	StartUpComponents startUpComponents = new StartUpComponents();
//		DesiredCapabilities caps = startUpComponents.getCapabilities();
		WebDriver driver = startUpComponents.getDriver();
		
		ViewClickAction clickAction = new ViewClickAction(driver);
		
		ListItemClick listItemCLick = new ListItemClick(driver);
		
		clickAction.clickAction("com.mobstac.thehindu:id/button_feed_save");
		clickAction.clickActionWithDelay("com.mobstac.thehindu:id/button_feed_save");
		clickAction.clickAction("com.mobstac.thehindu:id/home_layout");
		
		listItemCLick.listItemClick();
		
  }
  
}




	





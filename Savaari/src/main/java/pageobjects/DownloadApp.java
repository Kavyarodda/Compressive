package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUI.AppUI;

public class DownloadApp extends AppUI {
	WebDriver driver;
	
	public DownloadApp(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Download(){
		 
      return  driver.findElement(download);
    }
	public WebElement Wishlist(){
		 
	      return  driver.findElement(wishlist);
	    }
	

}

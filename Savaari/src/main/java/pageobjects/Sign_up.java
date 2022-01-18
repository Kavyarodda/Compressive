package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUI.AppUI;

public class Sign_up extends AppUI {
	WebDriver driver;
	
	public Sign_up(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Signup(){
		 
      return  driver.findElement(sign);
    }
	
	public WebElement Email(){
		 
	      return  driver.findElement(email);
	    }
	public WebElement Password(){
		 
	      return  driver.findElement(password);
	    }
	public  WebElement Login(){
		 
	     return  driver.findElement(log);
	    }


}

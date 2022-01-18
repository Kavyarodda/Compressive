package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUI.AppUI;

public class Airport  extends AppUI {
	WebDriver driver;
	
	public Airport(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Airport_select(){
		 
	      return  driver.findElement(Airport);
	    }
	
	public WebElement FromCity(){
		 
      return  driver.findElement(fromplace);
    }
	
	public WebElement Trip(){
		 
	      return  driver.findElement(trip);
	    }
	
	public WebElement Pickup(){
		 
	      return  driver.findElement(pick);
	    }
		
	
	public WebElement Selectcar(){
		 
	      return  driver.findElement(selectone);
	    }
	
	public WebElement Select(){
		 
	      return  driver.findElement(selectcar);
	    }
	public String Price(){
		 
	      return  driver.findElement(price).getText();
	    }
	
	

}

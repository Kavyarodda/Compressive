package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUI.AppUI;

public class Round_trip_price  extends AppUI {
	WebDriver driver;
	
	public Round_trip_price(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Roundtrip(){
		 
	      return  driver.findElement(roundtrip);
	    }
	
	public WebElement FromCity(){
		 
      return  driver.findElement(fromplace);
    }
	public WebElement ToCity(){
		 
	      return  driver.findElement(toplace);
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

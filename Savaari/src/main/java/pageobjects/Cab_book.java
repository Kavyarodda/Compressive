package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUI.AppUI;

public class Cab_book extends AppUI {
	WebDriver driver;
	
	public Cab_book(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Cab_text(){
		 
      return  driver.findElement(cab);
    }
	
	public String Heading(){
		 
	      return  driver.findElement(heading).getText();
	    }
}

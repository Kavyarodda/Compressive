package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUI.AppUI;


public class Contact_Us  extends AppUI {
	WebDriver driver;
	public String expectednum = "info@savaari.com";
	
	public Contact_Us(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Contacting(){
		 
      return  driver.findElement(cap);
    }
	
	public String Number(){

	       return  driver.findElement(number).getText();
	    }
}

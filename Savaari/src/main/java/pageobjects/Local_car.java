package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUI.AppUI;

public class Local_car extends AppUI {
	WebDriver driver;
	
	public Local_car(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Local(){
		 
      return  driver.findElement(Local);
    }
	public WebElement Selectcity(){
		 
	      return  driver.findElement(fromplace);
	    }
	
	public WebElement Selectcar(){
		 
	      return  driver.findElement(selectone);
	    }
	
	public WebElement Select(){
		 
	      return  driver.findElement(selectcar);
	    }
	
	public String Cartype(){
		 
	      return  driver.findElement(Localcartype).getText();
	    }


}

package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUI.AppUI;

public class Car_one_way extends AppUI {
	WebDriver driver;
	
	public Car_one_way(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement FromCity(){
		 
      return  driver.findElement(fromone);
    }
	public WebElement ToCity(){
		 
	      return  driver.findElement(Toplaceone);
	    }
	
	public WebElement Selectcar(){
		 
	      return  driver.findElement(selectone);
	    }
	
	public WebElement Select(){
		 
	      return  driver.findElement(selectcar);
	    }
	
	public String Cartype(){
		 
	      return  driver.findElement(cartype).getText();
	    }


}

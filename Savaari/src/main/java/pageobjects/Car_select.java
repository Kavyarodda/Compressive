package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appUI.AppUI;

public class Car_select  extends AppUI {
	WebDriver driver;
	
	public Car_select(WebDriver driver) {
		this.driver= driver;
	}
	
	public WebElement Fromcity(){
		 
      return  driver.findElement(from);
    }
	public WebElement Tocity(){
		 
	      return  driver.findElement(Toplace);
	    }
	public WebElement Select(){
		 
	      return  driver.findElement(select);
	    }
}

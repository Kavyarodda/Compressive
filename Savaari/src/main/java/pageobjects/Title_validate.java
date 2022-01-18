package pageobjects;

import org.openqa.selenium.WebDriver;

import appUI.AppUI;


public class Title_validate extends AppUI {
	WebDriver driver;
	public String expectedtitle="Book Outstation Cabs, Local & Airport Taxi Service - India's Leading Car Rentals";
	public Title_validate(WebDriver driver) {
		this.driver= driver;
	}
	
}

package appUI;

import org.openqa.selenium.By;

public class AppUI {
	
	public By cap =By.xpath(".//*[@href='/contact-us']");
	public By number =By.className("contactUsLink");
	public By download = By.xpath("//*[@id='sv_header']/div/div[3]/div/a[1]/div");
	public By wishlist = By.xpath("//span[@class='O53zde vaqewe']");
	
	
	public By sign = By.xpath("//*[@class='bg-signin m-auto']");
	public By email = By.xpath("//input[@placeholder='Email']");
	public By password = By.xpath("//input[@placeholder='Password']");
	public By log =By.xpath(".//*[@class='hori-vertical-center']");
	
	
	public By from = By.id("fromCityList");
	public By Toplace = By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']");
	public By select = By.xpath("//*[@class='book-button btn']");
	
	//public By cab = By.xpath("//*[@href='https://www.savaari.com/mobile-app']");
	public By cab = By.linkText("cab booking app");
	public By heading = By.xpath("//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-download-app/div/div/div/div/div[2]/div[1]/div[1]/h1");
	
	public By fromone = By.id("fromCityList");
	public By Toplaceone = By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']");
	public By selectone = By.xpath("//*[@class='book-button btn']");
	public By selectcar = By.xpath("//*[@class='select-button ng-star-inserted']");
	public By cartype = By.xpath("//*[@id='static-1']/div/div/div[3]/div[2]/div");
	
	public By roundtrip = By.id("out_radio");
	public By fromplace = By.id("fromCityList");
	public By toplace = By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']");
	public By selecting = By.xpath("//*[@class='book-button btn']");
	public By selectCar = By.xpath("//*[@class='select-button ng-star-inserted']");
	public By price = By.xpath("//*[@class='discountPrice']");
	
	public By Local = By.xpath("//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[1]/div[2]/a");
	public By Localcartype = By.xpath("//*[@id='static-1']/div/div/div[4]/div[2]/div");
	
	public By Airport = By.xpath("//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[1]/div[3]/a/span");
	public By trip = By.xpath("//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[2]/div/select");
	public By pick = By.id("search_places");
}




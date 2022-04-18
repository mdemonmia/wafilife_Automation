package pages;

import org.openqa.selenium.WebDriver;

import model.Locators;

public class HomePage {
	public static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		HomePage.driver=driver;
	}
	public String Homepage() {
		return Locators.homepageurl;
	}
}

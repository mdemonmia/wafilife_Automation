package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	
	@BeforeSuite
		public static WebDriver setup() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			return driver;
	}
	@AfterSuite
	public void teardown() {
		driver.close();
	}
}

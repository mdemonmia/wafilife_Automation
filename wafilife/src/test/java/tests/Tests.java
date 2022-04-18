package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;
import pages.HomePage;

public class Tests {
	public static Base base=new Base();
	public static WebDriver driver=Base.setup();
	public static CommonMethods commonMethods=new CommonMethods(driver);
	public static HomePage homepage=new HomePage(driver);
	
	@BeforeClass
	public static void Start() {
		driver.get(homepage.Homepage());
		driver.manage().window().maximize();
	}
	
	@Test
	public static  void testcase() throws InterruptedException {
		commonMethods.clickonButton(Locators.writer);
		commonMethods.clickonButton(Locators.nxtoption);
		commonMethods.clickonButton(Locators.anisul_haque);
		commonMethods.clickonButton(Locators.sundorbon);
		commonMethods.clickonButton(Locators.order);
		commonMethods.timeout();
		commonMethods.timeout();
		commonMethods.timeout();
		commonMethods.clickonButton(Locators.order_complete);
		
		commonMethods.timeout();
       // window_Handle();
		commonMethods.sendText(Locators.Name,"Md.Emon Mia");
		commonMethods.sendText(Locators.Phone_Number,"01713682038");
		commonMethods.sendText(Locators.Email,"Efplhuda@gmail.com");
		commonMethods.clickonButton(Locators.District);
		commonMethods.timeout();
		commonMethods.timeout();
		commonMethods.clickonButton(Locators.District_Name);
		
		//Select Area
		WebElement Area=driver.findElement(By.xpath("//select[@id='billing_area']"));
		Select selectArea=new Select(Area);
		selectArea.selectByIndex(8);
		commonMethods.timeout();
		
		commonMethods.sendText(Locators.Address,"Nikunjo-2,Khilkhet,Dhaka");
		commonMethods.clickonButton(Locators.checkbox);
		commonMethods.timeout();
		base.teardown();
	}
	
	   
	
}


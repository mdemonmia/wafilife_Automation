package model;

/*
import java.util.Iterator;
import java.util.Set;
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class CommonMethods{
	public static  WebDriver driver;
	public CommonMethods(WebDriver driver) {
		CommonMethods.driver=driver;
	}
	
	// getTtile
	public static String getTitle() {
		return driver.getTitle();
	}
	
	//gettext
	public static String getText(By element) {
		return driver.findElement(element).getText();
	}
	
	//clickButton
	public void  clickonButton(By Btn) {
		driver.findElement(Btn).click();
	}
	//sendkeys
	public void sendText(By element,String value) {
		driver.findElement(element).sendKeys(value);
	}
	
/*
  public void window_Handle() {
 
		String parent=driver.getWindowHandle();
		commonMethods.clickonButton(Locators.order);
		Thread.sleep(3000);
		Set <String> s =driver.getWindowHandles();
		Iterator <String> I1=s.iterator();

		while(I1.hasNext()) {
			String child_window=I1.next();
			if(!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				commonMethods.clickonButton(Locators.order_complete);
				driver.close();
			}
		}
		
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		
		}
*/
	
	
	 
	//timeout
	public void timeout() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

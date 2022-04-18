package model;

import org.openqa.selenium.By;

public class Locators {
	public static String homepageurl="https://www.wafilife.com/";
	
	
	
	public static By writer=By.xpath("//span[contains(text(),'লেখক')]");
	public static By nxtoption=By.xpath("//a[contains(text(),'→')]");
	public static By anisul_haque=By.xpath("//h3[contains(text(),'Anisul Hoque')]");
	public static By sundorbon=By.xpath("//a[contains(text(),'Sundarbon')]");
	public static By order=By.xpath("//button[@class='single_add_to_cart_button button alt ']");
	public static By order_complete=By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
	public static By Name=By.xpath("//input[@id='billing_first_name']");
	public static By Phone_Number=By.xpath("//input[@id='billing_phone']");
	public static By Email=By.xpath("//input[@id='billing_email']");
	public static By District=By.xpath("//span[@id='select2-billing_state-container']");
	public static By District_Name=By.xpath("//span[@id='select2-billing_state-container']");
	
	
	public static By Address=By.xpath("//textarea[@id='billing_address_1']");
	public static By checkbox=By.xpath("//input[@id='ship-to-different-address-checkbox']");
}

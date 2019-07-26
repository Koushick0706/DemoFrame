package org.cucumber.objects;

import org.openqa.selenium.By;

public class Flipkart {
	
	public static final By LOGINANDSIGNUP = By.linkText("Login & Signup");
	public static final By USERNAME = By.name("(//input[@type='text'])[2]");
	public static final By PASSWORD = By.name("//input[@type='password']");
	public static final By LOGINBUTTON = By.xpath("(//button[@type='submit'])[2]");
	public static final By SEARCHBAR = By.xpath("//input[@title='Search for products, brands and more']");
	public static final By ERRORMESSAGE = By.xpath("//span[@class='ZAtlA-']");

}

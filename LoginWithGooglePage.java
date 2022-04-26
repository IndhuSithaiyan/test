package com.zigwheels.pages;

import org.openqa.selenium.By;

public class LoginWithGooglePage {

	public static By LoginButton = By.id("des_lIcon");
	public static By ContinueWithGoogle = By.xpath("//div[@id='googleSignIn']");
	public static By EmailTextbox = By.name("identifier");
	public static By NextButton = By.xpath("//span[contains(text(),'Next')]");
	public static By ErrorMessage = By.xpath("//div[@class='o6cuMc']");
	
}

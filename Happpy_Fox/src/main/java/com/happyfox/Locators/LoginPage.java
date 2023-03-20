package com.happyfox.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.happyfox.Baseclass.Baseclass;

public class LoginPage extends Baseclass{

	public LoginPage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "img[alt='HappyFox Logo']")
	public WebElement happyFox_logo;
	
	@FindBy(id = "id_username")
	public WebElement Username;
	
	@FindBy(id = "id_password")
	public WebElement Password;
	
	@FindBy(css = "input[value='Login']")
	public WebElement Login_btn;
	
	
	
}
